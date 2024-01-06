package com.wafflestudio.bunnybunny.lib.network.dto

import com.squareup.moshi.Json


data class ExampleGoodsPostPreview(
    @Json(name = "title") val title: String,
    @Json(name = "region") val region : String,
    @Json(name = "passed_time") val passedTime: String,
    @Json(name = "prise") val prise: Int,
    @Json(name = "img_url") val imgUrl: String,
    @Json(name = "like") val like: Int,
    @Json(name = "chat") val chat: Int,
)

