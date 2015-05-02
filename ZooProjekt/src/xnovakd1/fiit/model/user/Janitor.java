package xnovakd1.fiit.model.user;

import xnovakd1.fiit.model.Commands;

public class Janitor extends Human {

	public Janitor(){
		System.out.println("Prihlasil sa upratovac");
	}

	@Override
	public void interpret(Commands command) {
		if (command == Commands.TASK_RESOLVE) try {
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Vsetky ulohy su splnene");
		}
	}
}
