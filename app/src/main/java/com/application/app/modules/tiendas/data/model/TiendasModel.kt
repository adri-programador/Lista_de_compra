package com.application.app.modules.tiendas.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TiendasModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTiendas: String? = MyApp.getInstance().resources.getString(R.string.lbl_tiendas)

)
