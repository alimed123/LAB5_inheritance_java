package lab5;

public class Student extends Person{
    public static final String[] class_status_l = {"Freshman", "Sophomore", "Junior", "Senior"};
    private String status;
    
    //default constructor
    Student(){
        super();
        this.status = class_status_l[0];
        System.out.println(" constructor Student has been called");
    }

    //copy constructor
    Student(Student other){
        if (other != null){
            String name = other.name;
            this.name = name;
        }
        else{
            this.name = class_status_l[0];
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
    
        Student student = (Student) obj;
        return status.equals(student.status);
    }

    @Override
    public String toString() {
        return "Student name is: " + name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
