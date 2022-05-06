
package proyecto_java;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Proyecto_java {

    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        double area, radio;
        final double pi = 3.1416;
        area = 145;
        
        radio = Math.sqrt(area/pi);
        System.out.println("Radio: " + formato.format(radio) + " cm");
    }
  }
    

