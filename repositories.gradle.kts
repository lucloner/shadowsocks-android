rootProject.extra.apply {
    set("androidPlugin", "com.android.tools.build:gradle:4.1.2")
    set("kotlinVersion", "1.4.30")
}

repositories {
    maven { setUrl("https://maven.aliyun.com/repository/google/")}
    maven { setUrl("https://maven.aliyun.com/repository/jcenter/")}
    google()
    jcenter()
}
