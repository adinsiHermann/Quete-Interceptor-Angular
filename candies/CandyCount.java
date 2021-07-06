class CandyCount {
    public static void main(String[] args) {
        // Alogorithe du challenge en java

        double money = 12.4;
        double price = 12.4;
        int candies = 0;

        if (money > 0 && price > 0) {
            while ((money - price) >= 0) {
                candies = candies + 1;
                money = money - price;
            }
            ;
        }
        ;
        System.out.println("candies");

    }

}