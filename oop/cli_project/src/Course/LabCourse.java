package Course;

public class LabCourse extends CRS{
    String labequipment;
    int labhours;

    public static void main(String[] args) {
        CRS cours = new CRS();
        cours.coursename ="oop";
        cours.courseID = "OOPJAVA";
        cours.instructor = "seifu";
        cours.duration = 3;
        cours.credits = 5;
        System.out.println("the informaion of the course :"+cours.coursename+","+cours.courseID
                +","+cours.instructor+","+cours.duration+","+cours.credits);

        LabCourse LBC = new LabCourse();
        LBC.coursename ="oracle";
        LBC.courseID = "ORK";
        LBC.instructor = "jemal";
        LBC.duration = 4;
        LBC.credits = 4;
        LBC.labequipment = "desktop";
        LBC.labhours = 3;
        System.out.println("the informaion of the labcourse :"+LBC.coursename+","+LBC.courseID
                +","+LBC.instructor+","+LBC.duration+","+LBC.credits+"."+LBC.labequipment+","+LBC.labhours);
    }
}