package com.example.borutoappexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.borutoappexample.navigation.SetUpNavGraph
import com.example.borutoappexample.ui.theme.BorutoAppExampleTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint

@OptIn(ExperimentalPagerApi::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BorutoAppExampleTheme {
                navController = rememberNavController()
                SetUpNavGraph(navController = navController)

            }
        }
    }
}