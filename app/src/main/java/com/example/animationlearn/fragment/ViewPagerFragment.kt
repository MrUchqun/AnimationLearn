package com.example.animationlearn.fragment

import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.animationlearn.R


class ViewPagerFragment : Fragment() {

    private lateinit var textOne: TextView
    private lateinit var textTwo: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        textOne = view.findViewById(R.id.tv_bold)
        textTwo = view.findViewById(R.id.tv_normal)

        textOne.text = arguments?.getInt("textOne")?.let { getText(it) }
        textTwo.text = arguments?.getInt("textTwo")?.let { getText(it) }
    }

    fun newInstance(textOne: Int, textTwo: Int): ViewPagerFragment {

        val viewPagerFragment = ViewPagerFragment()
        val bundle = Bundle()

        bundle.putInt("textOne", textOne)
        bundle.putInt("textTwo", textTwo)

        viewPagerFragment.arguments = bundle
        return viewPagerFragment
    }
}