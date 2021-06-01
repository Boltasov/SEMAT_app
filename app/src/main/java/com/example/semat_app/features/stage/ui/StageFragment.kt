package com.example.semat_app.features.stage.ui

import androidx.core.os.bundleOf
import com.example.filmapp.BaseFragment
import com.example.semat_app.R
import com.example.semat_app.Test
import com.example.semat_app.features.alpha.ui.AlphaFragment

class StageFragment: BaseFragment(R.layout.stage_questions)  {


    companion object {

        fun newInstance(test: Test): StageFragment {
            return StageFragment().apply {
                arguments = bundleOf(STAGE_NAME_KEY to test)
            }
        }
        private const val STAGE_NAME_KEY = "STAGE_NAME_KEY"
    }
}