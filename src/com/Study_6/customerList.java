package com.Study_6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class customerList {
    private List<customer> listOfCust;
    //Constructor
    public customerList(){
        listOfCust = new ArrayList<customer>();
    }
    /*Add customer
     *   Given params:
     *       -name    value of name
     *       -adress  value of adres
     *       -VATID   value of VATID
     */
    public void addCustomer(String name,int VATID,String adres){
        listOfCust.add(new customer(name,VATID,adres));
    }
    /*Delete customer
     *   Given params:
     *       -VATIDIndex     this is VAT id of client which go to delete
     */
    public void deleteCustomer(int VATIDIndex){
        for (int i=0;i<listOfCust.size();i++) {
            if(VATIDIndex==listOfCust.get(i).VATID){
                listOfCust.remove(i);
            };
        }
    }
    /*Edit customer
     *   Given params:
     *       -VATIDIndex     chose of wicht customer is going to edit
     *       -option         chose of field to edit
     *           1   Edit name
     *           2   Edit Adres
     *           3   Edit VATID
     *       -newName    if chose option 1 is matter, new name
     *       -newAdress  if chose option 2 is matter, new adres
     *       -newVATID   if chose option 3 is matter, new VATID
     */
    public void editCustomer(int VATIDIndex,int option,String newName, String newAdress, int newVATID){
        for (int i=0;i<listOfCust.size();i++) {
            if(VATIDIndex==listOfCust.get(i).VATID){
                Scanner sc= new Scanner(System.in);
                switch (option){
                    case 1:
                        listOfCust.get(i).name=newName;
                        break;
                    case 2:
                        listOfCust.get(i).adress=newAdress;
                        break;
                    case 3:
                        listOfCust.get(i).VATID=newVATID;
                        break;
                    default:
                        System.out.println("Wrong option");
                        break;
                }
            };
        }
    }
    /*List customer
    * List all stored customer
     */
    public void listCustomer(){
        for (customer cust: listOfCust) {
            System.out.println(
                    "Name: "+cust.name+"\n"+
                            "VAT id : " + cust.VATID+"\n"+
                            "Date of creation: " +cust.creatDate+"\n"+
                            "Adres: " + cust.adress+"\n"
            );
        }
    }
    private class customer {
        //Fields of the class
        private String name;
        private int VATID;
        private Date creatDate;
        private String adress;
        /* constructor
         * Enter:
         *   -name       String
         *   -VATID      int
         *   -creatDate  Date
         *   -adress     String
         */
        public customer(String name, int VATID, String adress) {
            this.name = name;
            this.VATID = VATID;
            this.creatDate = new Date();
            this.adress = adress;
        }
    }
}
