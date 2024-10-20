package org.chat;

public class FirendsDisplay {
    private String name;
    private Integer age;
    private String phoneNumber;

    public void update(String name, Integer age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        display();
    }

    private void display(){
        System.out.println("=============친구 목록============");
        System.out.println("친구 목록 - 이름:" + this.name + "나이 : " + this.age + "전화번호 : " + this.phoneNumber);
    }
}
