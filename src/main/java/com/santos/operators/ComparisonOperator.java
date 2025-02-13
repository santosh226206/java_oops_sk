package com.santos.operators;

public class ComparisonOperator {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        System.out.println(str1);
        Student student=new Student("santosh");
        Student student1=new Student("santosh");
        Employee employee=new Employee("santosh");
        System.out.println(student.equals(student1));
    }
}
