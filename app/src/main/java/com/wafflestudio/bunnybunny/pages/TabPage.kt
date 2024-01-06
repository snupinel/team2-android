package com.wafflestudio.bunnybunny.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.wafflestudio.bunnybunny.viewModel.MainViewModel

@Composable
fun TabPage(viewModel: MainViewModel){
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        TitleBar()
        Box(Modifier.fillMaxSize()){
            when(viewModel.currentTab.value){
                "Home"->HomeTabLazyColumn(viewModel)
                "Community"->CommunityTabLazyColumn()
                "Chat"->ChatTabLazyColumn()
                "My"->MyTabLazyColumn()
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

@Composable
fun HomeTabLazyColumn(viewModel:MainViewModel){
    LazyColumn{
        item {

        }
        items(viewModel.goodsPostList.value){
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
            ){
                Row {
                    val painter = rememberImagePainter(data = it.imgUrl)
                    Image(
                        painter = painter,
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(100.dp)
                    )
                    Column {
                        Text(text = it.title)
                        Text(text = it.region+"·"+it.passedTime)
                        Text(text = it.prise.toString()+"원")
                        Text(text = (if(it.like>0)"관심 "+it.like.toString() else "")+(if(it.chat>0)"채팅 "+it.chat.toString() else ""))
                    }
                }
            }
            Divider(
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
            )
        }

    }
}
@Composable
fun CommunityTabLazyColumn(){

}
@Composable
fun ChatTabLazyColumn(){

}
@Composable
fun MyTabLazyColumn(){

}