package com.employee;

public class Main {

    public static void main(String[] args)
    {
        employee e1 = new employee();
        employee e2= new employee();
        e1.name="frank";
        e1.age=20;
        e1.city="chennai";
        e2.name="gokul";
        e2.age=21;
        e2.city="trichy";

        e1.display();
        e2.display();

    }
}
