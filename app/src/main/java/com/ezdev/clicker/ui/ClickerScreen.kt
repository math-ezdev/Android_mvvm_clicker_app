package com.ezdev.clicker.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ezdev.clicker.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ClickerApp(clickerViewModel: ClickerViewModel = viewModel()) {
    //  _data
    val clickerUiState by clickerViewModel.uiState.collectAsState()

    //  _ui
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "${clickerUiState.count}",
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier.align(Alignment.Center)
        )
        FloatingActionButton(
            onClick = { clickerViewModel.counter() },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(
                    end = dimensionResource(id = R.dimen.padding_medium),
                    bottom = dimensionResource(id = R.dimen.padding_large)
                )
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null
            )
        }
    }
}