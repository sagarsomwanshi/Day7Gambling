public class UC5{
    public static void main(String[] args) {
        int stake = 100;
        int betValue = 1;
        int bet = 0;
        int win = 0;
        int loose = 0;
        int totalDays = 1;
        int totalWin = 0;
        int totalLoose = 0;
        int winDays = 0;
        int looseDays = 0;
        while (totalDays <= 20) {
            win = 0;
            loose =0;
            stake = 100;
            bet = 0;

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
            System.out.println("\nTotal bets made on day " +totalDays+ " are " +bet);
            System.out.println("won bets " + win + " \nloosed bets " +loose);
            if(win > loose) {
                System.out.println("Gambler won " +(win - loose) +"$ on day " + totalDays);
                winDays++;
                totalWin += (win - loose);
            }
            else{
                System.out.println("Gambler looses " +(loose - win) + "$ on day " + totalDays );
                looseDays++;
                totalLoose += (loose - win);
            }
            totalDays++;

        }

        System.out.println("\nTotal days won By gambler : " +winDays);
        System.out.println("Total Amount won by Gambler in 20 days : " + totalWin + "$");
        System.out.println("Total days loosed By gambler : " +looseDays);
        System.out.println("Total Amount loosed by Gambler in 20 days : " + totalLoose + "$");


    }
}
