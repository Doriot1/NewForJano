package xnovakd1.fiit.model.problem;

import java.io.Serializable;
import java.util.Random;

public abstract class Problem implements Serializable {

    private static final long serialVersionUID = 5848318966920649329L;
    protected int randomInt;

    public Problem() {
        Random random = new Random();
        randomInt = random.nextInt(100);
    }


}
