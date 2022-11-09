package com.example.arpi.repository

import com.example.arpi.model.Attendee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository

interface AttendeeRepository:JpaRepository<Attendee,Long> {
}