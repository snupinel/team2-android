package com.wafflestudio.bunnybunny.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.wafflestudio.bunnybunny.viewModel.MainViewModel

@Composable
fun TabPage(viewModel: MainViewModel){
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        TitleBar()
        Box(){
            LazyColumn{
                when(viewModel.currentTab.value){
                    "Home"->
                }
            }
            if(viewModel.currentTab.value=="Home"||viewModel.currentTab.value=="Community"){
                WritePostButton()
            }
        }
        TabBar()
    }
}

@Composable
fun TitleBar(){

}

@Composable
fun TabBar(){

}
@Composable
fun WritePostButton(){

}