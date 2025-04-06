package Course;

public class ElectiveCourse extends CRS {
    String prerequisite;
    String department;
    private int duration;

    public static void main(String[] args) {
        CRS cours = new CRS();
        cours.coursename ="oop";
        cours.courseID = "OOPJAVA";
        cours.instructor = "sem";
        cours.duration = 3;
        cours.credits = 5;
        System.out.println("the informaion of the course :"+cours.coursename+","+cours.courseID
        +","+cours.instructor+","+cours.duration+","+cours.credits);

        ElectiveCourse ElC = new ElectiveCourse();
        ElC.coursename ="python";
        ElC.courseID = "PY";
        ElC.instructor = "dev";
        ElC.duration = 2;
        ElC.credits = 5;
        ElC.prerequisite = "computer programming";
        ElC.department = "software engineering";
        System.out.println("the informaion of the electiveCourse :"+ElC.coursename+","+ElC.courseID
                +","+cours.instructor+","+ElC.duration+","+
                ElC.credits+","+ElC.prerequisite+","+ElC.department);

    }
}