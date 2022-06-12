package com.kamil.toorapp_mobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kamil.toorapp_mobile.databinding.FragmentOnBoarding1Binding
import com.kamil.toorapp_mobile.databinding.FragmentOnBoarding2Binding

class OnBoarding2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentOnBoarding2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOnBoarding2Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_onBoarding22_to_loginActivity)
        )

        binding.btnSkip2.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.action_onBoarding22_to_loginActivity)
        }
    }
}