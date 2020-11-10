
import java.util.Scanner;
import base.Bike;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {
    public void GetBike(){
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter: ");
         Bike B = new Bike(sc.next(), sc.nextInt());
 
    }
}
