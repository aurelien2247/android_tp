package ren.helloword.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ren.helloword.ui.theme.HelloWordTheme

@Composable
fun RotatingCounter(
    modifier: Modifier = Modifier
) {
    var count by remember { mutableIntStateOf(0) }
    
    // 360° / 36 clics = 10° par clic
    val rotation = count * 10f
    
    RotatingColumn(
        rotation = rotation,
        modifier = modifier
    ) {
        CounterText(count = count)
        
        Spacer(modifier = Modifier.height(16.dp))
        
        IncrementButton(onClick = { count++ })
    }
}

@Preview(showBackground = true)
@Composable
fun RotatingCounterPreview() {
    HelloWordTheme {
        RotatingCounter()
    }
}
