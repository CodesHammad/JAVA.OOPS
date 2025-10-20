import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\haroon traders\\Desktop\\JAVA.OOPS\\SalesSum\\EVE01Sales.txt";
        int total = 0;
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        int totalD = 0;
        try {
            File myFile = new File(filePath);

            Scanner s1 = new Scanner(myFile);
            String line = s1.nextLine();
            while (s1.hasNextLine()) {
                line = s1.nextLine();
                String[] fields = line.split("\t");
                int qty = Integer.parseInt(fields[4]);
                int unitPrice = Integer.parseInt(fields[5]);
                if (fields.length >= 6) {

                    if (fields[3].equals("Product A")) {
                        totalA += qty * unitPrice;
                    }
                    if (fields[3].equals("Product B")) {
                        totalB += qty * unitPrice;
                    }
                    if (fields[3].equals("Product C")) {
                        totalC += qty * unitPrice;
                    }
                    if (fields[3].equals("Product D")) {
                        totalD += qty * unitPrice;
                    }

                    total += qty * unitPrice;

                }

            }
            System.out.println("Product A " + totalA);
            System.out.println("Product B " + totalB);
            System.out.println("Product C " + totalC);
            System.out.println("Product D " + totalD);
            System.out.println("TOTAL " + total);
        } catch (IOException e) {
            System.out.println("NOT FOUND");
        }
    }
}