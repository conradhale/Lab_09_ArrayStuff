import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Random rnd = new Random();
    int total = 0;
    double average;
    boolean found = false;
    int count = 0;
    int min = 100;
    int max = 0;
    int[] dataPoints = new int[100];
    for (int i = 0; i <= dataPoints.length - 1; i++) {
      dataPoints[i] = rnd.nextInt(100) + 1;
    }
    for (int i = 0; i <= dataPoints.length - 1; i++) {
      System.out.print(dataPoints[i] + "|");
    }
    System.out.println();
    for (int i = 0; i <= dataPoints.length - 1; i++) {
      total += dataPoints[i];
    }
    average = (double)total / dataPoints.length;
    System.out.printf("\nThe total sum of these numbers is %d, and the average is %3.2f.\n", total, average);

    for (int i = 0; i <= dataPoints.length - 1; i++) {
      if (dataPoints[i] < min) {
        min = dataPoints[i];
      }
      if (dataPoints[i] > max) {
        max = dataPoints[i];
      }
    }
    System.out.printf("\nThe minimum value is %d, and the maximum is %d\n", min, max);

    Scanner in = new Scanner(System.in);
    int search = SafeInput.getRangedInt(in, "Enter an integer", 1, 100);

    for (int i = 0; i <= dataPoints.length - 1; i++) {
      if (dataPoints[i] == search) {
        count++;
      }
    }
    System.out.printf("\nFound '%s' %d times.", search, count);
    for (int i = 0; i <= dataPoints.length - 1; i++) {
      if (dataPoints[i] == search) {
        System.out.printf("\nFound %d at array index '%d'.", search, i);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.printf("\nDid not find %d\n", search);
    }
    System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
  }
  public static double getAverage(int[] values) {
    int total = 0;
    double average;
    for (int i = 0; i <= values.length - 1; i++) {
      total += values[i];
    }
    average = (double)total / values.length;

    return average;
  }
}