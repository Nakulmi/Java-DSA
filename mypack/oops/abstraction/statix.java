package mypack.oops.abstraction;

public class statix{
    public static void main(String args[]){
        Student S1 = new Student(31,"Nakul");
        Student S2 = new Student(32,"Navdeep");
        Student S3 = new Student(34, "Abhijeth");
        S1.display();
        S2.display();
        S3.display();
    }
}
class Student{  
    int rollno;//instance variable  
    String name;  
    static String college ="PIET";//static variable  

    //constructor  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }
        //method to display the values  
    void display (){
        System.out.println(rollno+" "+name+" "+college);
    }  
}