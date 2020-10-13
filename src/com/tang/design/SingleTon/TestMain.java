package com.tang.design.interfaceisolation.SingleTon;

/**
 * @Classname TestMain
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/9/28 16:01
 * @Created by ASUS
 */
public class TestMain {

    private int age = 88;

    private String address = "北京";

    protected int sex = 1;

    public String username = "long";

    public static void main(String[] args) {

        new TestMain();

    }

    public TestMain() {

        InnerTestClass innerTestClass = new InnerTestClass();

        System.out.println("username----》" + innerTestClass.username);
        System.out.println("sex----》" +  innerTestClass.sex );
        System.out.println("age----》" +  innerTestClass.age );

    }

    public static class InnerTestClass {

        private int age = 18;

        protected int sex = 0;

        public String username = "tang";

        public static int field = 5;

        public InnerTestClass() {
            System.out.println( "创建 " + this.getClass().getSimpleName() );
        }

    }

}

class Test {

    public Test() {

    }

}