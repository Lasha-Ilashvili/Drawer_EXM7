package com.example.drawer_exm7.presentation.screen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.drawer_exm7.databinding.DrawerItemBinding
import com.example.drawer_exm7.presentation.model.DrawerItem

class MainRecyclerAdapter : RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {

    private lateinit var drawerItems: List<DrawerItem>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            DrawerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    fun setData(newList: List<DrawerItem>) {
        drawerItems = newList
    }

    override fun getItemCount(): Int = drawerItems.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind()
    }

    inner class MainViewHolder(private val binding: DrawerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            val drawerItem = drawerItems[adapterPosition]

            with(binding) {
                ivItemIcon.setImageResource(drawerItem.icon)
                tvDrawerText.text = drawerItem.text
                tvMessageAmount.text = drawerItem.messageAmount?.let {
                    tvMessageAmount.visibility = View.VISIBLE
                    it.toString()
                }
            }
        }
    }
}