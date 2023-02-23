package com.seatfrog.railcards

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.seatfrog.railcards.ui.theme.RailcardsTheme

// This is a simple screen showing a list of railcards
// The content is fetched from a service (see RailcardsAPI for details)
// though for time we can load directly from local JSON if preferred
//
// We would like to update the view model to be more testable and improve the UI
// to include the railcards code and indicate if it is popular (data more important than design here)
//
// Also interested in general suggestions on how to improve the state management, architecture etc

class RailcardsViewModel: ViewModel() {
    val railcards = MutableLiveData<List<String>>(listOf())
    val isLoading: MutableLiveData<Boolean> = MutableLiveData(false)

    val railcardsAPI = RailcardsAPI()

    suspend fun fetchRailcards() {
        isLoading.value = true
        val value = railcardsAPI.fetchRailcards()
        railcards.value = value
        isLoading.value = false
    }
}

@Composable
fun RailcardsView(
    viewModel: RailcardsViewModel = viewModel()
) {
    val isLoading by viewModel.isLoading.observeAsState(false)
    val railcards by viewModel.railcards.observeAsState(listOf())

    LaunchedEffect(key1 = Unit) {
        viewModel.fetchRailcards()
    }

    if (isLoading) {
        Text(text = "Loading...")
    } else {
        Column {
            railcards.forEach { railcard ->
                Text(text = railcard)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun RailcardsViewPreview() {
    RailcardsTheme {
        RailcardsView()
    }
}