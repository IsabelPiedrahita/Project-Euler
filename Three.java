
/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Isabel Piedrahita
 */
public class Three
{
    public static final long num = 600851475143L;
    
    public static void main(){
        for(long i=2 ; i<num ; i++){
            if(num%i == 0){
                if(isPrime(num/i)){
                    System.out.println(num/i);
                    break;
                }
            }
        }
    }
    
    public static boolean isPrime(long nu){
        for(int i=2 ; i<=nu/2 ; i++){
            if(nu%i == 0){
                return false;
            }
        }
        return true;
    }
}
