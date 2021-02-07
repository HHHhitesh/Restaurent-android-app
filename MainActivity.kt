package com.internsala.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var titleName: String? = "Avengers"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scroll_examples)
       if(intent !=null){
          titleName= intent.getStringExtra("Name")
       }
        title=titleName

    }
}
