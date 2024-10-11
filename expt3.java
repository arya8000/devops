import java.util.Scanner;
public class expt3{
    public static void main(String[] args) {
        String name;
        int age;
        char gender;
        double salary;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter name: ");
        name= console.nextLine();
        System.out.print("Enter age: ");
        age= console.nextInt();
        System.out.print("Enter gender: ");
        gender= console.next().charAt(0);
        System.out.print("Enter salary: ");
        salary= console.nextDouble();
        System.out.println("Name: "+ name + "\nAge: " + age + "\nGender: " + gender + "\nSalary: " + salary);
    }
}
