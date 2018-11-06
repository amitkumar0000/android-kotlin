package com.android.kotlin.ui.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.android.kotlin.Constants

import com.android.kotlin.R

class UserInfoFragment : Fragment() {


    @BindView(R.id.userInfo)
    lateinit var user_name:TextView

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var v = inflater.inflate(R.layout.fragment_user_info, container, false)
        // Inflate the layout for this fragment
        ButterKnife.bind(v)

        var bundle = arguments

        var message = bundle?.get(Constants.MESSAGE)

        user_name = v.findViewById(R.id.userInfo)

        user_name.text = message?.toString()

        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        retainInstance = true
    }


    fun onMessageReceived(message:String){
        user_name.text = message
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }
}
