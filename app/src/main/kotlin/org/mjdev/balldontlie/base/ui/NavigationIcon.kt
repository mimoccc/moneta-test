package org.mjdev.balldontlie.base.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import org.mjdev.balldontlie.base.annotations.DayPreview

@DayPreview
@Composable
fun NavigationIcon(
    navigationIcon: Any? = Icons.Filled.Menu,
    onNavigationIconClick: () -> Unit = {},
) {
    IconButton(
        onClick = onNavigationIconClick
    ) {
        IconAny(
            src = navigationIcon,
            contentDescription = "",
            tint = LocalContentColor.current
        )
    }
}