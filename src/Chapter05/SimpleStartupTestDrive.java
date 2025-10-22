//package Chapter05;
//import java.util.ArrayList;
//
//public class SimpleStartupTestDrive {
//    public static void main(String[] args) {
//        SimpleStartup dot = new SimpleStartup(); // Instantiate a SimpleStartup object
//        int[] locations = {2,3,4}; // Make an int array for the location of the Startup (3 consecutive ints out of a possible 7)
//        //dot.setLocationCells(locations); // Invoke the setter method on the startup
//        int userGuess = 2; // Make a fake user guess
//        //String result = dot.checkYourself(userGuess); // Invoke the checkYourself() method on the startup object and pass it the fake guess
//        String testResult = "failed";
//
//        //if (result.equals("hit")) {
//            testResult = "passed"; // If the fake guess (2) gives back a hit, its working
//        }
//
//        System.out.print(testResult); // Print out the test result ("passed" or "failed")
//    }
//}
//
//class SimpleStartup {
//    private ArrayList<String> locationCells;
//    // private int numOfHits = 0;
//
//    public void setLocationCells(ArrayList<String> locs) {
//
//        locationCells = locs;
//    }
//
//    public String checkYourself(String userInput) {
//        String result = "miss";
//        int index = locationCells.indexOf(userInput);
//
//        if (index >= 0) {
//            locationCells.remove(index);
//
//            if (locationCells.isEmpty()) {
//                result = "kill";
//            } else {
//                result = "hit";
//            }
//        }
//        return result;
//    }
//}
//