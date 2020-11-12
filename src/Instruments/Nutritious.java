package Instruments;

import Menu.*;

public interface Nutritious {

    static void calculateCalories(Food product) {

        if(product instanceof Tea){
            if (product.getParam().equals("чёрный"))
                product.setCalories(7);
            else
                product.setCalories(5);
        } else if(product instanceof Pie){
            if (product.getParam().equals("вишнёвая"))
                product.setCalories(10);
            else if (product.getParam().equals("клубничная"))
                product.setCalories(15);
            else
                product.setCalories(5);
        }else if(product instanceof Milk){
            if (product.getParam().equals("1.5%"))
                product.setCalories(10);
            else if (product.getParam().equals("2.5%"))
                product.setCalories(15);
            else
                product.setCalories(20);
        }else if(product instanceof Coffee){
            if (product.getParam().equals("насыщенный"))
                product.setCalories(5);
            else if (product.getParam().equals("горький"))
                product.setCalories(7);
            else
                product.setCalories(9);
        }else if(product instanceof Beef){
            if (product.getParam().equals("с кровью"))
                product.setCalories(10);
            else if (product.getParam().equals("норма"))
                product.setCalories(15);
            else
                product.setCalories(20);
        }
    }

}
