package com.application.app.modules.categorias3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityCategorias3Binding
import com.application.app.modules.categorias3.`data`.viewmodel.Categorias3VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class Categorias3Activity :
    BaseActivity<ActivityCategorias3Binding>(R.layout.activity_categorias3) {
  private val viewModel: Categorias3VM by viewModels<Categorias3VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.categorias3VM = viewModel
    val adapter = Categorias3ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup65.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup21,binding.viewPagerGroup65) { tab, position ->
      tab.text = Categorias3ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "CATEGORIAS3ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Categorias3Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
