package p2pdops.androidappdevlab.week9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import p2pdops.androidappdevlab.databinding.ActivityWeek2Binding

class Week9Activity : AppCompatActivity() {
    lateinit var binding: ActivityWeek2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeek2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}