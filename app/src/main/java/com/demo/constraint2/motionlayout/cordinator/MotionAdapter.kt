package com.demo.constraint2.motionlayout.cordinator


import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MotionAdapter(private val items: List<String>) :
    RecyclerView.Adapter<MotionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return LayoutInflater.from(parent.context).run {
            ViewHolder(inflate(R.layout.simple_list_item_1, parent, false))
        }
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text = items[position]
    }

    class ViewHolder(
        view: View,
        private val textView: TextView = view.findViewById(android.R.id.text1)
    ) : RecyclerView.ViewHolder(view) {
        var text: CharSequence
            get() = textView.text
            set(value) {
                textView.text = value
            }
    }

}
