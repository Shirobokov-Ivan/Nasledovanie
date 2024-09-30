import java.util.Scanner;

class Human{
    public String name;
    public int age;
    public String gender;

    public void setName(){
        System.out.print("Your name: ");
        Scanner Name = new Scanner(System.in);
        name = Name.nextLine();

     }
    public void setAge(){
        System.out.print("Your age: ");
        Scanner Age = new Scanner(System.in);
        age = Age.nextInt();

    }
    public void setGender(){
        System.out.print("Your gender: ");
        Scanner Gender = new Scanner(System.in);
        gender = Gender.nextLine();

    }
    public void printHuman(){
        System.out.println("Your name: "+this.name);
        System.out.println("Your age: "+this.age);
        System.out.println("Your gender: "+this.gender);
    }

}

class Student extends Human{
    public int Class;
    public void setClass(){
        System.out.print("Your class: ");
        Scanner clas = new Scanner(System.in);
        Class = clas.nextInt();

    }
}

public class Main{
    public static void main(String[] args){
        Student Ivan = new Student();
        Ivan.setName();
        Ivan.setAge();
        Ivan.setGender();
        Ivan.printHuman();
    }
}

//Наследование — это процесс, когда один класс наследует свойства и методы другого класса