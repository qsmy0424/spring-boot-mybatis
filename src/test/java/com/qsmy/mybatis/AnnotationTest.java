package com.qsmy.mybatis;

import com.qsmy.mybatis.annotation.Test;
import com.qsmy.mybatis.annotation.TestMethod;

/**
 * @author qsmy
 * @date 2019-07-26
 */
@Test()
public class AnnotationTest {

    @TestMethod("tomcat-method")
    public void test() {
    }

    public static void main(String[] args) {
        Test test = AnnotationTest.class.getAnnotation(Test.class);
        System.out.println(test.value());

        TestMethod tm = null;
        try {
            tm = AnnotationTest.class.getDeclaredMethod("test", (Class<?>) null).getAnnotation(TestMethod.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(tm.value());
    }
}
