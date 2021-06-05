package com.tavito.gridviewcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tavito.gridviewcardview.adapters.AlphaAdapters
import com.tavito.gridviewcardview.model.AlphaChar

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<AlphaChar> ? = null
    private var alphaAdapters:AlphaAdapters ? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnuser = findViewById<LinearLayout>(R.id.btnuser)
        btnuser.setOnClickListener {
            //Toast.makeText(this, this.getString(R.string.name_user_female),Toast.LENGTH_SHORT).show()
           Toast.makeText(this, this.getString(R.string.name_user_male),Toast.LENGTH_SHORT).show()
        }

        recyclerView = findViewById(R.id.myRecyclerView)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters(applicationContext, arrayList!!)
        recyclerView?.adapter = alphaAdapters
    }

    private fun setDataInList() : ArrayList<AlphaChar>{
      var items:ArrayList<AlphaChar> = ArrayList()

        items.add(AlphaChar(R.drawable.icons8_home_page_100, "Home Page"))
        items.add(AlphaChar(R.drawable.icons8_android_100, "System"))
        items.add(AlphaChar(R.drawable.icons8_email_100, "Email"))
        items.add(AlphaChar(R.drawable.icons8_schedule_100, "Tasks"))
        items.add(AlphaChar(R.drawable.icons8_inspection_100, "Inspection"))
        items.add(AlphaChar(R.drawable.icons8_questions_100, "Question"))
        items.add(AlphaChar(R.drawable.icons8_gear_100, "Settings"))
        items.add(AlphaChar(R.drawable.icons8_info_100, "Info"))
        items.add(AlphaChar(R.drawable.icons8_twitter_100, "Twitter"))
        items.add(AlphaChar(R.drawable.icons8_facebook_100, "Facebook"))
        items.add(AlphaChar(R.drawable.icons8_google_100, "Google"))
        items.add(AlphaChar(R.drawable.icons8_instagram_100, "Instagram"))

        return items
    }
}