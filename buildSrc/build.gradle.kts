//plugins {
//    java
//}

//group = "org.example"
//version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//java {
//    sourceCompatibility = JavaVersion.VERSION_17
//    targetCompatibility = JavaVersion.VERSION_17
//}


dependencies {
//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
//    implementation(gradleApi())
    implementation("org.openapitools:openapi-generator-gradle-plugin:5.3.0")
    implementation("com.amazonaws:aws-java-sdk-s3:1.12.126")
}

//tasks.getByName<Test>("test") {
//    useJUnitPlatform()
//}
