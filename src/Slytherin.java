public class Slytherin extends Student {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String faculty, String fullName, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(faculty, fullName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public int calculateTotalPowerSpecialSlytherin() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public static String comparisonStudentsFacultySlytherin(Slytherin slytherin1, Slytherin slytherin2) {
        if (slytherin1.calculateTotalPowerSpecialSlytherin() > slytherin2.calculateTotalPowerSpecialSlytherin()) {
            return slytherin1.getFullName() + ", total power - " + slytherin1.calculateTotalPowerSpecialSlytherin() +
                    ", Stronger then a student, " +
                    slytherin2.getFullName() + ", total power -  " + slytherin2.calculateTotalPowerSpecialSlytherin();
        } else if (slytherin1.calculateTotalPowerSpecialSlytherin() < slytherin2.calculateTotalPowerSpecialSlytherin()) {
            return slytherin2.getFullName() + ",  total power - " + slytherin2.calculateTotalPowerSpecialSlytherin() +
                    ", Stronger then a student, " +
                    slytherin1.getFullName() + ", total power - " + slytherin1.calculateTotalPowerSpecialSlytherin();
        } else {
            return slytherin1.getFullName() + ", total power - " + slytherin1.calculateTotalPowerSpecialSlytherin() +
                    ", and, " +
                    slytherin2.getFullName() + ", total power - " + slytherin2.calculateTotalPowerSpecialSlytherin() +
                    " have egual power ";
        }
    }

    public String toString() {
        return super.toString() +
                ", Cunning: " + getCunning() +
                ", Determination: " + getDetermination() +
                ", Ambition: " + getAmbition() +
                ", Resourcefulness: " + getResourcefulness() +
                ", Thirst For Power: " + getThirstForPower();

    }
}
