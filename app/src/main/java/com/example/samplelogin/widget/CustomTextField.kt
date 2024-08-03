package com.example.samplelogin.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.ImeAction

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String = "",
    modifier: Modifier = Modifier,
    imeAction: ImeAction = ImeAction.Done,
    borderColor: Color = Color.Gray,
    backgroundColor: Color = MaterialTheme.colorScheme.surface
) {
    val colors = TextFieldDefaults.colors(
        //setting the text field background when it is focused
        focusedContainerColor = Color.Transparent,

        //setting the text field background when it is unfocused or initial state
        unfocusedContainerColor =  Color.Transparent,
    )

    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        placeholder = { Text(placeholder) },
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = imeAction),
        colors = colors,
        modifier = modifier
            .padding(8.dp)
            .background(backgroundColor, RoundedCornerShape(8.dp))
            .border(1.dp, borderColor, RoundedCornerShape(8.dp))
            .padding(16.dp)
    )
}
