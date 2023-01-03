public class sumofdigits {
    public static void main(String args[]){
        int val=12345;
        int sum=0;
        while(true){
            sum=sum+ val%10; 
            val=val/10;
            
            if(val<10){
                break;
            }
        }
        sum=sum+val;
        System.out.println("sum= "+sum);
    }
}


// get individuual digit use--- /-- remainder
// want remainder -- divide by 10
// repeat process until value is less than 10
//add last digit to sum of variable
