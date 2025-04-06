package Course;

public class OfflineCourse extends CRS{
    String location;
    int roomNumber;

    public static void main(String[] args) {
        CRS cours = new CRS();
        cours.coursename ="oop";
        cours.courseID = "OOPJAVA";
        cours.instructor = "seifu";
        cours.duration = 3;
        cours.credits = 5;
        System.out.println("the informaion of the course :"+cours.coursename+","+cours.courseID
                +","+cours.instructor+","+cours.duration+","+cours.credits);

        OfflineCourse ofline = new OfflineCourse();
        ofline.coursename ="dsa";
        ofline.courseID = "dsa432";
        ofline.instructor = "dese";
        ofline.duration = 7;
        ofline.credits = 6;
        ofline.location = "CCI";
        ofline.roomNumber = 17;
        System.out.println("the informaion of the mandatorycourse :"+ofline.coursename+","+ofline.courseID
                +","+ofline.instructor+","+ofline.duration+","+ofline.credits+","+ofline.location+","+ofline.roomNumber);
    }
}