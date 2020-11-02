package com.example.fposcreenone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fposcreenone.R
import com.example.fposcreenone.model.BlogModel
import kotlinx.android.synthetic.main.blog_list.view.*

class BlogAdapter(private val myDataSet: List<BlogModel>?) :
    RecyclerView.Adapter<BlogAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.blog_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {

        return myDataSet!!.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = myDataSet!![position].blogTitle
        holder.description1.text = myDataSet[position].blogDescription1
            holder.description2.text = myDataSet[position].blogDescription2

        holder.image.setImageDrawable(myDataSet[position].blogThumbnail)
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: AppCompatTextView = view.blog_title_tv

        var description1: AppCompatTextView = view.blog_description1_tv

        var description2: AppCompatTextView = view.blog_description2_tv


        var image: AppCompatImageView = view.blog_thumbnail_iv

    }
}



