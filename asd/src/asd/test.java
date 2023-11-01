package test;

import java.util.Scanner;

class YourBank{
public String name;
_____________   customerarr;
YourBank(String str) {name = str; }
}

interface PrintInfo{
abstract void printelements();

}
abstract class BankPerson implements  PrintInfo {
String name;
String socialid;
String address;
int year;

abstract String getmembers();
String getname() { return name; }
String getaddress() { return address; } 
String getyear() { return year; } 
public void printelements() {
System.out.println("name: "+ this.name + ", address: " + this.address + ", year: " + this.year);
}
}

class Customer extends BankPerson{
Account account;
int customerid;
String grade;
int score;
String getmembers() { return "customerid: " + this.customerid; } 
String getGrade() {
if((year-2020)>=5&&(score>1000000))
grade=red;
Else if((year-2020)>=2&&(score>500000))
Grade = blue;
return grade; }
}


class Account {
  private String acc_num;
    private int balance;
    Account(String tacc_num) {

        

    }
       int getbalance() {return balance; }
       void setbalance(int num) {balance = num; }
}
 
public class YourBankMain {

public static void main(String[] args) {
int customernum = 3;
        Scanner scan;
        YourBank mybank;
        
     
        
        mybank = new YourBank("The Best Bank");
                          
        mybank.customerarr = new Customer[customernum];
        scan = new _____________ ;
        
         for(___________; i < customernum; i++) {
            

           



}
 System.out.println("========= Customer B List: =========");
        for(int i = 0; i < customernum; ________) {
           System.out.println(i + "-th customer :");
           mybank.customerarr[i]._____________;
           System.out.println(mybank.customerarr[i]._______);
           System.out.println("balance: " + __________________);
           System.out.println("grade: " + ________________);
           System.out.println();
         }
        
      
       
        scan.close();
       }
 
}
 
        