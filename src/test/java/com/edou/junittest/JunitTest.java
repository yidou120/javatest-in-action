package com.edou.junittest;

import org.junit.*;

/**
 * @ClassName JunitTest
 * @Description Junit@Before[Class]/After[Class]测试用法
 * @Author kfzx-yangzhif
 * @Date 2020/12/26 17:53
 * @Version 1.0
 */
public class JunitTest {
    /**
     * 输出结果
     * beforeclass...
     * JunitTest...
     * before...
     * test1..
     * after...
     * JunitTest...
     * before...
     * test2..
     * after...
     * afterclass...
     */
    @BeforeClass
    public static void beforeclass(){
        System.out.println("beforeclass...");
    }
    @Before
    public void setUp(){
        System.out.println("before...");
    }

    public JunitTest(){
        System.out.println("JunitTest...");
    }

    @Test
    public void test1(){
        System.out.println("test1..");
    }

    @Test
    public void test2(){
        System.out.println("test2..");
    }

    @After
    public void tearDown(){
        System.out.println("after...");
    }

    @AfterClass
    public static void afterclass(){
        System.out.println("afterclass...");
    }
}
