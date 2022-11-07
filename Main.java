import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("what numbers would you like to do math with ?");
    int x =sc.nextInt();
    int y = sc.nextInt();
    sc.close();

    System.out.println(x + y);
    System.out.println( x - y);
    System.out.println( x * y);
    System.out.println(x / y);
    System.out.println( x % y );


    System.out.println("post-increment operator");
    int post =15;
    System.out.println(post++);
    System.out.println(post);


    System.out.println("pre-increment operator");
    int pre = 20;
    System.out.println(++pre);
    System.out.println(pre);
  }
}