package p2pdops.androidappdevlab.week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import p2pdops.androidappdevlab.R
import p2pdops.androidappdevlab.databinding.ActivityWeek3Binding

class Week3Activity : AppCompatActivity() {

    lateinit var binding: ActivityWeek3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeek3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener {
            try {
                val num1 = binding.num1.text.toString().toInt()
                val num2 = binding.num2.text.toString().toInt()
                val result = when (binding.optionsRadioGroup.checkedRadioButtonId) {
                    R.id.addRB -> num1 + num2
                    R.id.subtractRB -> num1 - num2
                    R.id.multiplyRB -> num1 * num2
                    R.id.divideRB -> num1 / num2
                    else -> Error("Unknown")
                }
                Snackbar
                    .make(binding.root, "Result is $result", Snackbar.LENGTH_LONG)
                    .show()
            } catch (e: Exception) {
                Snackbar
                    .make(binding.root, e.message.toString(), Snackbar.LENGTH_LONG)
                    .show()
            }
        }
    }
}