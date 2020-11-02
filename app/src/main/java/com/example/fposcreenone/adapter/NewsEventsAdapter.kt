package com.example.fposcreenone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fposcreenone.R
import com.example.fposcreenone.model.NewsEventsModel
import kotlinx.android.synthetic.main.news_event_list_one.view.*

class NewsEventsAdapter(private val myDataSet: List<NewsEventsModel>?) :
    RecyclerView.Adapter<NewsEventsAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.news_event_list_one, parent, false)
        return MyViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {

        return myDataSet!!.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = myDataSet!![position].newsEventsTitle
        holder.description.text = myDataSet[position].newsEventsDescription
        holder.date.text = myDataSet[position].newsEventsDate

        holder.thumbnail.setImageDrawable(myDataSet[position].newsEventsThumbnail)

    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: AppCompatTextView = view.news_events_title_tv

        var description: AppCompatTextView = view.news_events_description_tv

        var date: AppCompatTextView = view.news_events_date_tv


        var thumbnail: AppCompatImageView = view.news_events_thumbnail_iv

    }
}


