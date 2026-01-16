package ren.helloword.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ren.helloword.ui.theme.HelloWordTheme

@Composable
fun CounterText(
    count: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Compteur: $count",
        fontSize = 24.sp,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun CounterTextPreview() {
    HelloWordTheme {
        CounterText(count = 5)
    }
}
