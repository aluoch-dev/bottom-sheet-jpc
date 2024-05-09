package com.example.houseplants.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    TopAppBar(
        title = {
            Text("House Plants")
        }
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewTopBar() {
    TopAppBar()
}