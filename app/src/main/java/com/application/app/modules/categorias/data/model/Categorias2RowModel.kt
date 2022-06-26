package com.application.app.modules.categorias.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Categorias2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBebidas: String? = MyApp.getInstance().resources.getString(R.string.lbl_bebidas)

)
