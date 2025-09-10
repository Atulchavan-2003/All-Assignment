class PlaceStudent {
    String companyName;
    double distance;
    String designation;

    // Setters
    void setCompanyName(String c) {
        this.companyName = c;
    }
    void setDistance(double d) {
        this.distance = d;
    }
    void setDesignation(String des) {
        this.designation = des;
    }

    // Getters
    String getCompanyName() {
        return companyName;
    }
    double getDistance() {
        return distance;
    }
    String getDesignation() {
        return designation;
    }

    // Display Method
    void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Distance: " + distance);
        System.out.println("Designation: " + designation);
    }
} // PlaceStudent class end here

class test {
    public static void main(String args[]) {
        PlaceStudent c1 = new PlaceStudent(); // ✅ बरोबर class नाव वापरलं

        // Set values
        c1.setCompanyName("TCS");
        c1.setDistance(12.5);
        c1.setDesignation("Software Engineer");

        // Display using method
        c1.display();

        // Display using getters
        System.out.println("Company Name : " + c1.getCompanyName());
        System.out.println("Distance : " + c1.getDistance());
        System.out.println("Designation : " + c1.getDesignation());
    }
}
