package com.example.dbms


import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyListAdapter
    (
    private val context: Activity,
    private val maintitle: Array<String>,

    private val imgid: Array<Int>
) :
    ArrayAdapter<String?>(context, R.layout.mylist, maintitle) {
    override fun getView(
        position: Int,
        view: View?,
        parent: ViewGroup
    ): View {
        val inflater = context.layoutInflater
        val rowView: View = inflater.inflate(R.layout.mylist, null, true)
        val titleText = rowView.findViewById<View>(R.id.title) as TextView
        val imageView =
            rowView.findViewById<View>(R.id.icon) as ImageView
       /* val subtitleText =
            rowView.findViewById<View>(R.id.subtitle) as TextView*/
        titleText.text = maintitle[position]
        imageView.setImageResource(imgid[position])
        //subtitleText.text = subtitle[position]
        return rowView
    }

}