package com.example.alarmmanagerkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import java.util.*
import android.os.Handler
import androidx.core.app.NotificationCompat

class AlarmRandomNumber() : BroadcastReceiver() {

//    private var mHandler = Handler()
//    private lateinit var mRunnable: Runnable

    override fun onReceive(context: Context?, intent: Intent?) {
        showRandomNumber()
//        var builder = NotificationCompat.Builder(context!!, "foxandroid")
    }

    private fun showRandomNumber() {
        val rand = Random()
        val number = rand.nextInt(100)
        Log.d("RandomNumber", "Random number : $number" )
    }

}