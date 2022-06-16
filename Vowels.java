import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a word to find character");

      String one = sc.next();

      if(one.contains("a") || one.contains("e") || one.contains("i") || one.contains("o") || one.contains("u")){
        System.out.println("you got a vowels");
      }else{
        System.out.println("given not a vowels");
      }
               
    }

}
