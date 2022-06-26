package com.application.app.modules.productoscategoria.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ProductosCategoria1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNaranjasDeSic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_naranjas_de_sic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNaranjas: String? = MyApp.getInstance().resources.getString(R.string.lbl_naranjas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt230: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
