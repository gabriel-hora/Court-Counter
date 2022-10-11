package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.courtcounter.databinding.ActivityMainBinding
import com.example.courtcounter.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val mViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        mViewModel.valueScoreALiveData.observe(this) { value ->
            binding.scoreTeamA.text = value.toString()
        }

        mViewModel.valueScoreBLiveData.observe(this) { value ->
            binding.scoreTeamB.text = value.toString()
        }

        onClickScoreA(mViewModel)
        onClickScoreB(mViewModel)
    }

    private fun onClickScoreA(mViewModel: MainViewModel) {
        binding.btnAddOneA.setOnClickListener {
            mViewModel.addOneForTeamA()
        }

        binding.btnAddThreeA.setOnClickListener {
            mViewModel.addThreeForTeamA()
        }

        binding.btnAddSixA.setOnClickListener {
            mViewModel.addSixForTeamA()
        }

        binding.btnAddNineA.setOnClickListener {
            mViewModel.addNineForTeamA()
        }

        binding.btnAddTwelveA.setOnClickListener {
            mViewModel.addTwelveForTeamA()
        }
    }

    private fun onClickScoreB(mViewModel: MainViewModel) {
        binding.btnAddOneB.setOnClickListener {
            mViewModel.addOneForTeamB()
        }

        binding.btnAddThreeB.setOnClickListener {
            mViewModel.addThreeForTeamB()
        }

        binding.btnAddSixB.setOnClickListener {
            mViewModel.addSixForTeamB()
        }

        binding.btnAddNineB.setOnClickListener {
            mViewModel.addNineForTeamB()
        }

        binding.btnAddTwelveB.setOnClickListener {
            mViewModel.addTwelveForTeamB()
        }
    }
}