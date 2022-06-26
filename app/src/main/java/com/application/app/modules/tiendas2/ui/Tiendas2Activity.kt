package com.application.app.modules.tiendas2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTiendas2Binding
import com.application.app.modules.tiendas2.`data`.viewmodel.Tiendas2VM
import kotlin.String
import kotlin.Unit

public class Tiendas2Activity : BaseActivity<ActivityTiendas2Binding>(R.layout.activity_tiendas2) {
  private val viewModel: Tiendas2VM by viewModels<Tiendas2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.tiendas2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "TIENDAS2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Tiendas2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
