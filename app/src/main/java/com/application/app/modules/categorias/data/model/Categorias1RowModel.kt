package com.application.app.modules.categorias.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Categorias1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFruta: String? = MyApp.getInstance().resources.getString(R.string.lbl_fruta)

)
