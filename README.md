# SurfaceWaveViewDemo
水波纹动画类库演示工程。
## 效果图
![](https://github.com/Louis19910615/SurfaceWaveViewDemo/blob/master/SurfaceWaveView_Gif.gif)
## SurfaceWaveView库工程
欢迎在您的工程中引用[SurfaceWaveView库](https://github.com/Louis19910615/SurfaceWaveView "SurfaceWaveView库")
## 导入

Step 1. Import SurfaceWaveView to your project as a module;[将该控件作为module导入你的项目中]


Step 2. Add the dependency in your project build gradle.[在你的build.gradle中，添加以下依赖]

```gradle
dependencies {
    compile project(':surfacewaveviewlib-debug')
}
```
## 优点
1. 采用SurfaceView不阻塞主线程
2. 调整水波纹速度、大小时，具有平滑过渡效果
