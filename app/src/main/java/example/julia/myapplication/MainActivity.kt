package example.julia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

val line1 = "Спасибо, жизнь, за то что вновь приходит день, Что зреет хлеб и что взрослеют дети."
val line2 = "Спасибо, жизнь, тебе за всех родных людей, Живущих на таком огромном свете."
val line3 = "Спасибо, жизнь, за то, что этот щедрый век Звучал во мне то щедростью, то болью"
val line4 = "За ширь твоих дорог, в которых человек, Все испытав, становится собою."
val line5 = "За то, что ты река без берегов, За каждую весну твою и зиму,"
val line6 = "За всех друзей и даже за врагов - Спасибо жизнь. За все тебе спасибо!"

const val TAG1 = "MainActivity"
const val KEY="random text"

class MainActivity : AppCompatActivity() {

    lateinit var randomTextView: TextView
    lateinit var randomButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomTextView=findViewById(R.id.random_text_view)
        randomButton=findViewById(R.id.random_button)

        if (savedInstanceState != null)
            randomTextView.text = savedInstanceState.getString(KEY)
        randomButton.setOnClickListener {
            randomize()
        }

        Log.d(TAG1, line1)

    }
    fun randomize(){
        randomTextView.text=Random.nextInt(100).toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(KEY,randomTextView.text.toString())
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG1, line2)
        }
    override fun onResume() {
        super.onResume()
        Log.d(TAG1, line3)
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG1, line4)
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG1, line5)
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG1, line1)

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG1, line6)
    }




}

