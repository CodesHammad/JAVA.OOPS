import java.util.*;
import java.io.*;

public class HashmapProductWise {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\haroon traders\\Desktop\\JAVA.OOPS\\SALES SUM\\Product-Wise\\EVE01Sales.txt";
        try {
            HashMap<String, Integer> productTotals = new HashMap<>();
            int grandtotal = 0;
            File f1 = new File(filePath);
            Scanner s1 = new Scanner(f1);
            s1.nextLine();
            while (s1.hasNextLine()) {
                String line = s1.nextLine();
                String[] fields = line.split("\t");
                String products = fields[3];
                int qty = Integer.parseInt(fields[4]);
                int unitprice = Integer.parseInt(fields[5]);
                int linetotal = qty * unitprice;
                int old = productTotals.getOrDefault(products, 0);
                int newtotal = old + linetotal;
                productTotals.put(products, newtotal);
                grandtotal += linetotal;

            }
            s1.close();
            for (String Product : productTotals.keySet()) {
                System.out.println(Product + " :" + productTotals.get(Product));
            }
            System.out.println("Grand toal is " + grandtotal);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}