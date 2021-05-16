package com.cubetiqs.mykotlinapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestingController {

    @GetMapping
    fun TestingPage(): String {
        return "<h1 style='text-align: center; font-family: arial;'>Hello Testing Page</h1>"
    }

}