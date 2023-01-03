public class breakstatement {
     public static void main(String[] args) {
        
    
        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }

        for(int j=0;j<=10;j++){
            
            if(j==5){
                continue;
                
            }
            System.out.println(j);
        }
    }
}
//break:current execution of statement get terminated
//continue : terminates the iteration remaining statment after conitnue wil not be executed