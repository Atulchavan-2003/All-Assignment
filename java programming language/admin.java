class Admin {
    int id;
    String name;
    double salary;
    double allowance;

    // Setters
    void setId(int i) {
        this.id = i;
    }
    void setName(String n) {
        this.name = n;
    }
    void setSalary(double s) {
        this.salary = s;
    }
    void setAllowance(double a) {
        this.allowance = a;
    }

    // Getters
    int getId() {
        return id;
    }
    String getName() {
        return name;
    }
    double getSalary() {
        return salary;
    }
    double getAllowance() {
        return allowance;
    }

    // Display Method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }
} // Admin class end here

class test {
    public static void main(String args[]) {
        Admin a1 = new Admin();

        // Set values
        a1.setId(201);
        a1.setName("Atul");
        a1.setSalary(45000);
        a1.setAllowance(5000);

        // Display using method
        a1.display();

        // Display using getters
        System.out.println("ID       : " + a1.getId());
        System.out.println("Name     : " + a1.getName());
        System.out.println("Salary   : " + a1.getSalary());
        System.out.println("Allowance: " + a1.getAllowance());
    }
}
