package com.leospiritlee.base.interfaces;

/**
 * @Project: JavaStudyDemo
 * @ClassName Factories
 * @description: simple factory
 * @author: leospiritlee
 * @create: 2020-02-25 18:59
 **/
public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        fact.getName();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Service1Factory());
        // Services are completely interchangeable:
        serviceConsumer(new Service2Factory());
    }

}


interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {

    default void getName(){
        System.out.println("className:" + this.getClass().getSimpleName());
        System.out.println("CanonicalName:" + this.getClass().getCanonicalName());
        System.out.println("TypeName:" + this.getClass().getTypeName());
        System.out.println("Classes:" + this.getClass().getClasses());
        System.out.println("Superclass:" + this.getClass().getSuperclass());
        System.out.println("Interfaces:" + this.getClass().getInterfaces());
    }

    Service getService();
}

class Service1 implements Service {
    Service1() {} // Package access

    @Override
    public void method1() {
        System.out.println("Service1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Service1 method2");
    }
}

class Service1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Service1();
    }
}

class Service2 implements Service {
    Service2() {} // Package access

    @Override
    public void method1() {
        System.out.println("Service2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Service2 method2");
    }
}

class Service2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Service2();
    }
}