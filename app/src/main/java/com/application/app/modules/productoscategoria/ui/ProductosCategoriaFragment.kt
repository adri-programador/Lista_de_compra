package com.application.app.modules.productoscategoria.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentProductosCategoriaBinding
import com.application.app.modules.productoscategoria.`data`.model.ProductosCategoria1RowModel
import com.application.app.modules.productoscategoria.`data`.viewmodel.ProductosCategoriaVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProductosCategoriaFragment :
    BaseFragment<FragmentProductosCategoriaBinding>(R.layout.fragment_productos_categoria) {
  private val viewModel: ProductosCategoriaVM by viewModels<ProductosCategoriaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerProductosCategoriaAdapter =
    RecyclerProductosCategoriaAdapter(viewModel.recyclerProductosCategoriaList.value?:mutableListOf())
    binding.recyclerProductosCategoria.adapter = recyclerProductosCategoriaAdapter
    recyclerProductosCategoriaAdapter.setOnItemClickListener(
    object : RecyclerProductosCategoriaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductosCategoria1RowModel) {
        onClickRecyclerProductosCategoria(view, position, item)
      }
    }
    )
    viewModel.recyclerProductosCategoriaList.observe(requireActivity()) {
      recyclerProductosCategoriaAdapter.updateData(it)
    }
    binding.productosCategoriaVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerProductosCategoria(
    view: View,
    position: Int,
    item: ProductosCategoria1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PRODUCTOS_CATEGORIA_FRAGMENT"
  }
}
