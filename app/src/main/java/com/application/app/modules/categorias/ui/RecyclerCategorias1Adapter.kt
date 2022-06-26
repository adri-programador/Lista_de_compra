package com.application.app.modules.categorias.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowCategorias2Binding
import com.application.app.modules.categorias.`data`.model.Categorias2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerCategorias1Adapter(
  public var list: List<Categorias2RowModel>
) : RecyclerView.Adapter<RecyclerCategorias1Adapter.RowCategorias2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCategorias2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_categorias2,parent,false)
    return RowCategorias2VH(view)
  }

  public override fun onBindViewHolder(holder: RowCategorias2VH, position: Int): Unit {
    val categorias2RowModel = Categorias2RowModel()
    // TODO uncomment following line after integration with data source
    // val categorias2RowModel = list[position]
    holder.binding.categorias2RowModel = categorias2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Categorias2RowModel>): Unit {
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
      item: Categorias2RowModel
    ): Unit {
    }
  }

  public inner class RowCategorias2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCategorias2Binding = RowCategorias2Binding.bind(itemView)
  }
}
