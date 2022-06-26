package com.application.app.modules.tiendas.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowTiendas1Binding
import com.application.app.modules.tiendas.`data`.model.Tiendas1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerTiendasAdapter(
  public var list: List<Tiendas1RowModel>
) : RecyclerView.Adapter<RecyclerTiendasAdapter.RowTiendas1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTiendas1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tiendas1,parent,false)
    return RowTiendas1VH(view)
  }

  public override fun onBindViewHolder(holder: RowTiendas1VH, position: Int): Unit {
    val tiendas1RowModel = Tiendas1RowModel()
    // TODO uncomment following line after integration with data source
    // val tiendas1RowModel = list[position]
    holder.binding.tiendas1RowModel = tiendas1RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tiendas1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Tiendas1RowModel
    ): Unit {
    }
  }

  public inner class RowTiendas1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowTiendas1Binding = RowTiendas1Binding.bind(itemView)
  }
}
