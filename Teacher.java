class Teacher extends Person {
    String department;
    String courses;

    
    public Teacher(String firstName,String lastName,String gender,String department, String courses) {
        super(firstName,lastName,gender); 
        this.department=department;      //bura
        this.courses=courses;
    }
    public String getdepartment() {
        return department;    }

    public void setdepartment(String department) {
        this.department=department;    }

    public String getdourses() {
        return courses;    }

    public void setdourses(String courses) {
        this.courses = courses;    }

    
    public String toString() {
        return super.toString() +
               "/ department="+department +
               "/ courses="+courses;
    }
    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) && 
               department.equals(t.department) &&
               courses.equals(t.courses);
    }
}