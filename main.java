package lab5;

public class main{
    public static void main(String[] args){

        //initiating the constructos by this order such that person as first student then employee and then the subclasses for employee
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();
        
        //those will all work
        Person test_p_1 = person;
        Person test_p_2 = student;
        Person test_p_3 = employee;
        Person test_p_4 = faculty;
        Person test_p_5 = staff;

        

        Employee test_e_1 = faculty;
        Employee test_e_2 = staff;
        Employee test_e_i = employee;

        Student test_s_i = student;
        
        //these will not work compile error

        /*Student test_s_1 = person;
        Student test_s_3 = employee;
        Student test_s_4 = faculty;
        Student test_s_5 = staff;

        all the rest will not work
        */

        boolean checkP_S = person instanceof Student; 
        boolean checkP_E = person instanceof Employee; 
        boolean checkP_F = person instanceof Faculty; 
        boolean checkP_St = person instanceof Staff; 

        boolean checkS_P = student instanceof Person; 
        //boolean checkS_E = student instanceof Employee; 
        //boolean checkS_F = student instanceof Faculty; 
        //boolean checkS_St = student instanceof Staff; 

        boolean checkE_P = employee instanceof Person; 
        //boolean checkE_S = employee instanceof Student; 
        boolean checkE_F = employee instanceof Faculty; 
        boolean checkE_St = employee instanceof Staff; 

        boolean checkF_P = faculty instanceof Person; 
        //boolean checkF_S = faculty instanceof Student;
        boolean checkF_E= faculty instanceof Employee; 
        //boolean checkF_St = faculty instanceof Staff; 

        boolean checkSt_Person = staff instanceof Person; 
        //boolean checkSt_S = staff instanceof Student; 
        boolean checkSt_E = staff instanceof Employee; 
        //boolean checkS_F = staff instanceof Faculty; 
        
        Person firstP = new Person();
        Person copiedP = new Person(firstP);

        boolean areEqual = firstP.equals(copiedP);
        System.out.println("Are the original and copied persons equal? " + areEqual); //output is true

        Person p=new Person(),pe,ps,pf,pt;
        pe=new Employee();
        ps=new Student();
        pf= new Faculty();
        pt= new Staff();
    
        System.out.println("toString is called for p :" + p.toString()); // output  toString is called for p :Person name is: Default name
        System.out.println("toString is called for pe :" + pe.toString());// output toString is called for pe :Employee name is: Default name
        System.out.println("toString is called for ps :" + ps.toString());// output toString is called for ps :Student name is: Default name
        System.out.println("toString is called for pf :" + pf.toString());// output toString is called for pf :Faculty employee name is: Default name
        System.out.println("toString is called for pt :" + pt.toString());// output toString is called for pt :Staff name is: Default name


        System.out.println("equals on p with pe :" + p.equals(pe));
        System.out.println("equals on p with ps :" + p.equals(ps));
        System.out.println("equals on p with pf :" + p.equals(pf));
        System.out.println("equals on p with pt :" + p.equals(pt));

    
    }       
}