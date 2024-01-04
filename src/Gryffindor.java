public class Gryffindor extends Student {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String faculty, String fullName, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(faculty, fullName, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int calculateTotalPowerSpecialGryffindor() {
        return nobility + honor + bravery;
    }

    public static String comparisonStudentsFacultyGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (gryffindor1.calculateTotalPowerSpecialGryffindor() > gryffindor2.calculateTotalPowerSpecialGryffindor()) {
            return gryffindor1.getFullName() + ", total power - " + gryffindor1.calculateTotalPowerSpecialGryffindor() +
                    ", Stronger than a student, " +
                    gryffindor2.getFullName() + ", total power - " + gryffindor2.calculateTotalPowerSpecialGryffindor();
        } else if (gryffindor1.calculateTotalPowerSpecialGryffindor() < gryffindor2.calculateTotalPowerSpecialGryffindor()) {
            return gryffindor2.getFullName() + ", total power - " + gryffindor2.calculateTotalPowerSpecialGryffindor() +
                    ", Stronger than a student, " +
                    gryffindor1.getFullName() + ", total power - " + gryffindor1.calculateTotalPowerSpecialGryffindor();
        } else {
            return gryffindor1.getFullName() + ", total power - " + gryffindor1.calculateTotalPowerSpecialGryffindor() +
                    ", and, " +
                    gryffindor2.getFullName() + ", total power - " + gryffindor2.calculateTotalPowerSpecialGryffindor() +
                    " have equal power";
        }
    }

    public String toString() {
        return super.toString() +
                ", Nobility: " + getNobility() +
                ", Honor: " + getBravery() +
                ", Bravery: " + getBravery();

    }

}
