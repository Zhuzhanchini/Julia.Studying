package example.julia.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(private val carList: List<Car>): RecyclerView.Adapter<CarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.car_list_item, parent,false)
        return CarViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car= carList[position]
        holder.bind(car)
    }

    override fun getItemCount(): Int {
       return carList.size
    }
}