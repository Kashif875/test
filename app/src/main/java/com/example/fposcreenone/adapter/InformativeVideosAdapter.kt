package com.example.fposcreenone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fposcreenone.model.InformativeVideosModel
import com.example.fposcreenone.R
import kotlinx.android.synthetic.main.informative_videos_list.view.*

class InformativeVideosAdapter(private val myDataSet: List<InformativeVideosModel>?) :
    RecyclerView.Adapter<InformativeVideosAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.informative_videos_list, parent, false)
        return MyViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {

        return myDataSet!!.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = myDataSet!![position].informativeVideoTitle
        holder.date.text = myDataSet[position].informativeVideoDate
        holder.thumbnails.setImageDrawable(myDataSet[position].informativeVideoThumbnail)

    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: AppCompatTextView = view.informative_videos_title_tv

        var date: AppCompatTextView = view.information_videos_date_tv

        var thumbnails: AppCompatImageView = view.information_videos_thumbnail_iv

    }
}
