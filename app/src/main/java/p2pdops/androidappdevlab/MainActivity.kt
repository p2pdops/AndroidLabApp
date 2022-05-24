package p2pdops.androidappdevlab

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import p2pdops.androidappdevlab.common.WeeksAdapter
import p2pdops.androidappdevlab.databinding.ActivityMainBinding
import p2pdops.androidappdevlab.week10.Week10Activity
import p2pdops.androidappdevlab.week2.Week2Activity
import p2pdops.androidappdevlab.week3.Week3Activity
import p2pdops.androidappdevlab.week4.Week4Activity
import p2pdops.androidappdevlab.week5.Week5Activity
import p2pdops.androidappdevlab.week6.Week6Activity
import p2pdops.androidappdevlab.week7.Week7Activity
import p2pdops.androidappdevlab.week8.Week8Activity
import p2pdops.androidappdevlab.week9.Week9Activity


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val weeksAdapter = WeeksAdapter(this)
        binding.weeksList.adapter = weeksAdapter
    }
}