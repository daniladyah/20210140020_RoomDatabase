package com.example.roomsiswa.ui.theme.model

import androidx.lifecycle.ViewModel
import com.example.roomsiswa.data.RepositoriSiswa

class HomeViewModel(private  val repositoriSiswa: RepositoriSiswa): ViewModel(){

    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }

}