package lab5;
public class Employee extends Person {
    protected String office;
    protected double salary;
    protected String date_hired;

    public Employee() {
        super();
        this.office = "Default Office";
        this.salary = 0.0;
        this.date_hired = "Default Date Hired";
        System.out.println("constructor Employee has been called");
    }

    // Copy constructor
    public Employee(Employee other) {
        super(other);
        // Check if other is not null
        if (other != null) {
            // copy values with new variables
            String office_c = other.office;
            double salary_c = other.salary;
            String date_hired_c = other.date_hired;
  
            this.office = office_c;
            this.salary = salary_c;
            this.date_hired = date_hired_c;
        } 
        else {
            // Set default values
            this.office = "Default Office";
            this.salary = 0.0;
            this.date_hired = "Default Date Hired";
        }
    }

    @Override 
    public String toString() {
        return "Employee name is: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
    
        Employee employee = (Employee) obj;
        return office.equals(employee.office) && salary == employee.salary && date_hired.equals(employee.date_hired);
    }


    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDate_hired() {
        return this.date_hired;
    }

    public void setDate_hired(String date_hired) {
        this.date_hired = date_hired;
    }

}


