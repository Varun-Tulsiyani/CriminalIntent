// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    id("org.jetbrains.kotlin.kapt") version "1.6.10" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.4.1" apply false
}
true // Needed to make the Suppress annotation work for the plugins block