package Course;

public class Course {
        //instance or memeber variables
        String courseName;
        String InstructorName;
        String courseCode;
        int totalCreditHour;
        static int enrolledstudent=39;
    
        public Course(){}
        public Course(String crs, String Instructor, String crscode,int crdhr){
              this.courseName =crs;
              this.InstructorName=Instructor;
              this.courseCode=crscode;
              this.totalCreditHour=crdhr;
         }

    
    
        public void displayCourseInfo(){
            System.out.println("Your Course Informations");
            System.out.println("Course Name: "+this.courseName);
            System.out.println("Instructor Name: "+this.InstructorName);
            System.out.println("total credit hour: "+this.totalCreditHour);
            System.out.println("Number of studnets: "+this.enrolledstudent);
        }
    public String getcourseName(){
        return this.courseName;
    }
    public void setcourseName(String newcourseName ){
        this.courseName = newcourseName;

    }
    
    public static void main(String[] args) {
            //parametirzed method
            Course oop = new Course("object oriented programming","seifu D.","SEng5433",7);
            oop.displayCourseInfo();
            
           System.out.println("+++++++++++++++++++++++++++++++");

           Course adb = new Course();
            adb.courseName = "advanced database";
            adb.InstructorName = "sime A.";
            adb.courseCode ="SEng5422";
            adb.totalCreditHour =7;
            adb.displayCourseInfo();

            //coursename getter method
            System.out.println("1st crsname getted: "+ adb.getcourseName());
            adb.setcourseName("OOP IN JAVA");

            //coursename getter method after updateed
            System.out.println("2nd updated getted: "+ adb.getcourseName());
    
        }
    }