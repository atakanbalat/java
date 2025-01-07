public class Course {
    String name;
    String code;
    String prefix;
    Teacher teacher;
    double examNote;
    double verbalNote;
    double examWeight;  // Sınavın ortalamaya etkisi (0 ile 1 arasında bir değer)
    double verbalWeight;  // Sözlü notunun ortalamaya etkisi (0 ile 1 arasında bir değer)

    // Course constructor
    public Course(String name, String code, String prefix, double examWeight, double verbalWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examWeight = examWeight;
        this.verbalWeight = verbalWeight;
    }

    // Öğretmeni ekleyen metod
    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Öğretmeni yazdıran metod
    public void printTeacher() {
        System.out.println("Dersin öğretmeni: " + this.teacher.name);
    }

    // Derse ait notların ortalamasını hesaplayan metod
    public double calcAverage() {
        return (this.examNote * this.examWeight) + (this.verbalNote * this.verbalWeight);
    }
}
