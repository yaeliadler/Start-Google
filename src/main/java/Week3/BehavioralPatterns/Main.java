package main.java.Week3.BehavioralPatterns;

public class Main {
    public static void main(String[] args) {
        JsonConvertorVisitor convertor = new JsonConvertorVisitor();
        Asset asset = new Asset("Me", 5.3);
        User user = new User("Yael", "hI9");
        Group group = new Group(5);
        System.out.println("Printing asset as Json");
        asset.accept(convertor);
        System.out.println("Printing user as Json");
        user.accept(convertor);
        System.out.println("Printing group as Json");
        group.accept(convertor);
    }
}
