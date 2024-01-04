public class Ravenclaw extends Student {
    private int smart;
    private int mudras;
    private int witty;
    private int creativity;

    public Ravenclaw(String faculty, String fullName, int magicPower, int transgressionDistance, int smart, int mudras, int witty, int creativity) {
        super(faculty, fullName, magicPower, transgressionDistance);
        this.smart = smart;
        this.mudras = mudras;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getMudras() {
        return mudras;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public int calculateTotalPowerSpecialRavenclaw() {
        return smart + mudras + witty + creativity;
    }

    public static String comparisonStudentsFacultyRavenclaw(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        if (ravenclaw1.calculateTotalPowerSpecialRavenclaw() > ravenclaw2.calculateTotalPowerSpecialRavenclaw()) {
            return ravenclaw1.getFullName() + ", total power - " + ravenclaw1.calculateTotalPowerSpecialRavenclaw() +
                    ", Stronger then a student, " +
                    ravenclaw2.getFullName() + ", total power - " + ravenclaw2.calculateTotalPowerSpecialRavenclaw();
        } else if (ravenclaw1.calculateTotalPowerSpecialRavenclaw() < ravenclaw2.calculateTotalPowerSpecialRavenclaw()) {
            return ravenclaw2.getFullName() + ", total power - " + ravenclaw2.calculateTotalPowerSpecialRavenclaw() +
                    ", Stronger then a student, " +
                    ravenclaw1.getFullName() + ", total power - " + ravenclaw1.calculateTotalPowerSpecialRavenclaw();
        } else {
            return ravenclaw1.getFullName() + ", total power - " + ravenclaw1.calculateTotalPowerSpecialRavenclaw() +
                    ", and, " +
                    ravenclaw2.getFullName() + ", total power - " + ravenclaw2.calculateTotalPowerSpecialRavenclaw() +
                    " have egual power";
        }
    }

    public String toString() {
        return super.toString() +
                ", Smart: " + getSmart() +
                ", Mudras: " + getMudras() +
                ", Witty: " + getWitty() +
                ", Creativity : " + getCreativity();

    }
}

