plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(gradleApi())
    implementation("org.openapitools:openapi-generator-gradle-plugin:5.3.0")
    implementation("org.slf4j:slf4j-api:1.7.25")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

buildscript {
    repositories {
        mavenCentral()
    }
}
apply<contract.TemplateContractPlugin>()