package lab5;
public class Staff extends Employee{
    private String title;
    
    //default constructor
    Staff(){
        super();
        this.title = "Default Title";
        System.out.println("constructor Staff has been called");
    }

    // copy constructor
    Staff(Staff other){
        super(other);
        // copy values with new variables
        if (other != null) {
            String title_c = other.title;
            this.title = title_c;
        } 
        else {
            //
            this.title = "Default Title";
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff name is: " + name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
    
        Staff staff = (Staff) obj;
        return title.equals(staff.title);
    }
} 