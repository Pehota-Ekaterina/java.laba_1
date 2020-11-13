import Instruments.ProductComparator;
import Menu.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args){

        Food[] breakfast = new Food[3];

        int item = 0;
        int sumTea = 0;
        int sumBeef = 0;
        int sumCoffee = 0;
        int sumMilk = 0;
        int sumPia = 0;

        for (String arg: args){

            String[] parts = arg.split("/");

            if(parts[0].equals("Tea")){
                breakfast[item] = new Tea(parts[1]);
                sumTea++;
            }else
            if(parts[0].equals("Pie")){
                breakfast[item] = new Pie(parts[1]);
                sumPia++;
            }else
            if(parts[0].equals("Milk")){
                breakfast[item] = new Milk(parts[1]);
                sumMilk++;
            }else
            if(parts[0].equals("Coffee")){
                breakfast[item] = new Coffee(parts[1]);
                sumCoffee++;
            }else
            if (parts[0].equals("Beef")){
                breakfast[item] = new Beef(parts[1]);
                sumBeef++;
            } else
            if (parts[0].equals("-calories")){
                System.out.println("Общая калорийность завтрака: " + Food.calculate(breakfast));
            }else
            if (parts[0].equals("-sort")){
                Arrays.sort(breakfast, new ProductComparator());
            }

            item++;
        }

        int count = 0;
        Food simple = breakfast[0];
        for(Food product: breakfast) {
            if(simple.equals(product)) {
                count += 1;
            }
        }
        System.out.println(count);

        System.out.println("Количество съеденных продуктов:  " + (sumTea+sumBeef+sumCoffee+sumMilk+sumPia));
        System.out.println("Съедено мясо: " + sumBeef);
        System.out.println("Съедено пирогов: " + sumPia);
        System.out.println("Выпито кофе: " + sumCoffee);
        System.out.println("Выпито чая: " + sumTea);
        System.out.println("Выпито молока: " + sumMilk);

        System.out.println ("Было съедено: ");
        for(Food product: breakfast){
            System.out.print(" " + product.getName() + " " + product.getParam() + " " + product.getCalories() + "; ");
        }

    }
}
