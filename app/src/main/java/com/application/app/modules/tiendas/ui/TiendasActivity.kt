package com.application.app.modules.tiendas.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTiendasBinding
import com.application.app.modules.tiendas.`data`.model.Tiendas1RowModel
import com.application.app.modules.tiendas.`data`.viewmodel.TiendasVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class TiendasActivity : BaseActivity<ActivityTiendasBinding>(R.layout.activity_tiendas) {
  private val viewModel: TiendasVM by viewModels<TiendasVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerTiendasAdapter =
    RecyclerTiendasAdapter(viewModel.recyclerTiendasList.value?:mutableListOf())
    binding.recyclerTiendas.adapter = recyclerTiendasAdapter
    recyclerTiendasAdapter.setOnItemClickListener(
    object : RecyclerTiendasAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tiendas1RowModel) {
        onClickRecyclerTiendas(view, position, item)
      }
    }
    )
    viewModel.recyclerTiendasList.observe(this) {
      recyclerTiendasAdapter.updateData(it)
    }
    binding.tiendasVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerTiendas(
    view: View,
    position: Int,
    item: Tiendas1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "TIENDAS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TiendasActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
