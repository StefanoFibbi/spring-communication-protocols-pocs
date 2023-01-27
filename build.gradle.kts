import com.google.protobuf.gradle.id
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"

	// gRPC
	id("com.google.protobuf") version "0.9.2"
}

ext["protobufVersion"] = "3.21.9"
ext["grpcVersion"] = "1.52.1"
ext["grpcKotlinVersion"] = "1.3.0"

group = "com.tr.poc"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework:spring-webflux")

	// GraphQL
	implementation("org.springframework.boot:spring-boot-starter-graphql")
	testImplementation("org.springframework.graphql:spring-graphql-test")

	// gRPC
	api("io.grpc:grpc-stub:${rootProject.ext["grpcVersion"]}")
	api("io.grpc:grpc-protobuf:${rootProject.ext["grpcVersion"]}")
	api("com.google.protobuf:protobuf-java-util:${rootProject.ext["protobufVersion"]}")
	api("com.google.protobuf:protobuf-kotlin:${rootProject.ext["protobufVersion"]}")
	api("io.grpc:grpc-kotlin-stub:${rootProject.ext["grpcKotlinVersion"]}")

	protobuf(files("src/main/resources/grpc/"))
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

protobuf {
	protoc {
		artifact = "com.google.protobuf:protoc:${rootProject.ext["protobufVersion"]}"
	}
	plugins {
		id("grpc") {
			artifact = "io.grpc:protoc-gen-grpc-java:${rootProject.ext["grpcVersion"]}"
		}
		id("grpckt") {
			artifact = "io.grpc:protoc-gen-grpc-kotlin:${rootProject.ext["grpcKotlinVersion"]}:jdk8@jar"
		}
	}
	generateProtoTasks {
		all().forEach {
			it.plugins {
				id("grpc")
				id("grpckt")
			}
			it.builtins {
				id("kotlin")
			}
		}
	}
}
