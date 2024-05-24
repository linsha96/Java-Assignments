public class Primeno {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    int i = 2;  
    
    while(i<=num/2){
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
        
      }
      else
        i++;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}