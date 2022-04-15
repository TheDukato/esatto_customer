package com.Study_6;
public class Main {

    public static void main(String[] args) {
        customerList custList = new customerList();
        custList.addCustomer("Bob",111111111,"Ulica1");
        custList.addCustomer("Alice",222222222,"Ulica2");
        custList.addCustomer("John",333333333,"Ulica3");
        custList.addCustomer("Frank",444444444,"Ulica4");
        custList.addCustomer("Joana",555555555,"Ulica5");
        custList.listCustomer();
        System.out.println("###################Delete customer############################");
        custList.deleteCustomer(555555555);
        custList.listCustomer();
        System.out.println("#####################Edit customer##########################");
        custList.editCustomer(333333333,1,"Kamil","s",1);
        custList.listCustomer();
        System.out.println("#######################Enter wrong VATID########################");
        custList.deleteCustomer(123456789);
        custList.listCustomer();

    }
}
