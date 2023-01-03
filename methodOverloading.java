public class methodOverloading {
    public static void main(String args[]){
        area(4.5);
        area(4);
        area(3.4,5.6);
        sum(2.5f, 7);
    }
    public static void area(double s){
        System.out.println("Area of square is:"+s*s);
    }
    public static void area(int s){
        System.out.println("Area of square is:"+s*s);
    }
    public static void area(double l,double b){
        System.out.println("Area of rectangle is:"+l*b);
    }
    public static float sum(float x, int y){
        System.out.print("sum is: "); 
        return x+y;

    }
    
}
