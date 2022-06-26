package com.application.app.modules.productoscategoria.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowProductosCategoria1Binding
import com.application.app.modules.productoscategoria.`data`.model.ProductosCategoria1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerProductosCategoriaAdapter(
  public var list: List<ProductosCategoria1RowModel>
) : RecyclerView.Adapter<RecyclerProductosCategoriaAdapter.RowProductosCategoria1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowProductosCategoria1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_productos_categoria1,parent,false)
    return RowProductosCategoria1VH(view)
  }

  public override fun onBindViewHolder(holder: RowProductosCategoria1VH, position: Int): Unit {
    val productosCategoria1RowModel = ProductosCategoria1RowModel()
    // TODO uncomment following line after integration with data source
    // val productosCategoria1RowModel = list[position]
    holder.binding.productosCategoria1RowModel = productosCategoria1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProductosCategoria1RowModel>): Unit {
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
      item: ProductosCategoria1RowModel
    ): Unit {
    }
  }

  public inner class RowProductosCategoria1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProductosCategoria1Binding = RowProductosCategoria1Binding.bind(itemView)
  }
}
