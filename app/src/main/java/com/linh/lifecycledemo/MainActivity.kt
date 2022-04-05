package com.linh.lifecycledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.d("onCreate()")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart()")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume()")

        findViewById<Button>(R.id.button_main_navigate).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_main_finish).setOnClickListener {
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        Timber.d("onPause()")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("onDestroy()")
    }
}