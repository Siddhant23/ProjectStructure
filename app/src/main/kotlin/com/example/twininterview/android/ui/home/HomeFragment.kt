package com.example.twininterview.android.ui.home

import android.os.Bundle
import com.example.twininterview.android.R
import com.example.twininterview.android.databinding.FragmentHomeBinding
import com.example.twininterview.android.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val layoutId: Int = R.layout.fragment_home
    override val viewModelClass = HomeViewModel::class

    override fun init(savedInstanceState: Bundle?) {

    }

    override fun initView(savedInstanceState: Bundle?) {
    }

}
