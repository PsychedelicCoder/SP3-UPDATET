/*
@Julius Krüger Madsen
 */

import java.util.Scanner;
// import java.lang.Math;
// En kunde skal have et kunde nummer / bestillings nummer når de ringer ind og bestiller en pizza.
// Hvis kunden ringer ind eller bestiller online, skal man også have deres telefon nummmer.

public class Customer {

    //int randomGenMin = 1;
    //int randomGenMax = 1000;
    //boolean haveDiscountCoupon = false;
    //boolean orderedInShop = false;
    int customerNumber = 0;
    int phoneNumber = 0;
    String name;

    //Constructor
    public Customer(int customerNumber, int phoneNumber, String name) {
        this.customerNumber = customerNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    //Denneher Scanner for input "navn" og "telefon nummer" når disse er tastet ind bliver det smidt ind i vores
    //Custommer object og printet ud sammen med det genereret kunde nummer.
    public void customerInput() {

    }

    // Denneher måde er kun mulig fordi vi ikke skal gemme customerNumbers nogen steder og de behøver ikke være unikke.
    // Sekundet systemet bliver genstartet fks. ved en ny dag bliver tælleren nulstillet.
    // Ved en persistent Unique ID løsning kan man bruge java.util.UUID.
    int customerNumberGen() {
        return customerNumber++;
    }

    /*
    public int customerNumberGen(){
    int customerNumber = (int)(Math.random()*(randomGenMin-randomGenMax+1)+randomGenMin);
    //System.out.println(customerNumber);
    return customerNumber;
    }
     */


    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
