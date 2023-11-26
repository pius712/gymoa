tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":storage:db-core"))
    implementation(project(":gymoa-admin-api"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":storage:db-core"))
}