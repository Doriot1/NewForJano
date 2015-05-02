package xnovakd1.fiit.model.problem;
	
public class DirtProblem extends Problem{
	
	private static final long serialVersionUID = 4754938463095875910L;
	

	private String district;

	public DirtProblem() {
		super();
		if(randomInt > 75)
			district = "Severna";
		else if(randomInt > 50)
			district = "Juzna";
		else if(randomInt > 25)
			district = "Vychodna";
		else if(randomInt >= 0)
			district = "Zapadna";
	}


	public String toString() {
		return district + " cast zoo je spinava";
	}
}
