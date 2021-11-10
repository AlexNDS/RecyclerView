package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.RadioGroup
import android.widget.TextView
import com.google.android.material.switchmaterial.SwitchMaterial

//import androidx.appcompat.app.AppCompatActivity





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




            //    val userNameList:List<String> = listOf("Maxim","Alex","Oleg","Nadya","Liza","Arina","Lucky","Murka","Vorona","Mama","Papa","Baba","Deda")
            // val resID:Int =  resources.getIdentifier("kiska_list_card" , "drawable", packageName);
            val bannerList: List<Banner> = listOf(


                Banner(R.drawable.kiska, "IMAGE #1"),
                Banner(R.drawable.k1, "IMAGE #2"),
                Banner(R.drawable.k2, "IMAGE #3"),
                Banner(R.drawable.k3, "IMAGE #4"),
                Banner(R.drawable.ki4, "IMAGE #5"),
                Banner(R.drawable.k5, "IMAGE #6"),
                Banner(R.drawable.k6, "IMAGE #7"),
            )


            val usersRecyclerView: RecyclerView = findViewById(R.id.user_recycler_view)
            usersRecyclerView.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            usersRecyclerView.addItemDecoration(
                DividerItemDecoration(
                    this,
                    DividerItemDecoration.VERTICAL
                )
            )

            usersRecyclerView.adapter = BannerAdapter(bannerList)

            //   val textView = findViewById<TextView>(R.id.description)
///
            var mInfoTextView: TextView? = null
            fun onCreate(savedInstanceState: Bundle?) {

                setContentView(R.layout.activity_main)
                mInfoTextView = findViewById(R.id.textView)

            }



        }

    }


