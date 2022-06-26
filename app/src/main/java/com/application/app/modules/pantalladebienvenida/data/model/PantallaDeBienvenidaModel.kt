package com.application.app.modules.pantalladebienvenida.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class PantallaDeBienvenidaModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCREARCUENTA: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_crear_cuenta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtINICIARSESION: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_iniciar_sesion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuperDeli: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_super_deli)

)
