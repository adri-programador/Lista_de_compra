package com.application.app.modules.productoscategoria.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.productoscategoria.`data`.model.ProductosCategoria1RowModel
import com.application.app.modules.productoscategoria.`data`.model.ProductosCategoriaModel
import kotlin.collections.MutableList

public class ProductosCategoriaVM : ViewModel() {
  public val productosCategoriaModel: MutableLiveData<ProductosCategoriaModel> =
      MutableLiveData(ProductosCategoriaModel())

  public var navArguments: Bundle? = null

  public val recyclerProductosCategoriaList:
      MutableLiveData<MutableList<ProductosCategoria1RowModel>> = MutableLiveData(mutableListOf())
}
