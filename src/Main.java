//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum + 1, randomNum + 2, randomNum + 3};


        SimpleDotCom dot = new SimpleDotCom();
        dot.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive = true) {
            String guess = helper.getUserInput("insira um numero");
            String result = dot.checkYourSelf(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("Voce usou " + numOfGuesses + " palpites");

            }

        }

    }

}

