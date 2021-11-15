# 如何从0初始化一个Bazel+Guice项目

1. 编写WORKSPACE以及BUILD文件，以定义编译流程以及外部依赖。（BUILD文件中的依赖声明仅需要group id以及artifact id）
2. 初始化一个包含main方法的主类。
3. 使用Bazel插件重新引入项目，或者执行同步命令。
4. 采用@Inject+构造器注入的方式，编写需要被注入的类（以下称之为"待注入类"）。
5. 编写Module类。如果存在相同类型的依赖项，可以结合@Qualifier声明自定义注解。 
分别在Module类以及待注入类使用，以表明注入与待注入的关系。
6. 在主类中声明Injector与Instance，进行相应方法调用。最终完成基于Guice的依赖注入。