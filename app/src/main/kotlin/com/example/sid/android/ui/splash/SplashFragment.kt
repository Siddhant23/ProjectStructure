package com.example.sid.android.ui.splash

import android.os.Bundle
import com.example.sid.android.R
import com.example.sid.android.databinding.FragmentSplashBinding
import com.example.sid.android.ui.base.BaseFragment
import com.example.sid.android.ui.splash.model.SplashScreenNavigation

class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {
    override val layoutId: Int = R.layout.fragment_splash
    override val viewModelClass = SplashViewModel::class

    override fun init(savedInstanceState: Bundle?) {
        viewModel.start()
        viewModel.navigation.observe(this) { event ->
            event?.consume {
                when (it) {
                    is SplashScreenNavigation.GoToHome -> {
                        navController.navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
                    }
                    else -> {}
                }
            }
        }
    }

    override fun initView(savedInstanceState: Bundle?) = Unit
}
