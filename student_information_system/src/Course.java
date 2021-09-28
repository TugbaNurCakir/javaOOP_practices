class Course {
    //Bunlar kurs class ına ait nitelikler.
    Teacher teacher; //kursa ait bir öğretmen nesnesi ekledik.
    String name;
    String code;
    String prefix;
    int note;
    int quizNote;


    //constructor method
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note=0;
        this.quizNote=0;
    }
    //Bunlar kurs class ına ait davranışlar(metodlar).
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacher();
        }
        else{
            System.out.println("Branş ve kodlar uyuşmadı.");
        }
    }
    void printTeacher(){
        this.teacher.printTeacher();
    }
}
