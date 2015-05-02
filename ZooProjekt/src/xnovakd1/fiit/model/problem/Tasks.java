package xnovakd1.fiit.model.problem;

import java.util.ArrayList;
import java.util.List;

public class Tasks extends ArrayList<Problem> {  // polymorfizmus

    private static final long serialVersionUID = 3464299569935557882L;

    private static Tasks instance;

      private Tasks() {

    }

    public static Tasks getInstance() {
        if (instance == null) instance = new Tasks();
        return instance;
    }


    public List<Problem> getAll(Class<?> problem) {
        List<Problem> list = new ArrayList<>();
        for (Problem p : this)
            if (problem.isInstance(p))
                list.add(p);
		return list;
    }
}
