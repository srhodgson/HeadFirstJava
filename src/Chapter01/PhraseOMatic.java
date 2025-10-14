package Chapter01;

public class PhraseOMatic {

    public static void main(String[] args) {
        
        // Make three sets of words to choose from. 
        String[] wordListOne = { "agnostic", "opinionated", "voice activated",
                "haptically driven", "extensible", "reactive", "agent based",
                "functional", "AI enabled", "strongly typed" };
                
        String[] wordListTwo = {"loosely coupled","six sigma","asynchronous",
                "event driven","pub-sub","IoT","cloud native","service oriented",
                "containerized", "serverless", "microservices", "distributed ledger" };
                
        String[] wordListThree = {"framework","library","DSL","REST API","repository",
                "pipeline","service mesh","architecture","perspective","design",
                "orientation" };
                
        // Find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // Now build a phrase 
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
