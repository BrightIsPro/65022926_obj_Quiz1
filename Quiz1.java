public class Quiz1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SetGPA(4);
        s1.SetaddmissionYear(1);
        s1.ShowDetails();
    }
}

class Student {

    Integer addmissionYear;
    Integer GPA;
    StudentID ID = new StudentID();

    Student () {
        this.addmissionYear = 0;
        this.GPA = 0;
    }

    Student (int addmissionYear,int GPA){
        this.addmissionYear = addmissionYear;
        this.GPA = GPA;
    }

    public void SetaddmissionYear(int NewAddmissionYear){
        this.addmissionYear = NewAddmissionYear;
    }

    public void SetGPA (int NewGPA){
        this.GPA = NewGPA;
    }

    public void ShowDetails() {
        System.out.println("***************************************************");
        System.out.println("addmissionYear: "+ addmissionYear);
        System.out.println("GPA: "+ GPA); 
        ID.increaseID();
        System.out.println("StudentID: "+ ID.getID());
        System.out.println("***************************************************");
    }
    class StudentID{
        private static int count = 1;
        public int container1;
        public void increaseID(){
            this.container1 = count++;
        }
        public int getID(){
            return this.container1;
        }
    }

}

