package com.wsu.cs;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Gets User Information for ClassRoster and WaitListRoster methods
 * @author Jim Spisto
 * @version 2
 * @date 10/07/2020
 */


public class StudentRoster {

    ClassRoster myRoster = new ClassRoster();
    WaitListRoster studentWaitList = new WaitListRoster();
    public boolean checkYear(String year){
        if (year.equals("Fr") || year.equals("So")|| year.equals("Ju")|| year.equals("Se") ){
            return true;
        }
        return false;
    }


    /**
     * Gets user information and creates a Student Object
     * Moves the Student Objects to the Class Roster, and wait list
     * @param in, the Scanner to read from.
     */

    public void addStudent(Scanner in)

    {
        System.out.println("Enter Student ID");
        String tempID= in.nextLine();
        int tempStudentID = Integer.parseInt(tempID);
        if (!myRoster.searchBothLists(tempStudentID)){
            int userStudentID = tempStudentID;
        System.out.println("Enter Student First Name");
        String userFirstName= in.nextLine();
        System.out.println("Enter Student Last Name");
        String userLastName = in.nextLine();
        System.out.println("Enter Year: (Fr)eshmen, (So)phomore, (Ju)nior, (Se)nior");
         String tempYear = in.nextLine();
         if (checkYear(tempYear)){
            String userYear = tempYear;

        Student userStudent = new Student(userStudentID,userFirstName,userLastName,userYear);
        myRoster.addStudentToList(userStudent);
        myRoster.moveStudentsToWaitList();}
        else {
            System.out.println("Invalid Input for Student Year");
         }
        }

        else {
            System.out.print("That Student is already on the ");
            myRoster.printUserStudents(tempStudentID);
        }
    }
    /**
     * Prints whether Student Object is in Class Roster or is on Wait List.
     * @param in the Scanner to read from.
     */

    public void findStudent(Scanner in)
    {
        System.out.println("Enter Student ID to find");
        int userID = in.nextInt();
        if(myRoster.searchBothLists(userID)){
        System.out.print("Student "+ userID + " Is on the ");
        myRoster.printUserStudents(userID);
        }
        else{
            System.out.println("Student Not Found");
        }

    }


    /**
     * Takes a user int and calls the drop student methods
     * in the StudentRoster class
     * @param in
     */

    public void dropStudent(Scanner in)
    {
        System.out.println("Enter Student ID to Drop");
        int userID = in.nextInt();
        myRoster.dropStudentFromList(userID);

    }

    /**
     *Prints Students in the Class list and Wait List
     */

    public void printAllStudents() {
        myRoster.printLists();
    }

    //Driver
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        StudentRoster sr = new StudentRoster();

        System.out.println("Welcome to the CS Student Roster");
        System.out.println("--------------------------------");

        boolean done = false;
        while (!done)
        {
            System.out.print("Students in Course: (F)ind, (A)dd, (D)rop, (P)rint, or (Q)uit: ");
            String choice = in.next();
            if (choice.equals("F") || choice.equals("f"))
            {
                sr.findStudent(new Scanner(System.in));
            }
            else if (choice.equals("A") || choice.equals("a"))
            {
                sr.addStudent(new Scanner(System.in));
            }
            else if (choice.equals("D") || choice.equals("d"))
            {
                sr.dropStudent(new Scanner(System.in));
            }
            else if (choice.equals("P") || choice.equals("p"))
            {
                sr.printAllStudents();
            }
            done = choice.equals("Q") || choice.equals("q");
        }
        System.out.println("Good bye.  Have a nice day!");
        in.close();
    }

}
