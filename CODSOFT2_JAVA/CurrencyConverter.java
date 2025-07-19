import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE AMOUNT TO BE CONVERTED");
        double amount=sc.nextDouble();

        System.out.println("ENTER THE BASE CURRENCY (USD or EUR)");
        String baseCurrency=sc.next().toUpperCase();

        System.out.println("ENTER THE TARGET CURRENCY (INR or USD or EUR)");
        String targetCurrency=sc.next().toUpperCase();

        double rate=0;

        if(baseCurrency.equals(targetCurrency)){
            rate=1.0;
        }

        else if(baseCurrency.equals("USD") && targetCurrency.equals("INR")){
            rate=85.49;
        }

        else if(baseCurrency.equals("USD") && targetCurrency.equals("EUR")){
            rate=0.85;
        }

        else if(baseCurrency.equals("EUR") && targetCurrency.equals("INR")){
            rate=100.02;
        }

        else if(baseCurrency.equals("EUR") && targetCurrency.equals("USD")){
            rate=1.17;
        }

        else{
            System.out.println(" CONVERSION NOT SUPPORTED ");
            return;
        }

        double convertedAmount=amount*rate;

        System.out.println("AMOUNT: "+amount+" in "+baseCurrency+" is "+convertedAmount+" in "+targetCurrency);


    }
    
}