package com.example.sid.android.ui.home

import android.os.Bundle
import com.example.sid.android.R
import com.example.sid.android.databinding.FragmentHomeBinding
import com.example.sid.android.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val layoutId: Int = R.layout.fragment_home
    override val viewModelClass = HomeViewModel::class

    override fun init(savedInstanceState: Bundle?) {

    }

    override fun initView(savedInstanceState: Bundle?) {
    }

}
