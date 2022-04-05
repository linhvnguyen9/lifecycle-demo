package com.linh.lifecycledemo

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import timber.log.Timber

class BlankFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.d("onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.d("onCreateView()")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart()")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume()")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("onPause()")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.d("onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.d("onDetach()")
    }
}