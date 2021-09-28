public class Main {
    public static void main(String[] args) {
        Fighter F1 = new Fighter("A", 10, 120, 100);
        Fighter F2 = new Fighter("B", 20, 85, 100);

        Match match  = new Match(F1, F2, 90, 100);
        match.runMatch();
    }
}
