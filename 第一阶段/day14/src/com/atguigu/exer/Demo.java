package com.atguigu.exer;

public class Demo {

}

interface A {
    int x = 0;
}
class B {
    int x = 1;
}
class C extends B implements A {
//	int x = 5;
    public void pX() {
        System.out.println(A.x);
        System.out.println(super.x);
//        System.out.println(x);
    }
    public static void main(String[] args) {
        new C().pX();
    }
}
