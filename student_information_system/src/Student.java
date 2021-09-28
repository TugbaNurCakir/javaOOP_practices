class Student {
    Course c1;
    Course c2;
    Course c3;
    Course quiz;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    //constructor method
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average=0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3, int quiznote){
        if(note1>=0 && note1<=100){
            this.c1.note = note1;
            this.quiz.quizNote=quiznote;
        }
        if(note2>=0 && note2<=100){
            this.c2.note = note2;
            this.quiz.quizNote=quiznote;
        }
        if(note3>=0 && note3<=100){
            this.c3.note = note3;
            this.quiz.quizNote=quiznote;
        }

    }
    void isPass(){
       this.average= (this.c1.note+this.c2.note+this.c3.note+this.quiz.quizNote)/3.0;
       if(this.average>55){
           System.out.println("Sınıfı başarıyla geçti.");
           this.isPass=true;
       }
       else{
           System.out.println("Kaldınız.");
           this.isPass=false;
       }
       printNote();
    }
    void calcAverage(){

    }
    void printNote(){
        System.out.println("C1 NOTU: "+c1.note);
        System.out.println("C2 NOTU: "+c2.note);
        System.out.println("C3 NOTU: "+c3.note);
    }
}
