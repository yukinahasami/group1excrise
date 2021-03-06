/*
 * GitHub Exercise 
 * Student.java
 * Purpose: Group exercise for git hub
 * @author dengyuxin
 * 
 */

package githubtext;


public class Student {
    
    //set variables
    private String name; //student's name
    private int year; //student's year
    private int grade; //student's grade
    private String yearofschool; //year of school
             
    //constructors
    public Student(){
        
        name = "xx x";
        year = 2;
        grade = 50;
        //assign default attributes
    }

    //@param String studentName
    //@param int studentYear
    //@param int studentGrade
    //@param String studentGender
    public Student(String studentName, int studentYear,int studentGrade){
         name = studentName;
         year = studentYear;
         grade = studentGrade;
         
    }
    
    /*
    * This method returns the name of the student
    *@return name of student
    */
    public String getName(){
        return name;
        
    }
    
    //Mutators
    /*
    *This method returns the year of a school for the student
    *@return year of school
    */
    public int getYear(){
        return year;
    }
   
    /*
    *This method returns the grade of the student
    *@return grade of the student
    */
    public int getGrade(){
        
        return grade;
    }
    
    //Accessor
    /*
    *This method set the name of the student
    *@param String name;
    */
    public void setName(String name){
        this.name = name;
        
    }
    
    /*
    *This method set the year of school of the student
    *@param int year;
    */
    public void setYear(int year){
        this.year = year;
        
    }
    
    /*
    *This method set the grade of the student and the grade should be between 0 -100
    *@param int grade;
    */
    public void setGrade(int grade){
        if(grade>0 || grade<100){
            
            this.grade = grade;
        }
        else{
            System.out.println("The grade should be lower than 100 and higher than 0");
    }
    }
    
    /*
    * this method return value in string
    *@return String about student information
    */
    @Override
    public String toString(){
        if (year == 1){
            yearofschool = "Freshman";
        }
        
        else if (year == 2){
            yearofschool = "Sophomore";
        }
        
        else if (year == 3){
            yearofschool = "Junior";
        }
        
        else if (year == 4){
            yearofschool = "Senior";
        }
        
        return "Name: " + name + ",Year of the school: " + yearofschool + ",Grade: " + grade;
    }
    
}
//End of class