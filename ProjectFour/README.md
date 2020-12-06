

# Programming Project 4 – Queues in Java

# Objective

The objective of this Programming Project is to apply the concepts of Queues in Java.  

### Program Description

This project manages two lists  of the students' roster with one list implemented as a Queue ADT. One  list represents the students who are are registered in the class and hence are on the class roster. The other list should represent the students who could not get into course and hence are on the Wait-list of the course. Students who are on the wait-list should be enlisted as a Queue ADT with First-in First-out order. Students who are enlisted first on the Wait-list get a chance on the main class roster first, when there is availability on the main class roster.

**Conditions for adding students on to both the lists:**

For this project, the linked list size of Class Roster as 5. When the Class Roster linked list size is full, next student to be added is to be added on the Wait-list roster. The student gets added at the end of the Wait-list roster.

**Validations for User Input:**

student ID -- should not already exist in either Class Roster or Wait-list Roster  

Year -- Should be entered as Freshmen, Sophomore, Junior, or Senior

(You may decide that only first letter or first 2 letters of Freshmen, Sophomore, Junior, or Senior are valid user inputs, for example:

(F)reshmen, (S)ophomore, (J)unior, (S)enior      OR  (Fr)eshmen, (So)phomore, (Ju)nior, (Se)nior )

**Condition for dropping a student:**

There should be menu options that allow students to be dropped out of any of the two lists. If the student drops out of Class Roster, then the first element on Wait-list roster should be removed and added to the Class Roster. In this implementation, only first student would be able to drop out from Wait--list roster!! Write a suitable message for this. (Search is done with the Student ID.)

**The user can choose from the following menu options:**

• Find a Student

• Add a Student

• Drop a Student

• Print all Students (Both Class Roster and on Wait-List)

• Quit

#### &copy; 2020 S Nagpal, Worcester State University

<img src="http://mirrors.creativecommons.org/presskit/buttons/88x31/png/by-sa.png" width=100px/>This work is licensed under the Creative Commons Attribution-ShareAlike 4.0 International License. To view a copy of this license, visit [http://creativecommons.org/licenses/by-sa/4.0/]() or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
