class printer{
      void print(char c){
           System.out.println(c);
      }
      void print(int a){
           System.out.println(a);
      }
      void print(String str){
           
           System.out.println(str);

      }


}
class Test{
	public static void main(String[] args)
	{
	    printer p1 = new printer();
            int a = 10;
            char c = 'c';
            String str = "Atul";  
	    p1.print(a);
            p1.print(c);
            p1.print(str);
            
        }

}