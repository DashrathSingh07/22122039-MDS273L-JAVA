Lab 6
Create a Student class, that will store the details of the Student, below mentioned are the attributes of a student.
Reg. No.
Name
Email
Phone
Class
Department
The Student class will have the following methods:
A constructor to initialize the values of the Student
A method to print the Details of the Student.
A method (named 'toString()) that convert the student details to string, and can be used to write the student details to file.
In the main-method class, create an array of Student Class to hold maximum details of 100 Students.

In the menu-driven program, the menu options will have
Add a student
Adds the details of 1 student to the array of Student.
Search for a student
Search for the details of a student from the array of Student.
Searching can be done with Name or Register Number.
Update the details of a student
Update the student details based on the search based on name or register number.
Display all students
Displays the details of all students.
Save the details of each student in a file, with the student name as filename.

Note: Make use of functions to implement the menu options.

Once the program is complete
Add the code to GitHub under the folder Lab 6.
Create a README.md file for documentation.
Add proper comments in the code.
Create a flowchart using the online tool and update the README.md file.
Update the changes to the GitHub website and submit the URL.


------------------- OUTPUT ---------------------------

**************************************
---- Your Choices: -------------------
---- 1. Add a student -----------------
---- 2. Search for a student ----------
---- 3. Update the details of a student
---- 4. Display all students ----------
---- 5. Exit --------------------------
Enter Choice: 1

**** Enter Student 1 Details ****
Reg No : 22122039
Name : Dashrath
Email : Dashrath@gmail.com
Phone : 7698447392
Class: MScDS A
Departement: data science
file exist

**************************************
---- Your Choices: -------------------
---- 1. Add a student -----------------
---- 2. Search for a student ----------
---- 3. Update the details of a student
---- 4. Display all students ----------
---- 5. Exit --------------------------
Enter Choice: 1

**** Enter Student 2 Details ****
Reg No : 22122034
Name : Ashish 
Email : Ashish@gmail.com
Phone : 985741201
Class: MScDs A
Departement: Data Science
file not exist
file created

**************************************
---- Your Choices: -------------------
---- 1. Add a student -----------------
---- 2. Search for a student ----------
---- 3. Update the details of a student
---- 4. Display all students ----------
---- 5. Exit --------------------------
Enter Choice: 2
Search Student by.....
 1. Name
 2. Register No
Press (1 Or 2):
1
Enter Student Name: Dashrath

**** Details of a Dashrath . ****
Reg No : 22122039
Name : Dashrath
Email :Dashrath@gmail.com
Phone: 7698447392
Class : MScDS A
Department :data science

**************************************
---- Your Choices: -------------------
---- 1. Add a student -----------------
---- 2. Search for a student ----------
---- 3. Update the details of a student
---- 4. Display all students ----------
---- 5. Exit --------------------------
Enter Choice: 2
Search Student by.....
 1. Name
 2. Register No
Press (1 Or 2):
2       
Enter Student Register no: 22122034

**** Details of a Ashish  . ****
Reg No : 22122034
Name : Ashish
Email :Ashish@gmail.com
Phone: 985741201
Class : MScDs A
Department :Data Science

**************************************
---- Your Choices: -------------------
---- 1. Add a student -----------------
---- 2. Search for a student ----------
---- 3. Update the details of a student
---- 4. Display all students ----------
---- 5. Exit --------------------------
Enter Choice: 3
Enter Student Register no: 22122034
Name : Ashish pipaliya
Email : Ashish.pipaliya@gmail.com
Phone : 6532145236
Class: MScDSA
Departement: data Science
file not exist
file created

**************************************
---- Your Choices: -------------------
---- 1. Add a student -----------------
---- 2. Search for a student ----------
---- 3. Update the details of a student
---- 4. Display all students ----------
---- 5. Exit --------------------------
Enter Choice: 4

**** Details of a Dashrath . ****
Reg No : 22122039
Name : Dashrath
Email :Dashrath@gmail.com
Phone: 7698447392
Class : MScDS A
Department :data science

**** Details of a Ashish pipaliya . ****
Reg No : 22122034
Name : Ashish pipaliya
Email :Ashish.pipaliya@gmail.com
Phone: 6532145236
Class : MScDSA
Department :data Science
