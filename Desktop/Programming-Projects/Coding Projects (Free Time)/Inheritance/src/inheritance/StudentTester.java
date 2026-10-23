/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author Matthew
 */
public class StudentTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("Matthew Smith", "12");
        Student teacher1 = new Student("Mr. Smith", "n/a");
        System.out.println(student1.name + " " + student1.grade);
        System.out.println(teacher1.name + " " + teacher1.grade);
    }
    
}
