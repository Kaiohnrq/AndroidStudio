package com.example.firstlocalappdb

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firstlocalappdb.data.UserDatabase
import com.example.firstlocalappdb.data.UserRepository
import com.example.firstlocalappdb.data.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val selectUsers : LiveData<List<Usuario>>
    val repository : UserRepository

    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        selectUsers = repository.selectUsers
    }

    fun addUser(usuario: Usuario) {

        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(usuario)
        }

    }

}