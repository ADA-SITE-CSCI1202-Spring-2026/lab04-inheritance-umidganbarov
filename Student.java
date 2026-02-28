class Student extends Person {
    String studentId;
    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender); 
        this.studentId = studentId;
    }
    public String getstudentId() {
        return studentId;    }

    public void setstudentId(String studentId) {
        this.studentId=studentId;    }

    
    public String toString() {
        return super.toString()+"/ studentId=" + studentId;
    }

    public boolean equals(Student s) {
        if (s == null) return false;
        return super.equals(s) && 
               studentId.equals(s.studentId);
    }
}