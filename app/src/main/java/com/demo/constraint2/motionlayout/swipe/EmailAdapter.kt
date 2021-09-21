package com.demo.constraint2.motionlayout.swipe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.demo.constraint2.R
import kotlinx.android.synthetic.main.list_item_email.view.*

class EmailAdapter : ListAdapter<Email, EmailViewHolder>(DIFF_UTIL) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        return EmailViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_email, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val DIFF_UTIL = object : DiffUtil.ItemCallback<Email>() {
            override fun areItemsTheSame(oldItem: Email, newItem: Email): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Email, newItem: Email): Boolean {
                return oldItem == newItem
            }
        }
    }
}

class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(email: Email) {
        itemView.textViewEmailName.text = email.name
        itemView.textViewSubject.text = email.subject
    }
}