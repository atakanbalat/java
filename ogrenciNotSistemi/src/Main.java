
public class Main {
    public static void main(String[] args) {
        // Öğretmen oluşturma
        Teacher t1 = new Teacher("Dr. Ahmet", "555-123456", "Fizik");
        Teacher t2 = new Teacher("Prof. Ayşe", "555-654321", "Kimya");
        Teacher t3 = new Teacher("Doç. Mehmet", "555-987654", "Matematik");

        // Dersler oluşturuluyor
        Course fizik = new Course("Fizik", "PHYS101", "FZK", 0.80, 0.20);
        fizik.addTeacher(t1);

        Course kimya = new Course("Kimya", "CHEM101", "KMY", 0.75, 0.25);
        kimya.addTeacher(t2);

        Course matematik = new Course("Matematik", "MATH101", "MTK", 0.85, 0.15);
        matematik.addTeacher(t3);

        // Öğrenci oluşturuluyor
        Student s1 = new Student("Ali Veli", "12345", 3, fizik, kimya, matematik);

        // Öğrenci notlarını ekliyoruz
        s1.addBulkExamNote(70, 80, 90, 85, 90, 95);

        // Öğrencinin notlarını yazdırıyoruz
        s1.printNote();

        // Öğrencinin geçip geçmediğini kontrol ediyoruz
        s1.isPass();
    }
}
