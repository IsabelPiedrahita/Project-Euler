
/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Isabel Piedrahita
 */
public class Four
{
    public static void main(){
        int maxPalindrome = 0;
        for(int i=100 ; i<1000 ; i++){
            for(int j=100 ; j<1000 ; j++){
                int product = i*j;
                if(product == reverse(product)){
                    maxPalindrome = Math.max(maxPalindrome, product);
                }
            }
        }
        
        System.out.println(maxPalindrome);
    }
    
    public static int reverse(int num){
        int reverse = 0;
        while(num != 0){
            int remainder = num%10;
            reverse = reverse*10+remainder;
            num = num/10;
        }
        return reverse;
    }
}
