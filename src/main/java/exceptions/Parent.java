package exceptions;

import java.io.IOException;

    class Parent {
        void msg() throws Exception {
            System.out.println("parent");
        }
    }

    class TestExceptionChild extends Parent{
        void msg() throws IllegalArgumentException{
            System.out.println("TestExceptionChild");
        }
        public static void main(String args[]) throws Exception {
            Parent p = new TestExceptionChild();
            p.msg();
        }
}
