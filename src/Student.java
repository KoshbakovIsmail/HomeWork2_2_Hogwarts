public class Student {
    private String faculty;
    private String fullName;
    private int magicPower;
    private int transgressionDistance;

    public Student(String faculty, String fullName, int magicPower, int transgressionDistance) {
        this.faculty = faculty;
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public int calculateTotalMagicPower() {
        return magicPower + transgressionDistance;
    }

    public static String comparisonStudentsShcoolHogwart(Student student1, Student student2) {
        if (student1.calculateTotalMagicPower() > student2.calculateTotalMagicPower()) {
            return student1.getFullName() + ", total power - " + student1.calculateTotalMagicPower() +
                    ", Stronger than a student, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalMagicPower();
        } else if (student1.calculateTotalMagicPower() < student2.calculateTotalMagicPower()) {
            return student2.getFullName() + ", total power - " + student2.calculateTotalMagicPower() +
                    ", Stronger than a student, " +
                    student1.getFullName() + ", total power - " + student1.calculateTotalMagicPower();
        } else {
            return student1.getFullName() + ", total power - " + student1.calculateTotalMagicPower() +
                    ", and, " +
                    student2.getFullName() + ", total power - " + student2.calculateTotalMagicPower() +
                    " have equal power";
        }
    }

    public static void printListHogwartsStrudent(Gryffindor[] gryffindor, Slytherin[] slytherin, Hufflepuff[] hufflepuff, Ravenclaw[] ravenclaw) {
        System.out.println(" ".repeat(28) + "**********" + " ".repeat(10) + "List of Hogwarts School students" + " ".repeat(10) + "**********");
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor gryffindor1 = gryffindor[i];
            System.out.println(gryffindor1.toString());
        }
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin slytherin1 = slytherin[i];
            System.out.println(slytherin1.toString());
        }
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff hufflepuff1 = hufflepuff[i];
            System.out.println(hufflepuff1.toString());
        }
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw ravenclaw1 = ravenclaw[i];
            System.out.println(ravenclaw1.toString());
        }
    }

    public static void printStars() {
        System.out.println("*".repeat(140));
    }

    public String toString() {
        return "Faculty: " + getFaculty() +
                ", Full Name: " + getFullName() +
                ", Magic Power: " + getMagicPower() +
                ", Transgression Distance: " + getTransgressionDistance();
    }

}
