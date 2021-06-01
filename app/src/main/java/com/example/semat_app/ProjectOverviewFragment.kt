package com.example.semat_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.filmapp.BaseFragment
import com.example.semat_app.features.alpha.ui.AlphaFragment

class ProjectOverviewFragment : BaseFragment(R.layout.project_overview) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.opportunity_button).setOnClickListener {
            val test = Test(name = "L;tym", number = 1111)//view.findViewById<Button>(R.id.opportunity_button).text
            val fragment = AlphaFragment.newInstance(test)
            parentFragmentManager.beginTransaction()
                    .replace(R.id.mainContainer, fragment, fragment::class.java.canonicalName)
                    .commitAllowingStateLoss()

        }
    }
}