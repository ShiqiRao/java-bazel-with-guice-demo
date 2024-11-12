# How to Initialize a Bazel + Guice Project from Scratch

## Process

1. Write the WORKSPACE and BUILD files to define the compilation process and external dependencies. (The dependency declarations in the BUILD file only require the group id and artifact id.)
2. Initialize a main class that contains the main method.
3. Re-introduce the project using the Bazel plugin or execute the synchronization command.
4. Write the classes that need to be injected (hereinafter referred to as the "classes to be injected") by using the @Inject + constructor injection method.
5. Write the Module class. If there are dependencies of the same type, you can combine the @Qualifier declaration to define custom annotations. Use them in the Module class and the classes to be injected respectively to indicate the relationship between injection and being injected.
6. Declare the Injector and Instance in the main class and make corresponding method calls. Finally, complete the dependency injection based on Guice.

## Build

bazel build //:app_deploy.jar

## Run

java -jar bazel-bin/app_deploy.jar
