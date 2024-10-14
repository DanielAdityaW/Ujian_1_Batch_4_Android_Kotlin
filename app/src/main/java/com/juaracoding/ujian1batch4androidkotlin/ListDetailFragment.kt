package com.juaracoding.ujian1batch4androidkotlin

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ListDetailFragment : Fragment() {
    private var param2: String? = null
    lateinit var article: Article

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param2 = it.getString(ARG_PARAM2)
            article = it.getParcelable(ARG_PARAM1, Article::class.java)!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (::article.isInitialized) {
            view.findViewById<ImageView>(R.id.articleDetailImage).setImageResource(article.imageResourceId)
            view.findViewById<TextView>(R.id.articleTitle).text = article.title
            view.findViewById<TextView>(R.id.articleOverview).text = article.overview
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: Article, param2: String) =
            ListDetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
