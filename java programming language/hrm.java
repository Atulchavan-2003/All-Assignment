class HRM {
    int id;
    double salary;
    double commission;

    // Setters
    void setId(int i) {
        this.id = i;
    }
    void setSalary(double s) {
        this.salary = s;
    }
    void setCommission(double c) {
        this.commission = c;
    }

    // Getters
    int getId() {
        return id;
    }
    double getSalary() {
        return salary;
    }
    double getCommission() {
        return commission;
    }

    // Display Method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Commission: " + commission);
    }
} // HRM class end here

class test {
    public static void main(String args[]) {
        HRM h1 = new HRM();

        // Set values
        h1.setId(301);
        h1.setSalary(55000);
        h1.setCommission(7500);

        // Display using method
        h1.display();

        // Display using getters
        System.out.println("ID         : " + h1.getId());
        System.out.println("Salary     : " + h1.getSalary());
        System.out.println("Commission : " + h1.getCommission());
    }
}
