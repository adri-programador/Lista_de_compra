package com.application.app.modules.pantalladebienvenida.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.pantalladebienvenida.`data`.model.PantallaDeBienvenidaModel

public class PantallaDeBienvenidaVM : ViewModel() {
  public val pantallaDeBienvenidaModel: MutableLiveData<PantallaDeBienvenidaModel> =
      MutableLiveData(PantallaDeBienvenidaModel())

  public var navArguments: Bundle? = null
}
