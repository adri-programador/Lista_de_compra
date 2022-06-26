package com.application.app.modules.categorias3.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import com.application.app.modules.categorias.ui.CategoriasFragment
import com.application.app.modules.productoscategoria.ui.ProductosCategoriaFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class Categorias3ActivityPagerAdapter(
    public val fragmentManager: FragmentManager,
    public val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    public override fun getItemCount(): Int = viewPages.size

    public override fun createFragment(position: Int): Fragment = viewPages[position]

    public companion object AdapterConstant {
        public val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_articulos),MyApp.getInstance().resources.getString(R.string.lbl_lista),MyApp.getInstance().resources.getString(R.string.lbl_favoritos),MyApp.getInstance().resources.getString(R.string.lbl_ofertas))

        public val viewPages: List<Fragment> =
                listOf(CategoriasFragment(),ProductosCategoriaFragment(),ProductosCategoriaFragment(),ProductosCategoriaFragment())

    }
}
