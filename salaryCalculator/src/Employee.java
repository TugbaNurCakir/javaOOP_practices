public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int tax;
    int bonus;
    int total;
    int raise;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.total = this.salary;
        this.raise = 0;
        this.bonus = 0;
        this.tax   = 0;
    }

    void tax() { //Maaşa uygulanan vergiyi hesaplayacaktır.
        if (salary < 1000) {
            this.tax = 0;
            //System.out.println(this.tax);
        } else if (salary > 1000) {
            this.tax = this.salary * 3 / 100;
            this.total -= this.tax;
            //System.out.println(this.tax);
        }

    }

    void bonus() {
        if (workHours > 40) {
            this.bonus = (workHours - 40) * 30;
            this.total += this.bonus;
            //System.out.println(this.bonus);
        }else{
            this.bonus = 0;
            this.total+=this.bonus;
        }
    }

    void raiseSalary() {
        if ((2021 - hireYear) < 10) {
            this.raise = this.salary*5/100;

        } else if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
            this.raise = this.salary*10/100;

        } else if ((2021 - hireYear) > 19) {
            this.raise = this.salary*15/100;

        }
    }

    void printInfo() {
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç yılı :" + this.hireYear);
        System.out.println("Maaş artışı :"+ this.raise);
        System.out.println("Vergi :" + this.tax);
        System.out.println("Bonus :" + this.bonus);
        System.out.println("Vergi ve bonuslarla birlikte maaş :" + this.total);
        System.out.println("Toplam maaş :"+(this.salary+this.raise));
    }

}