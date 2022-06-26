package com.application.app.modules.categorias.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.categorias.`data`.model.Categorias1RowModel
import com.application.app.modules.categorias.`data`.model.Categorias2RowModel
import com.application.app.modules.categorias.`data`.model.CategoriasModel
import kotlin.collections.MutableList

public class CategoriasVM : ViewModel() {
  public val categoriasModel: MutableLiveData<CategoriasModel> = MutableLiveData(CategoriasModel())

  public var navArguments: Bundle? = null

  public val recyclerCategoriasList: MutableLiveData<MutableList<Categorias1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerCategorias1List: MutableLiveData<MutableList<Categorias2RowModel>> =
      MutableLiveData(mutableListOf())
}
