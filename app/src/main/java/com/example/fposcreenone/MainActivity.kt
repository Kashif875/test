package com.example.fposcreenone

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.fposcreenone.adapter.*
import com.example.fposcreenone.model.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var ongoingCourseModelList: MutableList<OngoingCourseModel>? = null

    private var blogList: ArrayList<BlogModel> = ArrayList()

    private var informativeVideosList: ArrayList<InformativeVideosModel> = ArrayList()

    private var latestCourseList: ArrayList<LatestCoursesModel> = ArrayList()

    private var newsEventsList: ArrayList<NewsEventsModel> = ArrayList()

    private var newsEventsList2: ArrayList<NewsEventsModel2> = ArrayList()

    private var trendingNowList: ArrayList<TrendingNowModel> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sample1 = arrayOf("Explorer", "Explorer", "Explorer", "Explorer")
        val sample2 = arrayOf("My Learnings", "My Learnings", "My Learnings", "My Learnings")
        val sample3 = arrayOf("From your FPO", "From your FPO", "From your FPO", "From your FPO")

        // access the spinner


        if (spinner1 != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, sample1
            )
            spinner1.adapter = adapter
            spinner1.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    (parent.getChildAt(0) as? TextView)?.setTextColor(
                        ContextCompat.getColor(
                            this@MainActivity,
                            R.color.dark_green
                        )
                    )
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        if (spinner2 != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, sample2
            )
            spinner2.adapter = adapter
            spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    (parent.getChildAt(0) as TextView).setTextColor(
                        ContextCompat.getColor(
                            this@MainActivity,
                            R.color.dark_green
                        )
                    )

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        if (spinner3 != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, sample3
            )
            spinner3.adapter = adapter
            spinner3.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    (parent.getChildAt(0) as TextView).setTextColor(
                        ContextCompat.getColor(
                            this@MainActivity,
                            R.color.dark_green
                        )
                    )

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }


        addDummyValue()

        setAdapter()


    }

    private fun setAdapter() {

        //on going recycler view

        ongoing_course_recycler_view.adapter =
            OngoingCourseAdapter(
                ongoingCourseModelList
            )
        PagerSnapHelper().attachToRecyclerView(ongoing_course_recycler_view)


        //blog recycler view

        blog_recycler_view.adapter =
            BlogAdapter(blogList)
        PagerSnapHelper().attachToRecyclerView(blog_recycler_view)


        //Informative videos Recycler View


        information_videos_recycler_view.adapter =
            InformativeVideosAdapter(
                informativeVideosList
            )
        PagerSnapHelper().attachToRecyclerView(information_videos_recycler_view)


        // latest course recycler view
        latest_course_recycler_view.adapter =
            LatestCoursesAdapter(latestCourseList)
        PagerSnapHelper().attachToRecyclerView(latest_course_recycler_view)


        // news and event Recycler View


        news_events_recycler_view.adapter =
            NewsEventsAdapter(newsEventsList)
        setPageHelper(news_events_recycler_view)


        // news and events 2 Recycler View


        news_events_recycler_view_two.adapter =
            NewsEventsAdapter2(newsEventsList2)


        //trending recycler view
        trending_now_recycler_view.adapter = TrendingNowAdapter(trendingNowList)


    }


    private fun setPageHelper(recyclerView: RecyclerView){
        PagerSnapHelper().attachToRecyclerView(recyclerView)
    }

    private fun addDummyValue() {

        //ongoingCourse Recycler View

        ongoingCourseModelList = ArrayList()

        ongoingCourseModelList?.add(
            OngoingCourseModel(
                "hi",
                "33:33",
                ContextCompat.getDrawable(this, R.drawable.rectangle_393)!!
            )
        )
        ongoingCourseModelList?.add(
            OngoingCourseModel(
                "hi",
                "33:33",
                ContextCompat.getDrawable(this, R.drawable.rectangle_393)!!
            )
        )
        ongoingCourseModelList?.add(
            OngoingCourseModel(
                "hi",
                "33:33",
                ContextCompat.getDrawable(this, R.drawable.rectangle_393)!!
            )
        )


        //blog Recycler View


        blogList.add(
            BlogModel(
                "ldsad",
                "sadadadsadads",
                "sadadadad",
                ContextCompat.getDrawable(this, R.drawable.blogthumbnail)!!
            )
        )
        blogList.add(
            BlogModel(
                "ldsad",
                "sadadadsadads",
                "sadadadad",
                ContextCompat.getDrawable(this, R.drawable.blogthumbnail)!!
            )
        )
        blogList.add(
            BlogModel(
                "ldsad",
                "sadadadsadads",
                "sadadadad",
                ContextCompat.getDrawable(this, R.drawable.blogthumbnail)!!
            )
        )
        blogList.add(
            BlogModel(
                "ldsad",
                "sadadadsadads",
                "sadadadad",
                ContextCompat.getDrawable(this, R.drawable.blogthumbnail)!!
            )
        )


        informativeVideosList.add(
            InformativeVideosModel(
                "sa",
                "asdds",
                ContextCompat.getDrawable(this, R.drawable.informative_videos_thumbnail)!!
            )
        )
        informativeVideosList.add(
            InformativeVideosModel(
                "sa",
                "asdds",
                ContextCompat.getDrawable(this, R.drawable.informative_videos_thumbnail)!!
            )
        )
        informativeVideosList.add(
            InformativeVideosModel(
                "sa",
                "asdds",
                ContextCompat.getDrawable(this, R.drawable.informative_videos_thumbnail)!!
            )
        )
        informativeVideosList.add(
            InformativeVideosModel(
                "sa",
                "asdds",
                ContextCompat.getDrawable(this, R.drawable.informative_videos_thumbnail)!!
            )
        )


        // latest course recycler view


        latestCourseList.add(
            LatestCoursesModel(
                "dsds",
                "dsdsads",
                ContextCompat.getDrawable(this, R.drawable.latest_course_pic)!!
            )
        )
        latestCourseList.add(
            LatestCoursesModel(
                "dsds",
                "dsddsas",
                ContextCompat.getDrawable(this, R.drawable.latest_course_pic)!!
            )
        )
        latestCourseList.add(
            LatestCoursesModel(
                "dsds",
                "dsdsads",
                ContextCompat.getDrawable(this, R.drawable.latest_course_pic)!!
            )
        )
        latestCourseList.add(
            LatestCoursesModel(
                "dsds",
                "dsdsads",
                ContextCompat.getDrawable(this, R.drawable.latest_course_pic)!!
            )
        )

        //news and events recycler view

        newsEventsList.add(
            NewsEventsModel(
                "sdd",
                "sdds",
                "ds",
                ContextCompat.getDrawable(this, R.drawable.news_events_thumbnail)!!
            )
        )
        newsEventsList.add(
            NewsEventsModel(
                "sdd",
                "sdds",
                "ds",
                ContextCompat.getDrawable(this, R.drawable.news_events_thumbnail)!!
            )
        )
        newsEventsList.add(
            NewsEventsModel(
                "sdd",
                "sdds",
                "ds",
                ContextCompat.getDrawable(this, R.drawable.news_events_thumbnail)!!
            )
        )
        newsEventsList.add(
            NewsEventsModel(
                "sdd",
                "sdds",
                "ds",
                ContextCompat.getDrawable(this, R.drawable.news_events_thumbnail)!!
            )
        )


        newsEventsList2.add(
            NewsEventsModel2(
                "news",
                "sadd",
                "15th jun",
                "15th jun at 10:10AM",
                ContextCompat.getDrawable(this, R.drawable.news_events_pic)!!
            )
        )
        newsEventsList2.add(
            NewsEventsModel2(
                "news",
                "sadd",
                "15th jun",
                "15th jun at 10:10AM",
                ContextCompat.getDrawable(this, R.drawable.news_events_pic)!!
            )
        )
        newsEventsList2.add(
            NewsEventsModel2(
                "news",
                "sadd",
                "15th jun",
                "15th jun at 10:10AM",
                ContextCompat.getDrawable(this, R.drawable.news_events_pic)!!
            )
        )
        newsEventsList2.add(
            NewsEventsModel2(
                "news",
                "sadd",
                "15th jun",
                "15th jun at 10:10AM",
                ContextCompat.getDrawable(this, R.drawable.news_events_pic)!!
            )
        )


        //trending now recycler view

        trendingNowList.add(
            TrendingNowModel(
                "1",
                "sdaas",
                "dsaa",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )

        trendingNowList.add(
            TrendingNowModel(
                "2",
                "sdaas",
                "dsaa",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )

        trendingNowList.add(
            TrendingNowModel(
                "3",
                "sdaas",
                "dsaa",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )

        trendingNowList.add(
            TrendingNowModel(
                "4",
                "sdaas",
                "dsaa",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )


        trendingNowList.add(
            TrendingNowModel(
                "5",
                "sdaas",
                "dsaa",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )

        trendingNowList.add(
            TrendingNowModel(
                "6",
                "sdaas",
                "dsaa",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )

        trendingNowList.add(
            TrendingNowModel(
                "7",
                "sdaas",
                "dsaa",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )
        trendingNowList.add(
            TrendingNowModel(
                "8",
                "sdaas",
                "dsaa",
                ContextCompat.getDrawable(this, R.drawable.trending_now_pic)!!
            )
        )

    }
}
