public class Main {
    public static void main(String[] args) {
        int ticketPrice = 23_720; // Цена билета
        int rublesForAMile = 20; // Количество рублей за одну милю
        int bonusMiles = ticketPrice / rublesForAMile; // Количество миль за цену билета
        System.out.println("Бонусные мили при цене билета в " + ticketPrice + ": " + bonusMiles);
    }
}
