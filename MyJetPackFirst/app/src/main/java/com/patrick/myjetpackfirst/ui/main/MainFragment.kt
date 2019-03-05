package com.patrick.myjetpackfirst.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.patrick.myjetpackfirst.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        displayForTeamA(viewModel.scoreTeamA)
        displayForTeamB(viewModel.scoreTeamB)

        plusABtn.setOnClickListener { addOneForTeamA() }
        plusBBtn.setOnClickListener { addOneForTeamB() }
    }

    private fun displayForTeamA(score: Int) {
        scoreAText.text = score.toString()
    }

    private fun displayForTeamB(score: Int) {
        scoreBText.text = score.toString()
    }

    private fun addOneForTeamA() {
        displayForTeamA(++viewModel.scoreTeamA)
    }

    private fun addOneForTeamB() {
        displayForTeamB(++viewModel.scoreTeamB)
    }

}
