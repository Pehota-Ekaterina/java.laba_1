package Menu;

import Instruments.Nutritious;

public class Pie extends Food {

    public Pie(String filling) {
        super("Пирог");
        this.param = filling;

        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Pie)) return false;
        return param.equals(((Pie) object).param);
    }

}
