package Menu;

import Instruments.Nutritious;

public class Tea extends Food implements Nutritious {

    public Tea(String color) {
        super("Чай");
        this.param = color;
        Nutritious.calculateCalories(this);
    }


    public boolean equals(Object object) {
        if (!(object instanceof Tea)) return false;
        return this.param.equals(((Tea) object).param);
    }
}
