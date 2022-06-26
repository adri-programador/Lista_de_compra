package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTiendas: String? = MyApp.getInstance().resources.getString(R.string.lbl_tiendas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPantallaDeBienvenida: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pantalla_de_bie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTiendas1: String? = MyApp.getInstance().resources.getString(R.string.lbl_tiendas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategorias: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_categorias)

)
