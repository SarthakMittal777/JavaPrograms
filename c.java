class D{
    protected int x = 1;
    protected void setX(int a){  x=a;  }
    protected int getX(){ return x;}
    }
    class B extends D{
    protected int x = 3;
    public int getX(){ return x; }
    public int getB(){ return x; }
    }
    
    public class c {
    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            D a = new D();
            B b = new B();
            System.out.println(a.getX());
            System.out.println(b.getB());
            System.out.println(b.getX());
            System.out.println(a.x); 
            System.out.println(b.x); 
        }
    
    }
    