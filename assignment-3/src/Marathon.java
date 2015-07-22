/**
 * Created by kevindlee on 7/21/15.
 */
public class Marathon {

    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        int fastestIndex = getFastestTime(times);
        System.out.printf("\n%s had the fastest time of %d\n", names[fastestIndex], times[fastestIndex]);
        int secondIndex = getSecondFastestTime(times);
        System.out.printf("\n%s had the second fastest time of %d\n", names[secondIndex], times[secondIndex]);
    }
    public static final int getFastestTime(int[] timeArray){
        int fastIndex = 0;
        int minTime = timeArray[0];

        for(int i=0; i<timeArray.length; i++) {
            if (timeArray[i] < minTime){
                minTime = timeArray[i];
                fastIndex = i;
            }
        }
        return fastIndex;
    }
public static final int getSecondFastestTime(int[] timeArray){
    int fastIndex = getFastestTime(timeArray);
    int secondIndex=0;
    int minTime = Integer.MAX_VALUE;

    for(int i=0; i<timeArray.length; i++){
        if (i==fastIndex)
            continue;
        if (timeArray[i] < minTime){
            secondIndex = i;
            minTime = timeArray[i];
        }
    }
    return secondIndex;
}
}
