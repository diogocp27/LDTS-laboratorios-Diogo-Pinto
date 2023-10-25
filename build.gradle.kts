plugins {
    id("java")
    id("application")

}

group = "com.diogocp27.hero"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("Application")
}

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.googlecode.lanterna/lanterna
    implementation group: 'com.googlecode.lanterna', name: 'lanterna', version: '3.1.1'

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}