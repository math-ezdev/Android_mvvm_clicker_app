package com.ezdev.clicker.ui

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ClickerViewModel : ViewModel() {
    //  _clicker ui state
    private val _uiState = MutableStateFlow(ClickerUiState())
    val uiState: StateFlow<ClickerUiState> = _uiState.asStateFlow()

    //  _update MODEL
    fun counter(){
        _uiState.update {
            currentState ->
            currentState.copy(
                count = currentState.count + 1
            )
        }
    }
}

