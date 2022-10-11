package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.courtcounter.databinding.ActivityMainBinding
import com.example.courtcounter.viewModel.ScoreViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val mViewModel = ViewModelProvider(this)[ScoreViewModel::class.java]
        displayForTeamA(mViewModel.scoreTeamA)
        displayForTeamB(mViewModel.scoreTeamB)
        onClickButton(mViewModel)
    }

    fun addOneForTeamA(mViewModel: ScoreViewModel) {
        mViewModel.scoreTeamA += 1
        displayForTeamA(mViewModel.scoreTeamA)
    }

    fun addOneForTeamB(mViewModel: ScoreViewModel) {
        mViewModel.scoreTeamB += 1
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun addThreeForTeamA(mViewModel: ScoreViewModel){
        mViewModel.scoreTeamA += 3
        displayForTeamA(mViewModel.scoreTeamA)
    }

    fun addThreeForTeamB(mViewModel: ScoreViewModel){
        mViewModel.scoreTeamB += 3
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun addSixForTeamA(mViewModel: ScoreViewModel){
        mViewModel.scoreTeamA += 6
        displayForTeamA(mViewModel.scoreTeamA)
    }

    fun addSixForTeamB(mViewModel: ScoreViewModel){
        mViewModel.scoreTeamB += 6
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun addNineForTeamA(mViewModel: ScoreViewModel){
        mViewModel.scoreTeamA += 9
        displayForTeamA(mViewModel.scoreTeamA)
    }

    fun addNineForTeamB(mViewModel: ScoreViewModel){
        mViewModel.scoreTeamB += 9
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun addTwelveForTeamA(mViewModel: ScoreViewModel){
        mViewModel.scoreTeamA += 12
        displayForTeamA(mViewModel.scoreTeamA)
    }

    fun addTwelveForTeamB(mViewModel: ScoreViewModel) {
        mViewModel.scoreTeamB += 12
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun resetScore(mViewModel: ScoreViewModel) {
        mViewModel.scoreTeamA = 0
        mViewModel.scoreTeamB = 0
        displayForTeamA(mViewModel.scoreTeamA)
        displayForTeamB(mViewModel.scoreTeamB)
    }

    fun displayForTeamA(scoreForTeamA: Int){
        binding.scoreTeamA.text = scoreForTeamA.toString()
    }

    fun displayForTeamB(scoreForTeamB: Int){
        binding.scoreTeamB.text = scoreForTeamB.toString()
    }

    fun onClickButton(mViewModel: ScoreViewModel){
        binding.btnAddOneA.setOnClickListener {
            addOneForTeamA(mViewModel)
        }

        binding.btnAddOneB.setOnClickListener {
            addOneForTeamB(mViewModel)
        }

        binding.btnReset.setOnClickListener {
            resetScore(mViewModel)
        }

        binding.btnAddThreeA.setOnClickListener {
            addThreeForTeamA(mViewModel)
        }

        binding.btnAddThreeB.setOnClickListener {
            addThreeForTeamB(mViewModel)
        }

        binding.btnAddSixA.setOnClickListener{
            addSixForTeamA(mViewModel)
        }

        binding.btnAddSixB.setOnClickListener {
            addSixForTeamB(mViewModel)
        }

        binding.btnAddNineA.setOnClickListener {
            addNineForTeamA(mViewModel)
        }

        binding.btnAddNineB.setOnClickListener {
            addNineForTeamB(mViewModel)
        }

        binding.btnAddTwelveA.setOnClickListener {
            addTwelveForTeamA(mViewModel)
        }

        binding.btnAddTwelveB.setOnClickListener {
            addTwelveForTeamB(mViewModel)
        }
    }
}