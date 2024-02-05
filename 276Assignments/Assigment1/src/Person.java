public abstract class Person {
    //attributes
    private String name;
    private String email;


    //getter and setter
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getEmail() {

        return email;
    }
    public void setEmail(String email) {

        this.email = email;
    }


    //constructor
    public Person (String name, String email){
        this.name = name;
        this.email = email;
    }

    // Overriding the toString method from the Object class
    @Override
    public abstract String toString();

}

