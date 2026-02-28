public class MAIN {
    public static void main(String[] args) {

        
        Person p1 = new Person("Umid", "Ganbarov", "Male");
        Person p2 = new Person("Umid", "Ganbarov", "Male");
        System.out.println(p1);
        System.out.println("p1 equals p2: " + p1.equals(p2));

        
        Teacher t1 = new Teacher("Ali", "Mammadov", "Male", "Computer Engineering", "OOP,Data Structures");
        System.out.println(t1);

        //Studenti test
        Student s1 = new Student("Aysu", "Aliyeva", "Female", "22856");
        System.out.println(s1);

        // PhdStudenti test
        PhdStudent phd1 = new PhdStudent("Elvin", "Hasanov", "Male", "20565", "AI","Machine Learning");
        System.out.println(phd1);
    }
}