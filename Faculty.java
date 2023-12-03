package lab5;
public class Faculty extends Employee{
    private String office_hours,rank;
    
    Faculty(){
        super();
        this.office_hours = "Default office Hours";
        this.rank = "Default Rank";
        System.out.println(" constructor Faculty has been called");
    }
    Faculty(Faculty p){
        super(p);
        if (p != null){
            String office_hours_c,rankc;
            office_hours_c = p.office_hours;
            rankc = p.rank;
            this.rank =rankc;
            this.office_hours = office_hours_c;
        }
    }

    @Override
    public String toString() {
        return "Faculty employee name is: " + name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
    
        Faculty faculty = (Faculty) obj;
        return office_hours.equals(faculty.office_hours) && rank.equals(faculty.rank);
    }

    public String getOffice_hours() {
        return this.office_hours;
    }

    public void setOffice_hours(String office_hours) {
        this.office_hours = office_hours;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}

