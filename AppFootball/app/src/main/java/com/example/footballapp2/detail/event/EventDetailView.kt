package com.example.footballapp2.detail.event

import com.example.footballapp2.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}