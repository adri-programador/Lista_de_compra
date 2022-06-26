package com.application.app.modules.tiendas2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Tiendas2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMenu: String? = MyApp.getInstance().resources.getString(R.string.lbl_menu)

)
