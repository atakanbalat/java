public class Employee {
    // Nitelikler
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi Hesaplama Metodu
    public double tax() {
        if (salary < 1000) {
            return 0; // Maaş 1000 TL'den azsa vergi yok
        } else {
            return salary * 0.03; // Maaş 1000 TL'den fazla ise %3 vergi
        }
    }

    // Bonus Hesaplama Metodu
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30; // Haftada 40 saatten fazla çalıştıysa, her ekstra saat için 30 TL bonus
        }
        return 0; // Haftada 40 saatten fazla çalışmıyorsa bonus yok
    }

    // Maaş Artışı Hesaplama Metodu
    public void raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            salary += salary * 0.05; // 10 yıldan az çalışanlar için maaşlarına %5 zam
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            salary += salary * 0.10; // 10-20 yıl arası çalışanlar için maaşlarına %10 zam
        } else {
            salary += salary * 0.15; // 20 yıldan fazla çalışanlar için maaşlarına %15 zam
        }
    }

    // Çalışanın bilgilerini döndüren toString() metodu
    @Override
    public String toString() {
        return "Çalışan: " + name + "\n" +
                "Maaş: " + salary + " TL\n" +
                "Haftalık Çalışma Saati: " + workHours + " saat\n" +
                "İşe Başlangıç Yılı: " + hireYear;
    }

    // Getter metodları
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }
}
