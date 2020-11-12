import Instruments.ProductComparator;
import Menu.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args){

        Food[] breakfast = new Food[3];

        int item = 0;

        for (String arg: args){

            String[] parts = arg.split("/");

            if(parts[0].equals("Tea")){
                breakfast[item] = new Tea(parts[1]);
            }else
            if(parts[0].equals("Pie")){
                breakfast[item] = new Pie(parts[1]);
            }else
            if(parts[0].equals("Milk")){
                breakfast[item] = new Milk(parts[1]);
            }else
            if(parts[0].equals("Coffee")){
                breakfast[item] = new Coffee(parts[1]);
            }else
            if (parts[0].equals("Beef")){
                breakfast[item] = new Beef(parts[1]);
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

        for(Food product: breakfast){
            System.out.println(product.getName() + " " + product.getParam() + " " + product.getCalories());
        }

    }
}
