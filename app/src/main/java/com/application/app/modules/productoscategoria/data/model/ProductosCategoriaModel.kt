package com.application.app.modules.productoscategoria.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ProductosCategoriaModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGoldKg1: String? = MyApp.getInstance().resources.getString(R.string.lbl_gold_kg_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManzanas: String? = MyApp.getInstance().resources.getString(R.string.lbl_manzanas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt198: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_98)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
