package com.kodewala.users;
// if class is in different package we need to import it before using
import com.kodewala.account.Account;

class User{

  public static void main(String args[]){

   System.out.println("User.main()");
   
   // using Account class which is in different package
   Account acc = new Account();
   acc.showAccountInfo();

}
}