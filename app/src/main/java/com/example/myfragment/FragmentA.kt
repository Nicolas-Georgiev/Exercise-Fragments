package com.example.myfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentA : Fragment(R.layout.fragment_a) {
    companion object {
        fun newInstance() = FragmentA()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val label = view.findViewById<TextView>(R.id.label)
        label.text = getString(R.string.this_is_first)

        view.findViewById<Button>(R.id.btn_first_top).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentA.newInstance())
                .commit()
        }

        view.findViewById<Button>(R.id.btn_second_top).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentB.newInstance())
                .commit()
        }

        view.findViewById<Button>(R.id.btn_bottom_action).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentA.newInstance())
                .commit()
        }
    }
}

class FragmentB : Fragment(R.layout.fragment_b) {
    companion object {
        fun newInstance() = FragmentB()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val label = view.findViewById<TextView>(R.id.label)
        label.text = getString(R.string.this_is_second)

        view.findViewById<Button>(R.id.btn_first_top).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentA.newInstance())
                .commit()
        }

        view.findViewById<Button>(R.id.btn_second_top).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentB.newInstance())
                .commit()
        }

        view.findViewById<Button>(R.id.btn_bottom_action).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentB.newInstance())
                .commit()
        }
    }
}
