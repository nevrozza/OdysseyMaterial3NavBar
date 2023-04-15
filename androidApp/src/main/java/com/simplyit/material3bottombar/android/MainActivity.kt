package com.simplyit.material3bottombar.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import setupThemedNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupThemedNavigation()
    }
}


