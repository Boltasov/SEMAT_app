package com.example.semat_app.features.alpha.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.os.bundleOf
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.filmapp.BaseFragment
import com.example.semat_app.R
import com.example.semat_app.Test
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.semat_app.databinding.AlphaStagesBinding
import com.example.semat_app.features.alpha.presentation.AlphaVM
import com.example.semat_app.features.stage.ui.StageFragment
import com.example.semat_app.utils.navigateTo


class AlphaFragment : BaseFragment(R.layout.alpha_stages) {

    private val viewBinding by viewBinding(AlphaStagesBinding::bind)
    private val viewModel by viewModels<AlphaVM>()
    private var AlphAdapter: AlphaAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("AlphaFragment", "onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        viewModel.stagesState.observe(viewLifecycleOwner) { stages ->
            AlphAdapter?.data = stages
            AlphAdapter?.notifyDataSetChanged()
            Log.d("AlphaFragment", "onViewCreated ${stages.toString()}")
        }

        viewModel.openDetail.observe(viewLifecycleOwner) { stage ->
            openDetail(stage)
        }

        /*val film: Test? = arguments?.getParcelable(ALPHA_NAME_KEY)
        film?.apply {
            view.findViewById<TextView>(R.id.alpha_title).text = name
        }*/

        with(viewBinding.stagesList){
            AlphAdapter = AlphaAdapter( onStageClick = {
                viewModel.onStageClick( test = it)
            })
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = AlphAdapter
        }
    }

    companion object {

        fun newInstance(test: Test): AlphaFragment {
            return AlphaFragment().apply {
                arguments = bundleOf(ALPHA_NAME_KEY to test)
            }
        }
        private const val ALPHA_NAME_KEY = "ALPHA_NAME_KEY"
    }

    private fun openDetail(stage: Test) {
        parentFragmentManager.navigateTo(StageFragment.newInstance(stage))
    }
}
