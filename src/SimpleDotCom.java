public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public String checkYourSelf(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);

        String result = "Miss";

        for (int cell : locationCells) {

            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }

        }


        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }


}
