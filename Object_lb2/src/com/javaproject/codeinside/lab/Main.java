package com.javaproject.codeinside.lab;

public class Main {
    public static void main(String[] args) {
        Company UFC = new Company("ООО ЮФС", "3225443","16937896");
        Freelancer Maxim = new Freelancer("Maxim", "19912084");
        System.out.println(UFC.makeService());
        System.out.println(Maxim.makeService());

    }
}
