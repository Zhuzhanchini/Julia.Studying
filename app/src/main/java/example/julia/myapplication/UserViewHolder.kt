package example.julia.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    private val nameTextureView: TextView = itemView.findViewById(R.id.name_text_view)
    private val ageTextView: TextView = itemView.findViewById(R.id.age_text_view)

    fun bind(user: User){

        nameTextureView.text = "Имя - ${user.name}"
        ageTextView.text = "Возраст - ${user.age}"


    }
}