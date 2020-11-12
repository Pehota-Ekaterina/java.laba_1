package Menu;

import Instruments.Nutritious;

public class Beef extends Food implements Nutritious {
    public Beef(String preparedness) {
        super("Мясо");
        this.param = preparedness;
        Nutritious.calculateCalories(this);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Beef))
            return false;
        return param.equals(((Beef) object).param);
    }

}
