plugins {
	java
	id("org.springframework.boot") version "3.4.0-M2"
	id("io.spring.dependency-management") version "1.1.6"
	id("io.freefair.lombok") version "8.10"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(22)
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-devtools")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("net.datafaker:datafaker:2.3.1")
	testImplementation("uk.co.jemos.podam:podam:7.1.0.RELEASE")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
