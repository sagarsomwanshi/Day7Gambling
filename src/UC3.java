public class UC3 {
    public static void main(String[] args) {
        int stake = 100;
        int betValue = 1;
        int bet = 0;
        int win = 0;
        int loose = 0;

        while(stake > 50 && stake < 150) {
            int random = (int)((Math.random() * 10) %2);
            if (random == 1) {
                stake++;
                win++;
            } else {
                stake--;
                loose++;
            }
            bet++;
        }

        System.out.println("Gambler won the bet " +win+ " Times");
        System.out.println("Gambler looses the bet " +loose+ " Times");
        System.out.println("total bets made : " +bet);
        if(stake == 150) {
            System.out.println("gambler won for the day & takes " + stake+ "$ home");
        }
        else{
            System.out.println("Gambler looses for the day & takes " + stake + "$ home");
        }
    }
}
