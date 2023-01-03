public class methods {
    public static void main(String args[]){
        loop();
        area(5,7);
        square(9);
    }
    public static void loop(){
        int i=0;
        System.out.println("helllo aditya....");
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    public static void area(int l, int b){
        System.out.println("Area of rectangle is : "+l*b);
    }
    public static int square(int a){
        int area=a*a;
        System.out.println("Area of square is : "+area);
        return area;
    }
}
 