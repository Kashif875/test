package com.example.fposcreenone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fposcreenone.R
import com.example.fposcreenone.model.LatestCoursesModel
import kotlinx.android.synthetic.main.latest_courses_list.view.*

class LatestCoursesAdapter(private val myDataSet: List<LatestCoursesModel>?) :
    RecyclerView.Adapter<LatestCoursesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.latest_courses_list, parent, false)
        return MyViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {

        return myDataSet!!.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = myDataSet!![position].latestCourseTitle
        holder.date.text = myDataSet[position].latestCourseDate
        holder.thumbnail.setImageDrawable(myDataSet[position].latestCourseThumbnail)
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: AppCompatTextView = view.latest_courses_title_tv

        var date: AppCompatTextView = view.latest_courses_date_tv

        var thumbnail: AppCompatImageView = view.latest_courses_thumbnail_iv

    }
}


