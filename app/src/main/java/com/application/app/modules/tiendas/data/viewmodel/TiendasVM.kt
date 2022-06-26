package com.application.app.modules.tiendas.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tiendas.`data`.model.Tiendas1RowModel
import com.application.app.modules.tiendas.`data`.model.TiendasModel
import kotlin.collections.MutableList

public class TiendasVM : ViewModel() {
  public val tiendasModel: MutableLiveData<TiendasModel> = MutableLiveData(TiendasModel())

  public var navArguments: Bundle? = null

  public val recyclerTiendasList: MutableLiveData<MutableList<Tiendas1RowModel>> =
      MutableLiveData(mutableListOf())
}
