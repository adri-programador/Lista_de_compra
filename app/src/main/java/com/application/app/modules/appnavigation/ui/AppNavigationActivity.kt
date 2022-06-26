package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.categorias3.ui.Categorias3Activity
import com.application.app.modules.pantalladebienvenida.ui.PantallaDeBienvenidaActivity
import com.application.app.modules.tiendas.ui.TiendasActivity
import com.application.app.modules.tiendas2.ui.Tiendas2Activity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearTiendas1.setOnClickListener {
      val destIntent = Tiendas2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCategorias.setOnClickListener {
      val destIntent = Categorias3Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPantallaDeBienvenida.setOnClickListener {
      val destIntent = PantallaDeBienvenidaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTiendas.setOnClickListener {
      val destIntent = TiendasActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
