任务一：创建首个Kotlin应用
代码见lesson/MyFirstKotlinApp
任务一：创建首个Kotlin应用
新建项目
选择模板：Empty Compose Activity
配置项目：
Name: MyFirstKotlinApp
Package name: com.example.myfirstkotlinapp
Language: Kotlin
compileSdk = 35
Minimum SDK: API 24
![image](https://github.com/user-attachments/assets/bac70cf9-ac7b-4d7c-b806-01ce5d5414c7)
任务二：实践Compose布局
布局组件实现
使用 Column、Row 和 Box 组合实现复杂UI：
代码见lesson/BasicsCodelab
核心代码示例：
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val expanded = remember { mutableStateOf(false) }
    val extraPadding = if (expanded.value) 48.dp else 0.dp
    Surface(color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f).padding(bottom = extraPadding)) {
                Text(text = "Hello ")
                Text(text = name)
            }
            ElevatedButton(
                onClick = { expanded.value = !expanded.value }
            ) {
                Text(if (expanded.value) "Show less" else "Show more")
            }
        }
    }
}
fun MyApp( modifier: Modifier = Modifier,
           names: List<String> = listOf("World", "Compose")) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Column(modifier = modifier.padding(vertical = 4.dp)) {
            for (name in names) {
                Greeting(name = name)
            }
        }
    }
}
fun MyApp( modifier: Modifier = Modifier,
           names: List<String> = listOf("World", "Compose")) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Column(modifier = modifier.padding(vertical = 4.dp)) {
            for (name in names) {
                Greeting(name = name)
            }
        }
    }
}
fun MyApp( modifier: Modifier = Modifier,
           names: List<String> = listOf("World", "Compose")) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Column(modifier = modifier.padding(vertical = 4.dp)) {
            for (name in names) {
                Greeting(name = name)
            }
        }
    }
}
![image](https://github.com/user-attachments/assets/9e6fad7a-b9a6-443d-857f-e546bb9ceb50)
