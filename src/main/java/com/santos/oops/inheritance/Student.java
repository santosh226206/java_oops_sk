package com.santos.oops.inheritance;

public class Student extends Human{
    public String hair;
    public Student(String hair) {
        super(hair);
        super.setHair("-blavk");
    }

    public void printHair(){
        System.out.printf(this.getHair());
    }
}
