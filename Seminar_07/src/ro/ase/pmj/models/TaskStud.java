package ro.ase.pmj.models;

import ro.ase.pmj.interfaces.TaskStudable;

public class TaskStud implements TaskStudable {

	@Override
	public int startTask(int x, int y) {
		return x+y;
	}

}
