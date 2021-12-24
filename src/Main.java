public class Main {
public static void main(String[] arg) {
// вход
    int ticketPrice = 100;
    int bonusMileCost = 20;

//логика
    int bonusMiles = ticketPrice / bonusMileCost;
    System.out.println("Вам начислено " + bonusMiles + " бонусных милей(ь)");

}
}
