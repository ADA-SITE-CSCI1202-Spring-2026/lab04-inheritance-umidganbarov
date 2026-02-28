class PhdStudent extends Student {
    String department;
    String courses;

    public PhdStudent(String firstName, String lastName, String gender,
                      String studentId, String department, String courses) {
        super(firstName, lastName, gender, studentId); 
        this.department = department;
        this.courses = courses;
    }
    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department=department;
    }

    public String getcourses() {
        return courses;    }

    public void setcourses(String courses) {
        this.courses = courses;    }

    public String toString() {
        return super.toString()+"/ department="+department+"/ courses=" + courses;    }

    public boolean equals(PhdStudent pStud) {
        if (pStud == null) return false;
        return super.equals(pStud) &&  department.equals(pStud.department) && courses.equals(pStud.courses);
    }
}