package com.example.drawer_exm7.presentation.model

import com.example.drawer_exm7.R

data class DrawerItems(
    var drawerItems: List<DrawerItem>
) {
    companion object {
        fun getDefaultItems(): List<DrawerItem> {
            return listOf(
                DrawerItem(icon = R.drawable.ic_dashboard, text = "Dashboard"),
                DrawerItem(icon = R.drawable.ic_mailbox, text = "Email", messageAmount = 15),
                DrawerItem(icon = R.drawable.ic_notification, text = "Notification", messageAmount = 20),
                DrawerItem(icon = R.drawable.ic_calendar, text = "Calendar"),
                DrawerItem(icon = R.drawable.ic_statistic, text = "Statistic"),
                DrawerItem(icon = R.drawable.ic_settings, text = "Settings")
            )
        }
    }
}