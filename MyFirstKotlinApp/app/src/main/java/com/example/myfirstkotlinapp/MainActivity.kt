package com.example.myfirstkotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstkotlinapp.ui.theme.MyFirstKotlinAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //oncreate方法
        enableEdgeToEdge()   //更广泛的使用
        setContent {  //该ui的总体布局
            MyFirstKotlinAppTheme { //主题名字
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting( //ui总的主要的function函数
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable//ui界面的生成
fun Greeting(name: String, modifier: Modifier = Modifier) { //上面greeting函数的定义
    Text(
        text = "Hello $name!",  //name传参，上面greeting中的name = "Android"
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {  //预览ui的func
    MyFirstKotlinAppTheme {
        Greeting("Android")
    }
}