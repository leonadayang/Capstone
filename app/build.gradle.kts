plugins {
    id("com.android.application")
}

android {
<<<<<<< HEAD
    namespace = "com.study.sanpablook"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.study.sanpablook"
=======
    namespace = "com.example.capstone"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.capstone"
>>>>>>> 6ff899f82ad1ab020d692059b1ca4de7d4a83d0b
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
<<<<<<< HEAD
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
=======
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
    }

>>>>>>> 6ff899f82ad1ab020d692059b1ca4de7d4a83d0b
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
<<<<<<< HEAD
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.cardview:cardview:1.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
=======
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.3.5")

    //camera and gallery
    implementation ("com.github.dhaval2404:imagepicker:2.1")

>>>>>>> 6ff899f82ad1ab020d692059b1ca4de7d4a83d0b
}