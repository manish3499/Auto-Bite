package com.bitecode.autobite.screens.shared.core

import org.threeten.bp.LocalDateTime

/**
 * @property pickupPoint  is the place where the user was picked up
 * @property destination  is the place where the user wanted  to go
 * @property cost  is the cost in INR incurred in the trip
 * @property distance   is the  distance covered  in km in the trip
 * */
data class Trip(
    val id: Long,
    val pickupPoint: String,
    val destination: String,
    val cost: Int,
    val distance: Float,
    val datetime: LocalDateTime
)