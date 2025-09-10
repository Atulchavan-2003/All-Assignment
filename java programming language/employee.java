class Employee {
    int memberId;
    String name;
    double salary;

    Employee(){
        this.memberId = 3;
    }

    Employee(int m){
       this.memberId = m;
    }
    
    void setMemberId(int a){
        memberId=a;
    }
    int getMemberId(){
        return memberId;
    }
    void setName(String a){
        name=a;
    } 
    String getName(){
        return name;
    }

    void setSalary(double a){
        this.salary=a;
    } 
    double getSalary(){
        return this.salary;
    }

    void display(){
   	System.out.println("ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        } 

}// emp end here 
class test{
   public static void main(String args[]){
      Employee e1 = new Employee();
      Employee e2 = new Employee();
      Employee e3 = new Employee(3);
        e1.setMemberId(1);
        e1.setSalary(50000);
        e1.setName("atul");
        e1.display();
                 
        e2.setMemberId(2);
        e2.setSalary(60000);
        e2.setName("sandeep");   
       
        System.out.println("e2 is :"+e2.getMemberId());
        e2.getSalary();
        e2.getName();
        e2.display();
          
                  
   } 
}