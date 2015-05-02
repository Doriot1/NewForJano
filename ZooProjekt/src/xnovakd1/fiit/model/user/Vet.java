package xnovakd1.fiit.model.user;

import xnovakd1.fiit.model.Commands;

public class Vet extends Human {


    public Vet() {
        System.out.println("Prihlasil sa veterinar");
    }

    @Override
    public void interpret(Commands command) {
        if (command == Commands.TASK_RESOLVE) try {
//			Tasks.getInstance().remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Vsetky ulohy su splnene");
        }
    }
}
