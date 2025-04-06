package Course;

public class ShortTermCourse extends CRS {
    int intensiveDays;
    boolean certificate;

    public static void main(String[] args) {
        CRS cours = new CRS();
        cours.coursename ="oop";
        cours.courseID = "OOPJAVA";
        cours.instructor = "seifu";
        cours.duration = 3;
        cours.credits = 5;
        System.out.println("the informaion of the course :"+cours.coursename+","+cours.courseID
                +","+cours.instructor+","+cours.duration+","+cours.credits);

        ShortTermCourse STC = new ShortTermCourse();
        STC.coursename ="OS";
        STC.courseID = "OS21";
        STC.instructor = "kerl";
        STC.duration = 2;
        STC.credits = 6;
        STC.intensiveDays = 16;
        STC.certificate = true;
        System.out.println("the informaion of the short term course :"+STC.coursename+","+STC.courseID
                +","+STC.instructor+","+STC.duration+","+STC.credits+","+STC.intensiveDays+","+STC.certificate);
    }
}