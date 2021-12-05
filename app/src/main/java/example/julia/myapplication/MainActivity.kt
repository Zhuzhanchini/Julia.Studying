package example.julia.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

private const val HELLO_KEY = "hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {
            val link = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.youtube.kids&hl=ru&gl=US")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, link)
            val chooser=Intent.createChooser(openBrowserIntent, "PlayMarket")
            startActivity(chooser)
        }



    }


}

