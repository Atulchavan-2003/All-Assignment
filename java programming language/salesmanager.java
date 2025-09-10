class SalesManager {
    int id;
    String name;
    double salary;
    double target;
    double incentive;

    // Setters
    void setId(int i) {
        id = i;
    }
    void setName(String n) {
        name = n;
    }
    void setSalary(double s) {
        salary = s;
    }
    void setTarget(double t) {
        target = t;
    }
    void setIncentive(double inc) {
        incentive = inc;
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
    double getTarget() {
        return target;
    }
    double getIncentive() {
        return incentive;
    }

    // Display method
    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Target: " + target);
        System.out.println("Incentive: " + incentive);
    }
} // SalesManager class end

class test {
    public static void main(String args[]) {
        SalesManager sm1 = new SalesManager();
        SalesManager sm2 = new SalesManager();

        sm1.setId(101);
        sm1.setName("Atul");
        sm1.setSalary(60000);
        sm1.setTarget(100000);
        sm1.setIncentive(10000);

        sm1.display();   

       
        System.out.println("sm2 ID: " + sm2.getId());
        System.out.println("sm2 Name: " + sm2.getName());
        System.out.println("sm2 Salary: " + sm2.getSalary());
        System.out.println("sm2 Target: " + sm2.getTarget());
        System.out.println("sm2 Incentive: " + sm2.getIncentive());
    }
}
