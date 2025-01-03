package mypack.oops;

public class oops {
    public static void main (String args[]){
      
        // Student Nakul = new Student(31, "Nakul", 92.6f);
        // Student S1 = new Student(31);
        // Student S2 = new Student("Nakul");
        // System.out.println(Nakul.rno = 31);
        // System.out.println(Nakul.marks = 91.32f);
        // System.out.println(Nakul.name = "nakul mishra");
        // Nakul.classTeacher = "nasmias";
        // Nakul.setCT("Nehal");
        // System.out.println(Nakul.classTeacher);

        // BankAccount MyAcc = new BankAccount();
        // MyAcc.username="NakulMishra";
        // System.out.println(MyAcc.username);
        // MyAcc.SetPassword("abghiodk");
        // System.out.println(MyAcc.GetPassword());

        // Book B1 = new Book();
        // System.out.println(B1.BookName = "Alchemist");
        // System.out.println(B1.pages = 239);
        // B1.SetBookname("Atomic Habits");
        // B1.SetPages(329);
        // System.out.println(B1.GetBookName());
        // System.out.println(B1.GetPages());

        // GmailAccount fresh = new GmailAccount();
        // fresh.name = "Nakul";
        // fresh.username = "nakulmi007";
        // fresh.password = 64584;

        // GmailAccount fresh2 = new GmailAccount(fresh);
        // fresh2.password = 909769;
        
        // Fancy f = new Fancy();
        // System.out.println(f.flavour);
        // System.out.println(f.pound);
        // System.out.println(f.design);
        // Taste t = new Taste();
        // t.t();
        
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,1));
        // System.out.println(calc.sum((float)1.5,(float)2.0));
        // System.out.println(calc.sum(1,1,5));

        Deer d = new Deer();
        d.eats();
    }
}

//Method Overloading 
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

//Method Overriding
class Animal{
    void eats(){
        System.out.println("Eats....");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass....");
    }
}

//Inheritance - Parent class
class Cake{
    String flavour = "Chocolate";
    int pound = 3;
}
//child class
class Fancy extends Cake{
    String design = "Barbie";
}
class Taste extends Cake{
    void t(){
        System.out.println("Good");
    }
}

class GmailAccount{ 
    String name;
    String username;
    int password;

    GmailAccount(){
        System.out.println("Copy constructor");
    }

    //Copy Constructor
    GmailAccount(GmailAccount fresh){
        // this.name = name;
        // this.username = username;
    }
}

// Class used to explain the concept of GETTERS and SETTERS
class Book{
    private String BookName;
    private int pages;

    //Setters
    void SetBookname(String NewName){
        BookName = NewName;
    }
    void SetPages(int NewPages){
        pages = NewPages;
    }
    //Getters
    String GetBookName(){
        return BookName;
    }
    int GetPages(){
        return pages;
    }
}

class Student{
    int rno;
    float marks;
    String name;
    String classTeacher;

    void setCT(String newClassTeacher){
        classTeacher = newClassTeacher;
    }
    Student(int rno){
        System.out.println(rno);
    }
    Student(String name){
        System.out.println(name);
    }
    Student(int rno, String name, float marks){
    }
}

class BankAccount{
    public String username;
    private String password;

    public void SetPassword(String password){
        this.password = password;
    }
    public String GetPassword(){
        return this.password;
    }
}