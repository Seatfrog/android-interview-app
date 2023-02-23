package com.seatfrog.railcards

import kotlinx.coroutines.delay

// https://reference.seatfrog-backend-staging.com/railcards.json
// Also bundled locally: railcards.json
class RailcardsAPI {
    suspend fun fetchRailcards(): List<String> {
        delay(1000)
        return listOf("16-17 Saver", "16-25 Railcard", "26-30 Railcard")
    }
}