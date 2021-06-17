package com.satria.jpro.secondsubmission.data.source.remote.response

import com.google.gson.annotations.SerializedName
//copyright satria junanda//
data class ListResponse<T>(
    @SerializedName("status_message")
    val statusMessage: String? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null,
    @SerializedName("results")
    val result: List<T>? = null
)
//copyright satria junanda//