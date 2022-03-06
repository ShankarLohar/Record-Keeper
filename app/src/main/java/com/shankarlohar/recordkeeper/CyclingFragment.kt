package com.shankarlohar.recordkeeper

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shankarlohar.recordkeeper.databinding.FragmentCyclingBinding
import com.shankarlohar.recordkeeper.databinding.FragmentRunningBinding

class CyclingFragment : Fragment() {

    private lateinit var binding: FragmentCyclingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCyclingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.containerLongestRide.setOnClickListener { launchCyclingRecordScreen("Longest Ride") }
        binding.containerBestAverageSpeed.setOnClickListener { launchCyclingRecordScreen("Best Average Speed") }
        binding.containerBiggestClimb.setOnClickListener { launchCyclingRecordScreen("Biggest Climb") }
    }

    private fun launchCyclingRecordScreen(record: String) {

        val intent = Intent(context,EditCyclingRecordActivity::class.java)
        intent.putExtra("Record",record)
        startActivity(intent)

    }

}