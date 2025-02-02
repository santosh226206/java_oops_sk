package com.santos.oops.inheritance;

public class Student extends Human{

    public Student(String hair) {
        super();
        //super(hair);
        this.setHair(hair);
        //super.setHair("-blavk");
    }

    public void printHair(){
        System.out.println(super.getHair());
    }
}
