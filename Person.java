package lab5;



// class Person 
public class Person{
    protected String name,address,phone_number,email;
    
    //default constructor
    Person(){super();
    this.name = "Default name";
    this.address = "Default address";
    this.phone_number = "Default phone_number";
    this.email = "Default email";
    }

    //copy constructor
    Person(Person p){
        if (p != null) {
            this.name = p.name;
            this.address = p.address;
            this.phone_number = p.phone_number;
            this.email = p.email;
        } else {
            // Set default values
            this.name = "Default Person";
            this.address = "Default Address";
            this.phone_number = "Default Phone";
            this.email = "Default Email";
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        return name.equals(person.name) &&
               address.equals(person.address) &&
               phone_number.equals(person.phone_number) &&
               email.equals(person.email);
    }

    @Override
    public String toString() {
        return "Person name is: " + name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return this.phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    }







    
