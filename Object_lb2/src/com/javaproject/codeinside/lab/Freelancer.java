package com.javaproject.codeinside.lab;

public class Freelancer implements IService {
    String userName;
    String payNumber;

    public Freelancer(String userName, String payNumber)
    {
        this.userName = userName;
        this.payNumber = payNumber;
    }

    @Override
    public String makeService(){
        return ("Freelancer:" + userName + ", " + payNumber);
    }
    @Override
    public String getName(){
        return (userName);
    }
}
