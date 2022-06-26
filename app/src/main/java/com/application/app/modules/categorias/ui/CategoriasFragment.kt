package com.application.app.modules.categorias.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentCategoriasBinding
import com.application.app.modules.categorias.`data`.model.Categorias1RowModel
import com.application.app.modules.categorias.`data`.model.Categorias2RowModel
import com.application.app.modules.categorias.`data`.viewmodel.CategoriasVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CategoriasFragment :
    BaseFragment<FragmentCategoriasBinding>(R.layout.fragment_categorias) {
  private val viewModel: CategoriasVM by viewModels<CategoriasVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerCategoriasAdapter =
    RecyclerCategoriasAdapter(viewModel.recyclerCategoriasList.value?:mutableListOf())
    binding.recyclerCategorias.adapter = recyclerCategoriasAdapter
    recyclerCategoriasAdapter.setOnItemClickListener(
    object : RecyclerCategoriasAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Categorias1RowModel) {
        onClickRecyclerCategorias(view, position, item)
      }
    }
    )
    viewModel.recyclerCategoriasList.observe(requireActivity()) {
      recyclerCategoriasAdapter.updateData(it)
    }
    val recyclerCategorias1Adapter =
    RecyclerCategorias1Adapter(viewModel.recyclerCategorias1List.value?:mutableListOf())
    binding.recyclerCategorias1.adapter = recyclerCategorias1Adapter
    recyclerCategorias1Adapter.setOnItemClickListener(
    object : RecyclerCategorias1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Categorias2RowModel) {
        onClickRecyclerCategorias1(view, position, item)
      }
    }
    )
    viewModel.recyclerCategorias1List.observe(requireActivity()) {
      recyclerCategorias1Adapter.updateData(it)
    }
    binding.categoriasVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerCategorias(
    view: View,
    position: Int,
    item: Categorias1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerCategorias1(
    view: View,
    position: Int,
    item: Categorias2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "CATEGORIAS_FRAGMENT"
  }
}
