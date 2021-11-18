package com.kpstv.home.navigation.home_internal

import com.kpstv.home.di.HomeScope
import com.kpstv.home.HomeFragment
import com.kpstv.home.R
import com.kpstv.home_internal.HomeInternalButtonClicked
import com.kpstv.home_internal2.HomeInternal2Fragment
import javax.inject.Inject

class HomeInternalButtonClickedImpl @Inject constructor(
  @HomeScope private val fragment: HomeFragment,
) : HomeInternalButtonClicked {
  override fun goToNext() {
    fragment.childFragmentManager.beginTransaction()
      .addToBackStack("home-internal2")
      .replace(R.id.frag_container, HomeInternal2Fragment::class.java, null)
      .commit()
  }
}