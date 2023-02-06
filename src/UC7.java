import java.util.Arrays;

public class UC7 {
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
        int[] winBets = new int[21];
        int[] looseBets = new int[21];

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
                winBets[totalDays] = win;
            }
            else{
                System.out.println("Gambler looses " +(loose - win) + "$ on day " + totalDays );
                looseDays++;
                totalLoose += (loose - win);
                looseBets[totalDays] = loose;
            }
            totalDays++;

        }

        System.out.println("\nTotal days won By gambler : " +winDays);
        System.out.println("Total Amount won by Gambler in 20 days : " + totalWin + "$");
        System.out.println("Total days loosed By gambler : " +looseDays);
        System.out.println("Total Amount loosed by Gambler in 20 days : " + totalLoose + "$");
        System.out.println("\nwon bets : " + Arrays.toString(winBets));
        System.out.println("Loose bets : " + Arrays.toString(looseBets));
        int maxWin = winBets[0];
        int maxLoose = looseBets[0];
        int maxWinDay = 0;
        int maxlooseDay = 0;

        for(int i = 0; i < winBets.length; i++){
            if(winBets[i] > maxWin){
                maxWin = winBets[i];
                maxWinDay = i;
            }
            if (looseBets[i]> maxLoose){
                maxLoose = looseBets[i];
                maxlooseDay = i;

            }
        }
        System.out.println( "\nluckiest Day : Day " +maxWinDay + " gambler won maximum bets which is " +maxWin);
        System.out.println( "Unluckiest Day : Day " +maxlooseDay + " gambler looses maximum bets which is " +maxLoose);

        if(totalWin > totalLoose){
            System.out.println("\nIn whole month Gambler Won " + (totalWin-totalLoose) + "$ so gambler will gamble in next month");
        }else{
            System.out.println("\nIn whole month Gambler lost " + (totalLoose - totalWin) + "$ so gambler will stop gambling from next month");
        }


    }
}
