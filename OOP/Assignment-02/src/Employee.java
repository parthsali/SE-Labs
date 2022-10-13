import java.util.Scanner;
import java.lang.Math;

public class Employee {
    String employeeName;
    int employeeID;
    String status;
    String employeeMail;
    String employeeAd;
    int employeeMob;
    double basicPay;

    void getData(){
        int min = 1000000;
        int max = 9999999;
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        employeeName = sc.nextLine();
        employeeID = (int)(Math.random()*(max - min + 1) + min);
        System.out.print("Mail: ");
        employeeMail = sc.nextLine();
        System.out.print("Address: ");
        employeeAd = sc.nextLine();
        System.out.print("Mobile Number: ");
        employeeMob = sc.nextInt();
    }

    void displayData(){
        System.out.println("----------Personal Info----------");
        System.out.println("Name            : " + this.employeeName);
        System.out.println("ID              : " + this.employeeID);
        System.out.println("Status          : " + this.status);
        System.out.println("Mail            : " + this.employeeMail);
        System.out.println("Address         : " + this.employeeAd);
        System.out.println("Mobile No       : " + this.employeeMob);
        System.out.print("\n");
    }

}
