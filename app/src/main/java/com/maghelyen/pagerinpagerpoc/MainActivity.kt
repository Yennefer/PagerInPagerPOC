package com.maghelyen.pagerinpagerpoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maghelyen.pagerinpagerpoc.ui.main.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        sections_view_pager.adapter = sectionsPagerAdapter
        sections_tabs.setupWithViewPager(sections_view_pager)
    }
}