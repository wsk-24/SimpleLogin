package com.example.samplelogin.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp

@Composable
fun CustomButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    contentColor: Color = Color.White,
    shape: RoundedCornerShape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp) // Padding for content
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor, // Background color
            contentColor = contentColor // Text color
        ),
        shape = shape, // Button shape
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp), // Padding around the button
        contentPadding = contentPadding // Padding for button content
    ) {
        Text(
            text = text,
            fontSize = 16.sp,
            color = contentColor
        )
    }
}

@Composable
fun GradientButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    gradientColors: List<Color> = listOf(Color.Blue, Color.Cyan), // Default gradient colors
    contentColor: Color = Color.White,
    shape: RoundedCornerShape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp), // Padding for content
    horizontalMargin: Dp = 16.dp // Margin for left and right
) {
    Box(
        modifier = modifier
            .padding(horizontal = horizontalMargin) // Margin for left and right
            .fillMaxWidth()
            .padding(vertical = 8.dp) // Padding around the button
            .background(brush = Brush.horizontalGradient(gradientColors), shape = shape) // Gradient background
    ) {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent, // Use transparent color to show gradient
                contentColor = contentColor // Text color
            ),
            shape = shape, // Button shape
            modifier = Modifier
                .fillMaxWidth()
                .padding(contentPadding), // Padding for button content
        ) {
            Text(
                text = text,
                fontSize = 16.sp,
                color = contentColor
            )
        }
    }
}
