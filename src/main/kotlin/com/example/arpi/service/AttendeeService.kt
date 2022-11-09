package com.example.arpi.service

import com.example.arpi.model.Attendee
import com.example.arpi.repository.AttendeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class AttendeeService {

    @Autowired
    lateinit var attendeeRepository: AttendeeRepository

    fun list(): List<Attendee> {

        return attendeeRepository.findAll()

    }

    fun save(attendee: Attendee): List<Attendee> {

        return attendeeRepository.findAll()

    }
}