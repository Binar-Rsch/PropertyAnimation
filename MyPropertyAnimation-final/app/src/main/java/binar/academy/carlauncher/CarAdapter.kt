package binar.academy.carlauncher

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CarAdapter(private val context: Context, private val items: List<CarAnimationItem>) :
    androidx.recyclerview.widget.RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

  override fun getItemCount(): Int = items.size

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
    val view = LayoutInflater.from(parent.context)
        .inflate(android.R.layout.simple_list_item_1, parent, false)

    return CarViewHolder(view)
  }

  override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
    holder.title.text = items[position].title
    holder.setTitleOnClickListener(context, items)
  }

  class CarViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(android.R.id.text1)

    fun setTitleOnClickListener(context: Context, items: List<CarAnimationItem>) {
      title.setOnClickListener { context.startActivity(items[adapterPosition].intent) }
    }
  }
}
