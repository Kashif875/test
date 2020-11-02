package com.example.fposcreenone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fposcreenone.R
import com.example.fposcreenone.model.OngoingCourseModel
import kotlinx.android.synthetic.main.ongoing_course_list.view.*

class OngoingCourseAdapter(private val myDataSet: List<OngoingCourseModel>?) :
    RecyclerView.Adapter<OngoingCourseAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.ongoing_course_list, parent, false)
        return MyViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {

        return myDataSet!!.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = myDataSet!![position].courseTitle
        holder.duration.text = myDataSet[position].courseDuration
        holder.thumbnails.setImageDrawable(myDataSet[position].courseThumbnail)
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: AppCompatTextView = view.ongoing_course_title_tv

        var duration: AppCompatTextView = view.ongoing_course_duration_tv

        var thumbnails: AppCompatImageView = view.ongoing_course_thumbnail_iv

    }
}
