/**
 * GitHub Exercise
 * MainOrganizer.java
 * Purpose: group project for GitHub 
 * @author Yuxuan Xu(Michelle)
 */
// Packages
package githubtest;

// Imports
import java.util.Scanner;

// Organizer class--main
public class MainOrganizer {
  
    /**
     * Executes the program
     * 
     * @param args The command line arguments
     */
    public static void main(String args[]) {
        // Variables
        Scanner input = new Scanner(System.in);
        Class StudentClass = new Class();
        int choice = 1;
        while (choice != 0) {
            // ask User  for Choice
            System.out.print("Would you like to: \n1. add a student  \n2. remove a student " +
                            "\n3. organize the class \n4. display the class \n5. exit \nChoice: ");
            choice = input.nextInt();
            switch(choice) {
                case 1: {
                    // Create code to...
                    // Get user-entered info on new student and call add method 
                   System.out.println("\nGive me name (first name last name) ");
                   input.nextLine();
                   String name = input.nextLine();
                   System.out.print("Give me the year ");
                   int years = input.nextInt();
                   System.out.print("Give me the grade ");
                   int grades = input.nextInt();
                   System.out.println("Give me the gender ");
                   input.nextLine();
                   String gender = input.nextLine();
                   
                   
                   StudentClass.addStudent(name, years, grades,gender);
                   break;
                }
                case 2: {
                    // Create code to...
                    // Remove student using user-entered name
                     System.out.println("\nGive me the name you want to delete (first name last name) ");
                     input.nextLine();
                     String name = input.nextLine();
                     StudentClass.removeStudent(name);
                    break;
                    
                }
                case 3: {
                    // Organize students
                    organizeClass(StudentClass, input);
                    System.out.println(); // Empty Line
                    break;
                }
                case 4: {
                    // Display students
                    System.out.println("\nStudent List:");
                    for (Student student: StudentClass.getStudents()) {
                        System.out.println(student);
                    }
                    break;
                }
                case 5: {
                    // End program
                    System.out.println("\nEnding Program");
                    choice = 0;
                    break;
                }
                default: {
                    // Invalid entry
                    System.out.println("Error, invalid entry. Please try again.");
                    break;
                }
            }
            System.out.println(); // Empty line
        }
    }
    
    // Functions
    /**
     * Takes a user input and organizes the class based on the desired attribute
     * 
     * @param originalClass The class of students
     * @param scan The scanner object
     */
    public static void organizeClass(Class originalClass, Scanner scan) {
        // Student lists
        Student[] origStuds = originalClass.getStudents();
        
        // Organize Students
        int choice2 = 1;
            
        // Get User Choice 2 2
        System.out.print("Would you like to organize by name (1), year (2), or grade (3)?: ");
        choice2 = scan.nextInt();
        switch(choice2) {
            case 1: {
                // Organize by Name
                Student tempStud;
                for (int i = 0; i<origStuds.length; i++) {
                    for (int j = 1; j<origStuds.length-i; j++) {
                        String name1 = origStuds[j-1].getName();
                        String name2 = origStuds[j].getName();
                        if ((name1.compareTo(name2)) > 0) {
                            tempStud = origStuds[j-1];
                            origStuds[j-1] = origStuds[j];
                            origStuds[j] = tempStud;
                        }
                    }
                }
                break;
            }
            case 2: {
                // Organize by Year
                Student tempStud;
                for (int i = 0; i<origStuds.length; i++) {
                    for (int j = 1; j<origStuds.length-i; j++) {
                        int year1 = origStuds[j-1].getYear();
                        int year2 = origStuds[j].getYear();
                        if (year1 > year2) {
                            tempStud = origStuds[j-1];
                            origStuds[j-1] = origStuds[j];
                            origStuds[j] = tempStud;
                        }
                    }
                }
                break;
            }
            case 3: {
                // Organize by Grade
                Student tempStud;
                for (int i = 0; i<origStuds.length; i++) {
                    for (int j = 1; j<origStuds.length-i; j++) {
                        int grade1 = origStuds[j-1].getGrade();
                        int grade2 = origStuds[j].getGrade();
                        if (grade1 > grade2) {
                            tempStud = origStuds[j-1];
                            origStuds[j-1] = origStuds[j];
                            origStuds[j] = tempStud;
                        }
                    }
                }
                break;
            }
            default: {
                // Invalid entry
                System.out.println("Error, invalid entry. Please try again.");
                break;
            }
        }
    }
}
// End of Class