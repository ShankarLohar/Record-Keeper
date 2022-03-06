package com.shankarlohar.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shankarlohar.recordkeeper.databinding.ActivityEditCyclingRecordBinding
import com.shankarlohar.recordkeeper.databinding.ActivityEditRunningRecordBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCyclingRecordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_cycling_record)

        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val record: String? = intent.getStringExtra("Record")
        title = "$record Record"
    }
}