package com.application.app.modules.pantalladebienvenida.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPantallaDeBienvenidaBinding
import com.application.app.modules.pantalladebienvenida.`data`.viewmodel.PantallaDeBienvenidaVM
import kotlin.String
import kotlin.Unit

public class PantallaDeBienvenidaActivity :
    BaseActivity<ActivityPantallaDeBienvenidaBinding>(R.layout.activity_pantalla_de_bienvenida) {
  private val viewModel: PantallaDeBienvenidaVM by viewModels<PantallaDeBienvenidaVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.pantallaDeBienvenidaVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "PANTALLA_DE_BIENVENIDA_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PantallaDeBienvenidaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
