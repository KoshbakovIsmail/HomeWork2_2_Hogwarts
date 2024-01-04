public class Hufflepuff extends Student {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String faculty, String fullName, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(faculty, fullName, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public int calculateTotalPowerSpecialHufflepuff() {
        return hardworking + loyal + honest;
    }

    public static String comparsionStudentsFacultyHuffepuff(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        if (hufflepuff1.calculateTotalPowerSpecialHufflepuff() > hufflepuff2.calculateTotalPowerSpecialHufflepuff()) {
            return hufflepuff1.getFullName() + ", total power - " + hufflepuff1.calculateTotalPowerSpecialHufflepuff() +
                    ", Stronger then a student, " +
                    hufflepuff2.getFullName() + ", total power -  " + hufflepuff2.calculateTotalPowerSpecialHufflepuff();
        } else if (hufflepuff1.calculateTotalPowerSpecialHufflepuff() < hufflepuff2.calculateTotalPowerSpecialHufflepuff()) {
            return hufflepuff2.getFullName() + ", total power - " + hufflepuff2.calculateTotalPowerSpecialHufflepuff() +
                    ", Stronger then a student, " +
                    hufflepuff1.getFullName() + ", total power -  " + hufflepuff1.calculateTotalPowerSpecialHufflepuff();
        } else {
            return hufflepuff1.getFullName() + ", total power - " + hufflepuff1.calculateTotalPowerSpecialHufflepuff() +
                    ", and, " +
                    hufflepuff2.getFullName() + ", total power - " + hufflepuff2.calculateTotalPowerSpecialHufflepuff() +
                    " have egual power";
        }
    }

    public String toString() {
        return super.toString() +
                ", Hardworking: " + getHardworking() +
                ", Loyal: " + getLoyal() +
                ", Honest: " + getHonest();
    }
}

