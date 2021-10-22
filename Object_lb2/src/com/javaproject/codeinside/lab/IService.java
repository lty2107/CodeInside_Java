package com.javaproject.codeinside.lab;

public interface IService {
    String makeService();
    String getName();
    default String getShortName(){
        return ("Нет Информации!");
    }

}