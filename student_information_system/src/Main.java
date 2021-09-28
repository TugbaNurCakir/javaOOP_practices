public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("özlem","9845734985","MAT");
        Teacher teacher2 = new Teacher("cem","2432","FZK");
        Teacher teacher3 = new Teacher("kenan","sfa","BIO");

        Course mathematic   = new Course("Matematik", "101", "MAT");
        mathematic.addTeacher(teacher1);

        Course physic   = new Course("Fizik", "102", "FZK");
        physic.addTeacher(teacher2);

        Course biology   = new Course("Biyoloji", "103", "BIO");
        biology.addTeacher(teacher3);



        Student s1 = new Student("tugba", "123", "4", mathematic, physic, biology);
        s1.addBulkExamNote(50, 75, 80, 20);
        s1.isPass();
    }
}
