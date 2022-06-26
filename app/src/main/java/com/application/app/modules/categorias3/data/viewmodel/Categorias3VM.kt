package com.application.app.modules.categorias3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.categorias3.`data`.model.Categorias3Model

public class Categorias3VM : ViewModel() {
  public val categorias3Model: MutableLiveData<Categorias3Model> =
      MutableLiveData(Categorias3Model())

  public var navArguments: Bundle? = null
}
