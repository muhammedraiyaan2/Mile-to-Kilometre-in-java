import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the mile to kilometer converter");
    System.out.println("Enter the mile value");
    Scanner sc=new Scanner(System.in);
    float se=sc.nextFloat();
    System.out.println(se*1.609);
  }
}
