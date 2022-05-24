package p2pdops.androidappdevlab.common

import p2pdops.androidappdevlab.week10.Week10Activity
import p2pdops.androidappdevlab.week2.Week2Activity
import p2pdops.androidappdevlab.week3.Week3Activity
import p2pdops.androidappdevlab.week4.Week4Activity
import p2pdops.androidappdevlab.week5.Week5Activity
import p2pdops.androidappdevlab.week6.Week6Activity
import p2pdops.androidappdevlab.week7.Week7Activity
import p2pdops.androidappdevlab.week8.Week8Activity
import p2pdops.androidappdevlab.week9.Week9Activity


data class WeekData(
    var title: String,
    var subtitle: String,
    var activity: Class<*>
) {
    companion object {
        val weeks = listOf(
            WeekData("Week 2", "Layouts, Fonts, Colors", Week2Activity::class.java),
            WeekData("Week 3", "Layout managers, Event Listeners", Week3Activity::class.java),
            WeekData("Week 4", "Database of student marks", Week4Activity::class.java),
            WeekData("Week 5", "Using Notification Manager", Week5Activity::class.java),
            WeekData("Week 6", "Create alarm clock", Week6Activity::class.java),
            WeekData("Week 7", "Track device using GPS", Week7Activity::class.java),
            WeekData("Week 8", "Alert when received SMS", Week8Activity::class.java),
            WeekData("Week 9", "App to send an Email", Week9Activity::class.java),
            WeekData("Week 10", "Simple Mobile Application", Week10Activity::class.java),
        )
    }
}

