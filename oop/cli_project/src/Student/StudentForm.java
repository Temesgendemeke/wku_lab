package HOMESTUDENTW;

public class StudentForm {
    String Firstname;
    String Fathername;
    String Dateofbirth;
    int age;
    String Gender;
    Double Contactno;
    int Yearofjoin;
    String Id;
    String department;

    StudentForm(String Firname, String FaName, String DofB, int age, String G, Double Cno, int YOfj, String Id,
            String Dep) {
        this.Firstname = Firname;
        this.Fathername = FaName;
        this.Dateofbirth = DofB;
        this.age = age;
        this.Gender = G;
        this.Contactno = Cno;
        this.Yearofjoin = YOfj;
        this.Id = Id;
        this.department = Dep;

    }

    public String toString() {
        return "\nFirstname : " + Firstname + "\nFathername  : " + Fathername + "\nDateofbirth  :" + Dateofbirth
                + "\nAge : "
                + age
                + "\nGender : " + Gender + "\nContactnumber : " + Contactno + "\nYearofjoin : " + Yearofjoin
                + "\nStudent Id : " + Id + "\nDeparetment  " + department;

    }

    public static void main(String[] args) {
        StudentForm student1 = new StudentForm("Temesgen", "Teka", "Nov/16/2001", 24, "Male", 0.969138931, 2024,
                "NSR/1007/16", "Software Enginnering");
        String Stud = student1.toString();
        System.out.println("Student Information" + Stud);
        System.out.println(Stud);
    }

}