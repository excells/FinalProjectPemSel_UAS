package com.example.footballapp2.event

import com.example.footballapp2.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}