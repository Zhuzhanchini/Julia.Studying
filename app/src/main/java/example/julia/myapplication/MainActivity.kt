package example.julia.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    lateinit var carRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carRecyclerView = findViewById(R.id.car_recycler_view)

        val carList:List<Car> = listOf(
           Car("Honda Acord", R.drawable.hondaacord),
            Car("Honda Civic", R.drawable.hondacivic),
            Car("Honda NSX", R.drawable.hondansx)

        )

        carRecyclerView.layoutManager=LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL, false)
        carRecyclerView.adapter=CarAdapter(carList)


    }


}

