package Menu;

import Instruments.Nutritious;

public class Coffee extends Food {

    public Coffee(String aroma) {
        super("Кофе");
        this.param = aroma;

        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Coffee)) return false;
        return param.equals(((Coffee) object).param);
    }
}
