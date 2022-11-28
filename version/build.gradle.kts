buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        // 因为使用的 Kotlin 需要需要添加 Kotlin 插件
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")
    }
}

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    jcenter()
    google()
}

dependencies {
    compileOnly(gradleApi())
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")
    compileOnly("com.android.tools.build:gradle:4.2.2")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

gradlePlugin {
    plugins {
        create("version") {
            id = "com.maye.version"
            implementationClass = "com.maye.version.VersionPlugin"
        }
    }
}