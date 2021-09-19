package com.jetpack.whatsappclone.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jetpack.whatsappclone.model.SampleData
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
class WhatsAppChatViewModel: ViewModel() {
    private val date = SimpleDateFormat("hh:mm a")
    private val strDate: String = date.format(Date())
    private val _getSampleData = MutableLiveData<List<SampleData>>()
    val getSampleData: LiveData<List<SampleData>> get() = _getSampleData
    private val _flag = MutableLiveData(false)
    val flag: LiveData<Boolean> get() = _flag

    private val chatListItem = mutableListOf(
        SampleData("Name 1", "Hi, Welcome", "Sample Url", strDate),
        SampleData("Name 2", "Hi, Welcome", "Sample Url", strDate),
        SampleData("Name 3", "Hi, Welcome", "Sample Url", strDate),
        SampleData("Name 4", "Hi, Welcome", "Sample Url", strDate),
        SampleData("Name 5", "Hi, Welcome", "Sample Url", strDate)
    )

    init {
        _getSampleData.value = chatListItem
    }

    fun addChat(data: SampleData) {
        _flag.value = _flag.value != true
        chatListItem.addAll(listOf(data))
        _getSampleData.value = chatListItem
    }
}










