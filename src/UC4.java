public class UC4 {public static void main(String[] args) {
    int stake = 100;
    int betValue = 1;
    int bet = 0;
    int win = 0;
    int loose = 0;
    int totalDays = 1;
    int totalWin = 0;
    int totalLoose =0;

    while(totalDays <= 20) {
        stake = 100;

        while (stake > 50 && stake < 150) {
            int random = (int) ((Math.random() * 10) % 2);
            if (random == 1) {
                stake++;
                win++;
            } else {
                stake--;
                loose++;
            }
            bet++;

        }
        if (stake == 150) {
            totalWin++;
        } else {
            totalLoose++;
        }
        totalDays++;
    }

    System.out.println("Total Amount won by gambler in 20 days : " + totalWin*50 + "$");
    System.out.println("Total Amount loosed by gambler in 20 days :" + totalLoose*50 + "$");
    System.out.println("total bets made : " + bet);

}
}

