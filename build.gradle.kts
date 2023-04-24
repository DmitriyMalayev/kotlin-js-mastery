plugins {
    kotlin("js") version "1.8.0"
}

group = "me.dmitrymalayev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}




kotlin {
    js {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }

    }
    sourceSets {
        val main by getting{
            dependencies {
                implementation(npm("date-fns", "2.29.3"))
            }
        }
    }
}