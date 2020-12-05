package com.wsu.cs;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/**
 * Represents a Student Wait List
 * @author Jim Spisto
 * @version 2
 * @date 10/07/2020
 */


public class WaitListRoster {
    Queue<Student> waitListRoster = new LinkedList<>(); // Creates a Queue of Students on the Wait List
    //ListIterator<Student> waitListIterator;

    /**
     * Returns Wait List
     * @return Queue waitListRoster
     */
    public Queue<Student> getWaitList() {
        return waitListRoster;
    }

    /**
     * Adds Student Objects to Wait List
     * @param myStudent, Student Object to be added
     */
    public void addStudentToWaitList(Student myStudent) {
        waitListRoster.add(myStudent);
    }

    /**
     * Returns first Student Object on the Wait List
     * @return
     */

    public Student getFirstStudent() {
        return waitListRoster.peek();
    }

    /**
     * Returns the size of the Wait List
     * @return int, size of Wait List, Queue
     */

    public int getWaitListSize() {
        return waitListRoster.size();
    }

    /**
     * Checks if the Wait List Queue has Student Objects in it
     * @return boolean, returns true if waitListRoster has a size that is not zero
     */

    public boolean WaitListHasSize(){
        if(waitListRoster.size()!=0){
            return true;
        }
        return false;
    }

    /**
     * Checks if a Student Object is in the Wait List via Student ID
     * Returns true is on the Wait List
     * @param studentID, integer used to Find Students via Student ID
     * @return boolean
     */

    public boolean findStudentFromWaitList(int studentID) {
        for (Student s : waitListRoster) {
            if (s.getStudentID() == studentID)
                return true;
        }
        return false;
    }

    /**
     * Prints a Student Object, with the Student ID of user Supplied int
     * @param num, int used to search for Students via Student ID
     */
    public void printFoundWaitList(int num) {
        for (Student s : waitListRoster) {
            if (s.getStudentID() == num)
                System.out.println(s);
        }
    }

    /**
     * Finds, and Drops Students Objects from Wait List
     * @param studentID, int used to find Students using Student ID
     */

    public void dropStudentFromWaitList(int studentID){
        for(Student s: waitListRoster){
            if (studentID == s.getStudentID() && !waitListRoster.isEmpty()){
                System.out.println("Student With ID: " + waitListRoster.peek().getStudentID() + " Has been removed from the Wait List");
                waitListRoster.poll();
            }
        }
    }

}

