package com.application.app.modules.tiendas2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tiendas2.`data`.model.Tiendas2Model

public class Tiendas2VM : ViewModel() {
  public val tiendas2Model: MutableLiveData<Tiendas2Model> = MutableLiveData(Tiendas2Model())

  public var navArguments: Bundle? = null
}
