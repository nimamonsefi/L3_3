/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        
        System.out.print("Enter Your Name : ");
        student.setName(scanner.next());
        
        System.out.print("Enter Your Last Name : ");
        student.setLastName(scanner.next());
        
        System.out.print("Enter Your Year : ");
        student.setYear(scanner.next());
        
        System.out.print("Enter Your ID : ");
        student.setId(scanner.next());
        
        System.out.print("Enter Your Study : ");
        student.setStudy(scanner.next());
        
        System.out.print("\nEnter Your name : ");
        try {
            student.CheckName(scanner.next());
            System.out.println("\nLast Name :"+student.getLastName()
                    +"\nYear :"+student.getYear()
                    +"\nID :"+student.getId()
                    +"\nStudy :"+student.getStudy());
        } catch (MyException e) {
            System.out.println("Your Name Is Not Correct !!!");
        }
        
        
        
    }
    
}
