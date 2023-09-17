package day26_statics.studentTask;

import day26_statics.studentTask.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //StudentGroup HAS a Student

    public String groupName;
    public String groupID;
    public ArrayList<Student> students;

    public StudentsGroup(String groupName, String groupID) {//creates the studentGroup objects by setting the groupName and groupID
        this.groupName = groupName;
        this.groupID = groupID;
        students = new ArrayList<>(); // size : 0
    }

    public void addStudent (Student student){
        students.add(student);
    }//Takes one student object, and adds it to the ArrayList of students

    public void addStudents(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }


    public void addStudent(String name, int age, char gender, String ID){
        Student student = new Student(name, age, gender, ID);
        students.add(student);
    }//Takes name, age, gender, ID of student info and creates student object by using that information, then adds the student object to the ArrayList students

    public void removeStudent (String ID){
        students.removeIf(p -> p.ID.equals(ID));
    }// Takes one ID and then removes the student object from ArrayList student

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupID='" + groupID + '\'' +
                ", number of students=" + students.size() +
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup
	 Attributes:
	   groupName, groupId, students (ArrayList<Students>)
	   Add a constructor that can set the groupId and groupName
	   initialize students arraylist in the constructor's body
	  Methods:
	     addStudent(Student): adds the specified student to the students arrayList
	      removeStudent(id): removes the student with the specified id from the students arraylist
	      toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */