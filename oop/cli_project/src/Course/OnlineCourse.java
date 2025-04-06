package BOox_pkg.COURSE;

public class OnlineCourse extends CRS{
    String platform;

    public static void main(String[] args) {
        CRS cours = new CRS();
        cours.coursename ="oop";
        cours.courseID = "OOPJAVA";
        cours.instructor = "seifu";
        cours.duration = 3;
        cours.credits = 5;
        System.out.println("the informaion of the course :"+cours.coursename+","+cours.courseID
                +","+cours.instructor+","+cours.duration+","+cours.credits);

        OnlineCourse online = new OnlineCourse();
        online.coursename ="php";
        online.courseID = "PHP876";
        online.instructor = "John";
        online.duration = 4;
        online.credits = 5;
        online.platform = "W3 SCHOOL";
        System.out.println("the informaion of the onlinecourse :"+online.coursename+","+online.courseID
                +","+online.instructor+","+online.duration+","+online.credits+","+online.platform);
    }
}