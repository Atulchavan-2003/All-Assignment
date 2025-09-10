class date{
       int day,month,year;
	String dow;
	
	// default constructor 

        date(){

           System.out.println("Default Constructor ");
	   this.day=7;
	   this.month=1;
	   this.year = 2023;
	   this.dow = "sunday";

	}      

        // parameterize constructor 
        date(int d,int m,int y,String dow){

            System.out.println("parameterize Constructor ");

	    this.day = d;
            this.month = m;
            this.year = y;
            this.dow = dow;
	}

         date(String dow,int d,int m,int y){

            System.out.println("sequence of data type of parameter Constructor ");

	    this.day = d;
            this.month = m;
            this.year = y;
            this.dow = dow;
	}

	void setday(int a){
	      this.day=a;
	} // setday end here 

        void setmonth(int a){
	      this.month=a;
	}// month end here 

	void setyear(int a){
	      this.year=a;
	} 

	void setdow(String str){
	     dow = str;
	} // setday end here 

        void display(){

            System.out.println(this.day);
 	    System.out.println(this.month);
            System.out.println(this.year);
            System.out.println(this.dow);
        }
        int getday(){
            return this.day;
        }
	

}//date class end here 

class test {
	public static void main(String args[]){
		
		date d1 = new date();  
                date d2 = new date(8,10,2003,"sat");

                d1.setday(3);
		d1.setmonth(8);
		d1.setyear(2003);
		d1.setdow("wed");
                d1.display();
                
                d2.setday(10);
                d2.setmonth(5);
		d2.setyear(2023);

                if(d1.getday() >d2.getday()  ){
		System.out.println("d1 is younger");
		}
		else
		{
		System.out.println("d2 is younger");
		}
                
				
	}
}