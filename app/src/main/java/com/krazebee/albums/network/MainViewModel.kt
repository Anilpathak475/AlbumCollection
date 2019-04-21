package com.krazebee.albums.network


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.past3.ketro.model.Wrapper

class MainViewModel: ViewModel(){

    val list = mutableListOf<Album.Items>()

    private val liveData = MutableLiveData<Wrapper<Album>>()

    fun searchUser(name:String): LiveData<Wrapper<Album>> {
        return GitHubRequest(name).doRequest()
    }

    fun searchUserB(name:String) {
        return GitHubRequest(name).executeRequest(liveData)
    }
}