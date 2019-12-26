package com.maghelyen.pagerinpagerpoc.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.maghelyen.pagerinpagerpoc.R
import kotlinx.android.synthetic.main.fragment_section.*

class SectionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_section, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val subSectionsPagerAdapter = SubSectionsPagerAdapter(context!!, childFragmentManager)
        sub_sections_view_pager.adapter = subSectionsPagerAdapter
        sub_sections_tabs.setupWithViewPager(sub_sections_view_pager)

        Toast.makeText(context, "select salon 2", Toast.LENGTH_SHORT).show()
        sub_sections_view_pager.currentItem = 1
        sub_sections_tabs.getTabAt(1)?.select()
    }

    companion object {
        @JvmStatic
        fun newInstance(): SectionFragment {
            return SectionFragment()
        }
    }
}