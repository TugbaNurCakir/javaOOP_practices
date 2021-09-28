class Teacher {
    String name;
    String  phoneNum;
    String branch;

    //constructor method
    Teacher(String name, String phoneNum, String branch) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.branch = branch;
    }
    void printTeacher(){
        System.out.println("Öğretmenin adı: "+ this.name);
        System.out.println("Öğretmenin telefon numarası: "+ this.phoneNum);
        System.out.println("Öğretmenin branşı: "+ this.branch);

    }

}