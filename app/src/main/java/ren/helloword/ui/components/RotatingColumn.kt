package ren.helloword.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ren.helloword.ui.theme.HelloWordTheme

@Composable
fun RotatingColumn(
    rotation: Float,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    val animatedRotation by animateFloatAsState(
        targetValue = rotation,
        label = "rotation"
    )
    
    Column(
        modifier = modifier
            .padding(16.dp)
            .rotate(animatedRotation),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun RotatingColumnPreview() {
    HelloWordTheme {
        RotatingColumn(rotation = 0f) {
            CounterText(count = 0)
            IncrementButton(onClick = {})
        }
    }
}
