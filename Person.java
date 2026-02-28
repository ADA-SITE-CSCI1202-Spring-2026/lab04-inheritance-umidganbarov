class Person{
    String firstName;
    String lastName;
    String gender;

    public Person(String firstName,String lastName,String gender) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
    }
    
    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName=lastName;   }

    public String getgender() {
        return gender;    }

    public void setGender(String gender) {
        this.gender = gender;    }

    public String toString() {
        return "firstName=" + firstName +
               "/ lastName=" + lastName +
               "/ gender=" + gender ;
    }
    public boolean equals(Person p) {
    if (p == null) return false;

    return firstName.equals(p.firstName) &&
           lastName.equals(p.lastName) &&
           gender.equals(p.gender);
}

}