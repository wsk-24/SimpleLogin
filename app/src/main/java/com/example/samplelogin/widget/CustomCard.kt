package com.example.samplelogin.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.Text

@Composable
fun CustomCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),  // Rounded corners
        elevation = 8.dp,  // Shadow effect
        backgroundColor = MaterialTheme.colorScheme.surface,  // Background color
        modifier = modifier
            .padding(16.dp)  // Padding around the card
            .background(Color.White),  // Card background color
        content = content
    )
}