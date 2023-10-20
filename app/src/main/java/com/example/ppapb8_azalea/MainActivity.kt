package com.example.ppapb8_azalea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.ppapb8_azalea.databinding.ActivityMainBinding
import com.example.pppb_pertemuan8.TabAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            viewPager.adapter = TabAdapter(supportFragmentManager)
            // Hubungkan ViewPager dengan TabLayout
            tabLayout.setupWithViewPager(viewPager)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return true
    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.action_home -> {
//                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
//                true
//            }
//            R.id.action_materi -> {
//                Toast.makeText(this, "Materi", Toast.LENGTH_SHORT).show()
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }

}