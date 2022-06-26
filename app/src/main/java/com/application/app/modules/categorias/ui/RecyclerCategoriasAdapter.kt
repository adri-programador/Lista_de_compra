package com.application.app.modules.categorias.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowCategorias1Binding
import com.application.app.modules.categorias.`data`.model.Categorias1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerCategoriasAdapter(
  public var list: List<Categorias1RowModel>
) : RecyclerView.Adapter<RecyclerCategoriasAdapter.RowCategorias1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCategorias1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_categorias1,parent,false)
    return RowCategorias1VH(view)
  }

  public override fun onBindViewHolder(holder: RowCategorias1VH, position: Int): Unit {
    val categorias1RowModel = Categorias1RowModel()
    // TODO uncomment following line after integration with data source
    // val categorias1RowModel = list[position]
    holder.binding.categorias1RowModel = categorias1RowModel
  }

  public override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Categorias1RowModel>): Unit {
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
      item: Categorias1RowModel
    ): Unit {
    }
  }

  public inner class RowCategorias1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCategorias1Binding = RowCategorias1Binding.bind(itemView)
  }
}
