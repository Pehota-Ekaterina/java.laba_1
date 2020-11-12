package Menu;

public abstract class Food {

    String name = null;
    Integer calories = 0;
    String param = null;

    public Food(String name) {
        this.name = name;
    }

    public static Integer calculate(Food[] breakfast) {

        Integer result = 0;

        for (Food product : breakfast) {
            result += product.getCalories();
        }

        return result;
    }

    public String getName() {
        return name;
    }

    public Integer getCalories() {
        return calories;
    }

    public String getParam() {
        return param;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }
}