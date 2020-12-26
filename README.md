### 1. Junit

#### 1.1 @After和@Before

@Before用于在执行@Test注解的方法前，创建一些实例变量或者资源

@After用于在执行@Test注解的方法后，销毁实例变量或者资源

由于这两个注解是在执行每个@Test的方法时，都会调用，而且在执行前都会new xxxTest实例，也就是测试类，实例变量的状态不会传递给下一个测试方法。

#### 1.2 @AfterClass和@BeforeClass

@BeforeClass标注的方法是静态的，方法内部放一些在所有测试方法执行之前都会公用的资源代码，比如数据库的连接，获取流，只会在所有测试方法调用前执行一次

@AfterClass用于标注的方法是静态的，方法内部放一些在所有测试方法执行之后都会释放的资源代码，比如数据库连接的释放，流的关闭，只会在所有测试方法调用完成后进行执行

#### 1.3 Junit执行逻辑

```java
invokeBeforeClass(xxxTest.class); // 执行xxxTest类的@BeforeClass静态方法
for(Method method:allTestMethods) {
    xxxTest test = new xxxTest();
    test.setUp(); // @Before
    test.invoke(method); // @Test
    test.tearDown(); // @After
}
invokeAfterClass(xxxTest.class); // 执行xxxTest类的@AfterClass静态方法
```

