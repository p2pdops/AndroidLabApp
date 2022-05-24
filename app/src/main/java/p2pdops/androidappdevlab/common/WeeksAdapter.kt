package p2pdops.androidappdevlab.common

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class WeeksAdapter(private val ctx: Context) : ArrayAdapter<WeekData>(
    ctx, android.R.layout.simple_list_item_2, android.R.id.text1, WeekData.weeks
) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val weekApp = getItem(position)!!
        return super.getView(position, convertView, parent).apply {
            findViewById<TextView>(android.R.id.text1)?.text = weekApp.title
            findViewById<TextView>(android.R.id.text2)?.text = weekApp.subtitle
            setOnClickListener { ctx.startActivity(Intent(ctx, weekApp.activity)) }
        }
    }
}
