public class UC4 {
    public static void main(String[] args) {
        int stake = 100;
        int betValue = 1;
        int bet = 0;
        int win = 0;
        int loose = 0;
        int totalDays = 0;
        int totalWin = 0;
        int totalLoose = 0;
        while (totalDays < 20) {

            while (win < 50 && loose < 50) {
                int random = (int) ((Math.random() * 10) % 2);
                if (random == 1) {
                    win++;
                } else {

                    loose++;
                }
                bet++;
            }
            totalWin += win;
            totalLoose += loose;
            totalDays++;

        }
        System.out.println("Total Amount won by Gambler in 20 days : " + totalWin + "$");
        System.out.println("Total Amount loosed by Gambler in 20 days : " + totalLoose + "$");


    }
}

