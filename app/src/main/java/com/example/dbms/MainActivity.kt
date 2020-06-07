package com.example.dbms

import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.dbms.MyListAdapter as MyListAdapter1


class MainActivity : AppCompatActivity() {
    var list: ListView? = null
    var maintitle = arrayOf(
        "Introduction", "Architecture",
        "SQL", "Commands in SQL",
        "Relational Algebra","Relational Calculus","Transaction Processing",
        "Database Recovery","Database Applications","OODBMS",
        "Web Databases"


    )

    var imgid = arrayOf<Int>(
        R.drawable.insta, R.drawable.insta,
        R.drawable.insta, R.drawable.insta,
        R.drawable.insta, R.drawable.insta,
        R.drawable.insta,
        R.drawable.insta, R.drawable.insta,
        R.drawable.insta, R.drawable.insta
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MyListAdapter1(this, maintitle, imgid)
        list = findViewById<View>(R.id.list) as ListView
        list!!.adapter = adapter
        list!!.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->

                if (position == 0) { //code specific to first list item
                    val intent = Intent(this, firstactivity::class.java)
                    // start your next activity
                    startActivity(intent)
                } else if (position == 1) { //code specific to 2nd list item
                    val intent = Intent(this, secondactivity::class.java)
                    // start your next activity
                    startActivity(intent)

                } else if (position == 2) {
                    val intent = Intent(this, thirdactivity::class.java)
                    // start your next activity
                    startActivity(intent)

                } else if (position == 3) {
                    val intent = Intent(this, fourthactivity::class.java)
                    // start your next activity
                    startActivity(intent)

                } else if (position == 4) {
                    val intent = Intent(this, fifthactivity::class.java)
                    // start your next activity
                    startActivity(intent)

                } else if (position == 5) {
            val intent = Intent(this, sixthactivity::class.java)
            // start your next activity
            startActivity(intent)
        }}
        }
    }
