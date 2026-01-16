package ren.helloword.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ren.helloword.ui.theme.HelloWordTheme

@Composable
fun IncrementButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(text = "Incrémenter")
    }
}

@Preview(showBackground = true)
@Composable
fun IncrementButtonPreview() {
    HelloWordTheme {
        IncrementButton(onClick = {})
    }
}
