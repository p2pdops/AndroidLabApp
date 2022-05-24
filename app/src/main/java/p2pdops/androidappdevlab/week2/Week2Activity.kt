package p2pdops.androidappdevlab.week2

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.collection.CircularArray
import androidx.collection.CircularIntArray
import p2pdops.androidappdevlab.databinding.ActivityWeek2Binding

class Week2Activity : AppCompatActivity() {
    private var fontSize = CircularIntArray().apply { for (i in 30..50 step 5) addLast(i) }

    private var colorsList = CircularIntArray().apply {
        addLast(Color.RED); addLast(Color.GREEN); addLast(Color.BLUE); addLast(Color.YELLOW);
        addLast(Color.MAGENTA); addLast(Color.CYAN); addLast(Color.BLACK)
    }

    private var fontsList = CircularArray<Typeface>().apply {
        addLast(Typeface.SERIF); addLast(Typeface.SANS_SERIF);
    }

    lateinit var binding: ActivityWeek2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeek2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtSizeBtn.setOnClickListener {
            binding.textView.textSize = fontSize.popLast().also { fontSize.addFirst(it) }.toFloat()
        }

        binding.txtColorBtn.setOnClickListener {
            binding.textView.setTextColor(colorsList.popLast().also { colorsList.addFirst(it) })
        }

        binding.txtFontFamilyBtn.setOnClickListener {
            binding.textView.typeface = fontsList.popLast().also { fontsList.addFirst(it) }
        }
    }
}