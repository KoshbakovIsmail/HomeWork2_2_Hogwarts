public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor[] gryffindor = new Gryffindor[3];
        gryffindor[0] = new Gryffindor("Gryffindor", "Harry Potter", 100, 95, 98, 99, 100);
        gryffindor[1] = new Gryffindor("Gryffindor", "Hermione Granger", 98, 94, 90, 95, 95);
        gryffindor[2] = new Gryffindor("Gryffindor", "Ron Weasley", 90, 85, 85, 85, 95);

        Slytherin[] slytherin = new Slytherin[3];
        slytherin[0] = new Slytherin("Slytherin", "Draco Malfoy", 75, 75, 85, 90, 90, 90, 100);
        slytherin[1] = new Slytherin("Slytherin", "Graham Montague", 60, 65, 70, 75, 70, 85, 70);
        slytherin[2] = new Slytherin("Slytherin", "Gregory Goyle", 70, 75, 85, 60, 65, 70, 60);

        Hufflepuff[] hufflepuff = new Hufflepuff[3];
        hufflepuff[0] = new Hufflepuff("Hufflepuff", "Zachariah Smith", 80, 85, 85, 90, 80);
        hufflepuff[1] = new Hufflepuff("Hufflepuff", "Cedric Diggory", 75, 70, 60, 80, 55);
        hufflepuff[2] = new Hufflepuff("Hufflepuff", "Justin Finch-Fletchley", 60, 60, 55, 45, 30);

        Ravenclaw[] ravenclaw = new Ravenclaw[3];
        ravenclaw[0] = new Ravenclaw("Ravenclaw", "Zhou Chang", 60, 65, 55, 50, 85, 60);
        ravenclaw[1] = new Ravenclaw("Ravenclaw", "Padma Patil", 65, 65, 70, 75, 60, 65);
        ravenclaw[2] = new Ravenclaw("Ravenclaw", "Marcus Belby", 60, 65, 55, 50, 85, 60);
        Student.printStars();
        Student.printListHogwartsStrudent(gryffindor, slytherin, hufflepuff, ravenclaw);
        Student.printStars();
        System.out.println((Student.comparisonStudentsShcoolHogwart(gryffindor[0], slytherin[0])));
        Student.printStars();
        System.out.println(Gryffindor.comparisonStudentsFacultyGryffindor(gryffindor[1], gryffindor[2]));
        Student.printStars();
        System.out.println(Slytherin.comparisonStudentsFacultySlytherin(slytherin[1], slytherin[2]));
        Student.printStars();
        System.out.println(Hufflepuff.comparsionStudentsFacultyHuffepuff(hufflepuff[0], hufflepuff[2]));
        Student.printStars();
        System.out.println(Ravenclaw.comparisonStudentsFacultyRavenclaw(ravenclaw[0], ravenclaw[2]));
        Student.printStars();

    }
}