public class UC2 {
    public static void main(String[] args) {
        int stake = 100;
        int bet = 1;
        int random = (int)((Math.random() * 10) %2);
        if(random == 1){
            System.out.println("Gambler won the bet");
        } else {
            System.out.println("Gambler looses the bet");
        }
    }
}
