package greedyAlgorithms;
import java.util.Comparator;

// Implement Comparator interface and specify which variable('FinishTime') of user 
// defined class should the 'compare' method work on. 
//This needs to be done because this will be required in Sort method  
public class ActivitiySelection implements Comparator<Activity> {
	@Override
	public int compare(Activity act1, Activity act2) {
		return act1.getFinishTime() - act2.getFinishTime();
	}
}







