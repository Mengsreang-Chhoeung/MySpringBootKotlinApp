package com.cubetiqs.mykotlinapp.exception

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class ExceptionResponse(

    val errorMessage: String,
    val errorCode: String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    val timeStamp: LocalDateTime

)