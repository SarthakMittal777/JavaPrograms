class Ham {
    public void a() { 	 System.out.println("Ham a"); 	 }
    public void b() {  	 System.out.println("Ham b"); 	 }
    public String toString() { 	 return "Ham";   	 }
   }
class Lamb extends Ham {
    public void b() { 	 System.out.println("Lamb b"); 	 }
   }

    class Yam extends Lamb {
    public void a() { 	 System.out.println("Yam a"); 	 }
    public String toString() { 	 return "Yam";   	 }
   }
    
   class Spam extends Yam {
    public void a() {  	 System.out.println("Spam a"); 	 }
   }
   
   
public class Main1 {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
   Ham[] food = { new Spam(), new Yam(), new Ham(), new Lamb() };
   for (int i = 0; i < food.length; i++) {
     System.out.println(food[i]); 
       food[i].a(); 
       food[i].b();
    System.out.println();  		 }
   }

}
