class Student {
    int rollno;
    String name;
    double percentage;

    Student(int r, String n, double p) {
        this.rollno = r;
        this.name = n;
        this.percentage = p;
    }
}

class Employee {
    int id;
    String name;
    double annualSalary;

    Employee(int i, String n, double a) {
        this.id = i;
        this.name = n;
        this.annualSalary = a;
    }
}

class Bank {
    // Loan for Student
    void approveLoan(Student s) {
        if (s.percentage > 80) {
            System.out.println("Loan Approved for Student: 2 lakh ");
        } else if (s.percentage > 60 && s.percentage <= 80) {
            System.out.println("Loan Approved for Student: 1 lakh ");
        } else if (s.percentage > 40 && s.percentage <= 60) {
            System.out.println("Loan Approved for Student: 50k ");
        } else {
            System.out.println("Loan Denied for Student");
        }
    }

    // Loan for Employee
    void approveLoan(Employee e) {
        if (e.annualSalary > 1200000) {
            System.out.println("Loan Approved for Employee: 7 lakh ");
        } else if (e.annualSalary > 1000000 && e.annualSalary <= 1200000) {
            System.out.println("Loan Approved for Employee: 6 lakh ");
        } else {
            System.out.println("Loan Denied for Employee");
        }
    }
}

class Test {
    public static void main(String args[]) {
        Student s1 = new Student(1, "Atul", 75);
        Employee e1 = new Employee(101, "Ravi", 1500000);

        Bank b1 = new Bank();

        b1.approveLoan(s1);  
        b1.approveLoan(e1);     }
}
