package Menu;

import Instruments.Nutritious;

public class Milk extends Food {

    public Milk(String fat) {
        super("Молоко");
        this.param = fat;

        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Milk)) return false;
        return param.equals(((Milk) object).param);
    }
}
