
package data;

import base.Bike;
import base.Parcel;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike ("Volvo" , 255);
        bikes[1] = new Bike ("Vigo" , 256);
        bikes[2] = new Bike ("Toyota" , 257);
      //test
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
       
        person[0] = new Person("Jack" , "Black");
        person[1] = new Person("Mark" , "Trump");
        person[2] = new Person("Max" , "Smith");
        return person;
        // your code

        
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}

