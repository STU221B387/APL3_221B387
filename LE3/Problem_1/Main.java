public class Main {
    public static void main(String[] args) {
        Pandav arjun = new Pandav("Arjun", true, true);
        Pandav bheem = new Pandav("Bheem", true, false);
        Kaurav duryodhan = new Kaurav("Duryodhan", false, false);
        Kaurav vikarn = new Kaurav("Vikarn", true, true);

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}