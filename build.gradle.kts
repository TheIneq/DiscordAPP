plugins {
    id("java")
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:5.6.1")
    implementation("ch.qos.logback:logback-classic:1.5.18")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
    implementation("io.github.cdimascio:dotenv-java:3.2.0")
    compileOnly("org.projectlombok:lombok:1.18.38")
}