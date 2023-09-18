package com.mycompany.encapdemo;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        
        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Faradilla Roudhotul Sa'naa");
        encap2.setAge(15);
        
        System.out.println("Name    : " + encap.getName());
        System.out.println("Age     : " + encap.getAge());
        System.out.println("--------------------------");
        System.out.println("Name    : " + encap2.getName());
        System.out.println("Age     : " + encap2.getAge());
    }
}
