package com.example.myscope

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import org.json.JSONObject
import java.io.IOException
import kotlin.math.roundToInt

class HoroscopeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horoscope)
        val zodiac = intent.getStringExtra("zodiac")
        val randomFirstPhrase = (0..15).random()
        val randomSecondPhrase = (0..15).random()
        val randomThreePhrase = (0..15).random()
        val randomLuckyTime = (1..24).random()
        val luckyNumberRandom = (1..100).random()
        val luckyColorRandom = (1..6).random()
        val moodOnRandom = (0..14).random()
        val onToday = findViewById<TextView>(R.id.onToday)
        val color = findViewById<TextView>(R.id.color)
        val number = findViewById<TextView>(R.id.number)
        val mood = findViewById<TextView>(R.id.mood)
        val time = findViewById<TextView>(R.id.time)
        val description = findViewById<TextView>(R.id.description)
        onToday.append(" " + zodiac+":")
        number.append(" " + luckyNumberRandom.toString())
        val luckyColor = mapOf(1 to "красный", 2 to "оранжевый", 3 to "желтый", 3 to "зелёный", 4 to "голубой", 5 to "синий", 6 to "фиолетовый")
        color.append(" "+luckyColor[luckyColorRandom])
        val luckyTime = mapOf(1 to "12am", 2 to "1am", 3 to "2am", 4 to "3am", 5 to "4am", 6 to "5am",
                7 to "6am", 8 to "7am", 9 to "8am", 10 to "9am", 11 to "10am", 12 to "11am",
                13 to "12pm", 14 to "1pm", 15 to "2pm", 16 to "3pm", 17 to "4pm", 18 to "5pm",
                19 to "6pm", 20 to "7pm", 21 to "8pm",22 to "9pm", 23 to "10pm", 24 to "11pm")
        time.append(" "+ luckyTime[randomLuckyTime])
        val moodOnToday = mapOf(0 to "игривое", 2 to "спокойное", 3 to "утомлённое", 4 to "грустное", 5 to "радостное", 6 to "очень плохое", 7 to "счастливое", 8 to "выпить бокальчик",
                9 to "провести время с друзьями", 10 to "отдохнуть на природе", 11 to "посмотреть ужастик", 12 to "зарыться под одеяло", 13 to "завести собаку или кота", 14 to "накуриться")
        mood.append(" "+moodOnToday[moodOnRandom])
    }
}
