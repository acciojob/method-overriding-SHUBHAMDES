package com.driver;

public class Main {

    static abstract class A{
        public String meth(){
            return "Invoking method from class A";
        }

        public abstract String met();
    }

    static class B extends A{

        @Override
        public String met(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B b=new B();
        b.meth();
        B b1=new B();
        b1.meth();
    }
  
}