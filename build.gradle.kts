import io.github.liplum.mindustry.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("io.github.liplum.mgpp") version "1.3.2"
    kotlin("jvm") version "1.9.22"
}
repositories {
    mavenCentral()
    mindustryRepo()
}
dependencies {
    importMindustry()
}
sourceSets {
    main {
        kotlin.srcDirs("src")
    }
    test {
        kotlin.srcDir("test")
    }
}
group = "io.github.hechuqiu.roguemindustry"
version = "1.0"
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
mindustry {
    projectType = Plugin
    dependency {
        mindustry on "v154.2"
        arc on "v154.2"
    }
    client {
        mindustry official "v154.2"
    }
    server {
        mindustry official "v154.2"
    }
    deploy {
        baseName = project.name
    }
}
mindustryAssets {
    root at "$projectDir/assets"
}