load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name="java-maven-lib",
    srcs = glob(["src/main/java/com/example/demo/*.java"]),
    deps = [
        "@maven//:com_google_inject_guice",
        "@maven//:javax_inject_javax_inject"],
)

java_binary(
    name = "app",
    main_class = "com.example.demo.App",
    runtime_deps=[":java-maven-lib"]
)