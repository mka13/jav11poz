package pl.sda.bookstore.menu.customer;

import java.util.Scanner;

public class customerManager {
    public static Customer createCustomer(Scanner sc){
        System.out.println("Wybierz: ");
        System.out.println("1.Użytkownik prywatny");
        System.out.println("2.Firma");
        int zmienna=sc.nextInt();
        sc.nextLine();
        //TODO Zaimplementować pętle wyboru
        if(zmienna==1){
            System.out.println("imie");
            String Name = sc.nextLine();
            System.out.println("nazwisko");
            String Surname = sc.nextLine();
            System.out.println("Adres");
            String Adres = sc.nextLine();
            return new User(Name,Surname,Adres);



        }else if(zmienna==2){
            System.out.println("Nazwa firmy");
            String companyName = sc.nextLine();
            System.out.println("Tax code");
            String taxCode = sc.nextLine();
            System.out.println("Adres");
            String adresFirmy = sc.nextLine();
            return new User(companyName,taxCode,adresFirmy);


        }else{
            System.out.println("xxx");
            return null;
        }

    }


}
