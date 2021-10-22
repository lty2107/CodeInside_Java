package com.javaproject.codeinside.lab;

public class Company implements IService {
    String name;
    String individualNumber;
    String bankAccountNumber;

    public Company(String name, String individualNumber, String bankAccountNumber)
    {
        this.name = name;
        this.individualNumber = individualNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String makeService(){
        return ("Company:" + name + ", " + bankAccountNumber + ", " + individualNumber);
    }
    @Override
    public String getName(){
        return (name + "," + individualNumber);
    }
    @Override
    public String getShortName(){
        return name;
    }


}
