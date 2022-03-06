package com.shankarlohar.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.commit
import com.google.android.material.navigation.NavigationBarView
import com.shankarlohar.recordkeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNav.setOnItemSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.reset_cycling -> {
            Toast.makeText(this, "Clicked the Reset Cycling menu item",Toast.LENGTH_LONG).show()
            true
        }
        R.id.reset_running -> {
            Toast.makeText(this, "Clicked the Reset Running menu item",Toast.LENGTH_LONG).show()
            true
        }
        R.id.reset_all_records -> {
            Toast.makeText(this, "Clicked the Reset All menu item",Toast.LENGTH_LONG).show()
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.cycling_option -> onCycling()
        R.id.running_option -> onRunning()
        else -> false
    }

    private fun onCycling(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content, CyclingFragment())
        }
        return true
    }

    private fun onRunning(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }
        return true
    }
}