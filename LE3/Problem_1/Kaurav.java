public class Kaurav extends Bharatvanshi {
    boolean isObedient;
    boolean isKind;

    public Kaurav(String name, boolean isObedient, boolean isKind) {
        this.name = name;
        this.isObedient = isObedient;
        this.isKind = isKind;
    }

    public void obey() {
        if(isObedient) {
            System.out.println(name + " obeys.");
        }
    }

    public void kind() {
        if(isKind) {
            System.out.println(name + " is kind.");
        }
    }
}