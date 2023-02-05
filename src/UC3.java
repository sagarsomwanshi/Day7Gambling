public class UC3 {
    public static void main(String[] args) {
        int stake = 100;
        int betValue = 1;
        int bet = 0;
        int win = 0;
        int loose = 0;

        while(win < 50 && loose < 50) {
            int random = (int)((Math.random() * 10) %2);
            if (random == 1) {
                win++;
            } else {

                loose++;
            }
            bet++;
        }

        System.out.println("Gambler won the bet " +win+ " Times");
        System.out.println("Gambler looses the bet " +loose+ " Times");
        System.out.println("total bets made : " +bet);
    }
}
