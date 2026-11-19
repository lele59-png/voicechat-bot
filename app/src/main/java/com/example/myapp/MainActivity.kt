package com.example.myapp

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  val root = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; gravity = Gravity.CENTER; setPadding(32,32,32,32); setBackgroundColor(Color.rgb(13,22,48)) }
  val title = TextView(this).apply { text = "Voicechat bot"; textSize = 28f; setTextColor(Color.WHITE); gravity = Gravity.CENTER }
  val subtitle = TextView(this).apply { text = "Aplikasi Android anda telah berjaya dibina."; textSize = 16f; setTextColor(Color.LTGRAY); gravity = Gravity.CENTER; setPadding(0,24,0,0) }
  root.addView(title); root.addView(subtitle); setContentView(root)
 }
}
