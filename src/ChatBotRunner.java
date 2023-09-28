public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("debbie", 7);

        debbie.greeting("Sonya");
        debbie.weather();
        System.out.println("14 feet is " + debbie.convertFeetToMeters(14) + " in meters");
        debbie.favoriteNumber(3);
        System.out.println("The sum is " + debbie.addNumbers(1, 2, 3));
        debbie.hobby("Coding");
        System.out.println("The product is " + debbie.multiplyNum(3, 4));
        System.out.println(debbie.goodbye());
    }
}
