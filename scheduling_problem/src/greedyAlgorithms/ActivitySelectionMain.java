package greedyAlgorithms;
import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelectionMain {

	public static void main(String[] args) {
		
		//Create an ArrayList to store all activities
		ArrayList<Activity> activityList = new ArrayList<Activity>();
		
		//Insert activities in Arraylist
		activityList.add(new Activity("A1", 0, 6));
		activityList.add(new Activity("A2", 3, 4));
		activityList.add(new Activity("A3", 1, 2));
		activityList.add(new Activity("A4", 5, 8));
		activityList.add(new Activity("A5", 5, 7));
		activityList.add(new Activity("A6", 8, 9));
	
		//Print user entered data
		System.out.println("User provided Schedule:");
		for (int i = 0; i < activityList.size(); i++) {
			Activity activity = activityList.get(i);
			System.out.println(activity.toString());
		}
		
		//Perform sorting on activities based on their finishing time
		Collections.sort(activityList, new ActivitiySelection());
		Activity previousActivity = activityList.get(0);

		System.out.println("\n\nRecommended Schedule:\n" + activityList.get(0));

		for (int i = 1; i < activityList.size(); i++) {
			Activity activity = activityList.get(i);
			//if job's start time is greater than equal previous job's finish time then print job
			if (activity.getStartTime() >= previousActivity.getFinishTime()) {
				System.out.println(activity);
				previousActivity = activity;
			}
		}//end of loop
	
	}//end of method
}//end of class