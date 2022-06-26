package com.application.app.modules.categorias3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Categorias3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMercadona: String? = MyApp.getInstance().resources.getString(R.string.lbl_mercadona)

)
