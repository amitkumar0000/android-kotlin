package com.android.kotlin.ui.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import butterknife.BindView
import butterknife.ButterKnife
import com.android.kotlin.Constants

import com.android.kotlin.R
import com.android.kotlin.ui.activity.Contacts
import kotlinx.android.synthetic.main.fragment_.*


class MobileNumFragment : Fragment() {
    lateinit var contactActivity: Contacts

    @BindView(R.id.phoneNo)
    lateinit var phoneBtn:Button

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        contactActivity = context as Contacts
        Log.d(Constants.TAG,"onAttach")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Constants.TAG,"onCreate")

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater.inflate(R.layout.fragment_,container,false)
        Log.d(Constants.TAG,"onCreateView")
        ButterKnife.bind(v)

        phoneBtn = v.findViewById(R.id.phoneNo)


        phoneBtn.setOnClickListener( { view -> contactActivity.onFragmentInteraction("hello UserInfo") })
        return v;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(Constants.TAG,"onActivityCreated")
        retainInstance = true //this will keep fragment object alive on screen rotation
    }

    override fun onStart() {
        super.onStart()
        Log.d(Constants.TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Constants.TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Constants.TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Constants.TAG,"onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(Constants.TAG,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Constants.TAG,"onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(Constants.TAG,"onDetach")
    }




   /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_, container, false)
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    *//**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     *//*
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        *//**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentA.
         *//*
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                FragmentA().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }*/
}
