package com.wafflestudio.bunnybunny.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.wafflestudio.bunnybunny.data.example.ExampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val repository: ExampleRepository
): ViewModel(){
    //홈 탭:Home
    //동네생활 탭: Community
    //채팅 탭:Chat
    //나의당근 탭:My
    var currentTab= mutableStateOf("Home")
}