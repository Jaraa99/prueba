package com.example.arpi.controller

import com.example.arpi.model.Attendee
import com.example.arpi.service.AttendeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/attendee")
class AttendeeController {
    @Autowired
    lateinit var attendeeService: AttendeeService

    @GetMapping
    fun list():List<Attendee>{
        return attendeeService.list()
    }
}