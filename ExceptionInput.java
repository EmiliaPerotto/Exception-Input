import java.util.Scanner;
public class ExceptionInput{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Input  a number: ");
    int input1 = Integer.parseInt(in.nextLine());
    int[] arr = new int[input1];
    try{
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Input another number: ");
      arr[i] = Integer.parseInt(in.nextLine());
    }
    }
    catch(InputMismatchException e){
      System.out.println("ERROR: a number must be entered");
    }
    System.out.println("Input  a number: ");
    int index1 = Integer.parseInt(in.nextLine());
    System.out.println("Input  a number: ");
    int index2 = Integer.parseInt(in.nextLine());
    int indexVal = 0;
    for (int i = 0; i < arr.length; i++) {
      indexVal = arr[index1] + arr[index2];
    }
    System.out.println("The sum of the values at index " + index1 + " and index " + index2 + " is " + indexVal);

  }
}