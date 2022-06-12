public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary >= 1000) {
            return (int) (salary * 0.03);
        } else {
            return 0;
        }
    }

    double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }

    }

    double raiseSalary() {
        int workYear = 2021 - this.hireYear;
        if (workYear < 10 && workYear >= 0) {
            return (int) (salary * 0.05);
        } else if (workYear > 9 && workYear < 20) {
            return (int) (salary * 0.1);
        } else if (workYear > 19) {
            return (int) (salary * 0.15);
        } else {
            return 0;
        }
    }

    public String toString() {
        System.out.println("Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı :" + raiseSalary() +
                "\nVergi ve Bonuslar ile Birlikte Maaş :" + (this.salary + raiseSalary() + bonus() + tax()) +
                "\nToplam Maaş : " + (salary + raiseSalary() + bonus()));
        return null;
    }
}
