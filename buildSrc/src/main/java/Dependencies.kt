import org.gradle.api.JavaVersion

object Configs {
    const val applicationId = "ir.vasl.modulararchitectureapp"
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.3"
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0.0"
    val javaVersion = JavaVersion.VERSION_1_8
}

object Versions {

    val androidx_appcompat = "1.1.0"
    val androidx_material = "1.1.0"
    val androidx_core = "1.0.1"
    val androidx_recyclerview = "1.0.0"
    val androidx_navigation = "2.0.0"
    val androidx_constraintLayout = "1.1.3"

    val junit = "4.12"
    val ext = "1.1.1"
    val androidx_espresso = "3.2.0"
    val androidx_testing = "1.1.1"

    val gradleandroid = "4.0.0"
    val kotlin = "1.3.20"
    val gradleversions = "0.28.0"

    val jakewharton_butterknife = "10.2.1"
    val jakewharton_butterknife_compiler = "10.2.1"

    val navigation = "2.3.0"

    val lifecycle_extensions_version = "2.2.0"
    val lifecycle_viewmodel_version = "1.1.0"
    val lifecycle_livedata_version = "1.1.0"
}

object Deps {

    val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.androidx_appcompat}"
    val androidx_material = "com.google.android.material:material:${Versions.androidx_material}"
    val androidx_core = "androidx.core:core-ktx:${Versions.androidx_core}"
    val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraintLayout}"
    val androidx_navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidx_navigation}"
    val androidx_navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.androidx_navigation}"
    val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview}"

    val testlib_junit = "junit:junit:${Versions.junit}"
    val testlib_ext = "androidx.test.ext:junit:${Versions.ext}"
    val testandroidx_rules = "androidx.test:rules:${Versions.androidx_testing}"
    val testandroidx_runner = "androidx.test:runner:${Versions.androidx_testing}"
    val testandroidx_espressocore = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"

    val tools_gradleandroid = "com.android.tools.build:gradle:${Versions.gradleandroid}"
    val tools_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val tools_gradleversions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleversions}"

    val jakewharton_butterknife = "com.jakewharton:butterknife:${Versions.jakewharton_butterknife}"
    val jakewharton_butterknife_compiler = "com.jakewharton:butterknife-compiler:${Versions.jakewharton_butterknife_compiler}"

    val nav_ui = "androidx.navigation:navigation-ui:${Versions.navigation}"
    val nav_fragment = "androidx.navigation:navigation-fragment:${Versions.navigation}"

    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle_extensions_version}"
    val lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel:$${Versions.lifecycle_viewmodel_version}"
    val lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata:${Versions.lifecycle_livedata_version}"
}
