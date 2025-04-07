# CLASS HIERARCHY (RELATIONSHIP)

-> Blueprint Analogy: Just as a car manufacturer creates a blueprint, software developers design a class hierarchy to define relationships between classes.
-> Abstract and Concrete Classes:
    i. An abstract class (e.g., Vehicle) represents a general concept and cannot be instantiated directly. It defines shared functionalities.
    ii. Concrete classes (e.g., Car, Truck, Motorcycle) inherit from the abstract class and can be instantiated.
-> IS-A and HAS-R Relationships:
    i. IS-A: Indicates inheritance (e.g., a Car is a Vehicle).
    ii. HAS-R: Indicates composition (e.g., a Car has an Engine).
-> Inheritance: The extends keyword is used to create subclasses, allowing for multi-level inheritance (e.g., SUV extends Car).
-> Implementation: You will declare the abstract Vehicle class and create concrete classes like Car and Truck, implementing specific attributes and methods.

-> Example:

public class School {
    public static void main(String[] args) {
        Date date1 = new Date(1, 1, 2005);
        Date date2 = new Date(15, 8, 2004);
        Date date3 = new Date(3, 10, 2004);

        Teacher teacher = new Teacher("Arjun", date1, date3, "BTech", "Mechanical");
        teacher.setSalary();
        Student student = new Student("Aryan", date2, teacher, "Computer Science");
        teacher.getDetails();
        student.getDetails();
    }
}

abstract class Person{
    String name;
    Date dob;
    abstract void getDetails();
}

class Date{
    int date;
    int month;
    int year;

    Date(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    String getDate(){
        return this.date+"-"+this.month+"-"+this.year;
    }
}

class Student extends Person{
    String subject;
    Teacher teacher;

    Student(String name, Date date, Teacher teacher, String subject){
        this.name = name;
        this.dob = date;
        this.teacher = teacher;
        this.subject = subject;
    }

    @Override
    void getDetails(){
        System.out.println("Name of the Student: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Teacher: " + this.teacher.name);
    }
}

class Teacher extends Employee{
    String qualification;
    String subject;

    Teacher(String name, Date date1, Date date2, String qual, String subject){
        this.name = name;
        this.dob = date1;
        this.dateOfAppointment = date2;
        this.subject= subject;
        this.qualification = qual;
    }
    @Override
    void getDetails(){
        System.out.println("Name of the Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualification: " + this.qualification);
    }
    @Override
    void setSalary(){
        this.salary = 5000;
    }
    @Override
    int getSalary(){
        return this.salary;
    }
}

abstract class Employee extends Person{
    Date dateOfAppointment;
    int salary;
    abstract void setSalary();
    abstract int getSalary();
}