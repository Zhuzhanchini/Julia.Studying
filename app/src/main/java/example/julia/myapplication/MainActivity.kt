package example.julia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTextView: TextView = findViewById(R.id.hellow_world_text_view)
        val newTextButton: Button = findViewById(R.id.new_text_button)

        newTextButton.setOnClickListener {
            helloTextView.text = "Hello"
        }


    }
}