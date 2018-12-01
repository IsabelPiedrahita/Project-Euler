
/**
 * Write a description of class Five here.
 *
 * @author Isabel Piedrahita
 */
public class Five
{
    public static int main(){
        for(int i=21 ; i<=2147483647 ; i++){
            if((i%2 == 0)&&(i%3 == 0)&&(i%4 == 0)&&(i%5 == 0)&&(i%7 == 0)&&(i%8 == 0)&&(i%9 == 0)&&(i%10 == 0)&&(i%11 == 0)&&(i%12 == 0)&&(i%13 == 0)&&(i%14 == 0)&&(i%15 == 0)&&(i%16 == 0)&&(i%17 == 0)&&(i%18 == 0)&&(i%19 == 0)&&(i%20 == 0)){
                System.out.println(i);
                return i;
            }
        }
        return 1;
    }
}
