public class Student {
    String name;
    String stuNo;
    int classes;
    Course course1, course2, course3;
    double average;
    boolean isPass;

    // Student constructor
    public Student(String name, String stuNo, int classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0;
        this.isPass = false;
    }

    // Toplu sınav notu girme metodu
    public void addBulkExamNote(double exam1, double exam2, double exam3, double verbal1, double verbal2, double verbal3) {
        this.course1.examNote = exam1;
        this.course2.examNote = exam2;
        this.course3.examNote = exam3;

        this.course1.verbalNote = verbal1;
        this.course2.verbalNote = verbal2;
        this.course3.verbalNote = verbal3;
    }

    // Ortalama hesaplama metodu
    public void calcAverage() {
        double course1Average = this.course1.calcAverage();
        double course2Average = this.course2.calcAverage();
        double course3Average = this.course3.calcAverage();

        this.average = (course1Average + course2Average + course3Average) / 3;
    }

    // Geçme durumu kontrolü
    public void isPass() {
        if (this.course1.calcAverage() >= 60 && this.course2.calcAverage() >= 60 && this.course3.calcAverage() >= 60) {
            this.isPass = true;
            System.out.println("Geçtiniz!");
        } else {
            this.isPass = false;
            System.out.println("Kaldınız.");
        }
    }

    // Notları yazdırma metodu
    public void printNote() {
        System.out.println(this.course1.name + " Notu: " + this.course1.calcAverage());
        System.out.println(this.course2.name + " Notu: " + this.course2.calcAverage());
        System.out.println(this.course3.name + " Notu: " + this.course3.calcAverage());
        System.out.println("Genel Ortalama: " + this.average);
    }
}
