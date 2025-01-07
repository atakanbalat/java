public class Main {
    public static void main(String[] args) {
        // Çalışan nesnelerini oluşturuyoruz
        Employee employee1 = new Employee("Ali Yılmaz", 1500, 45, 2015);
        Employee employee2 = new Employee("Veli Demir", 1200, 38, 2000);
        Employee employee3 = new Employee("Ahmet Kaya", 800, 50, 2018);
        Employee employee4 = new Employee("Mehmet Aksoy", 2000, 42, 1995);

        // Çalışanların bilgilerini yazdırmadan önce hesaplamaları yapalım
        System.out.println(employee1.toString());
        System.out.println("Vergi: " + employee1.tax() + " TL");
        System.out.println("Bonus: " + employee1.bonus() + " TL");
        employee1.raiseSalary();
        System.out.println("Yeni Maaş: " + employee1.getSalary() + " TL\n");

        System.out.println("--------------------------------------------------\n");

        System.out.println(employee2.toString());
        System.out.println("Vergi: " + employee2.tax() + " TL");
        System.out.println("Bonus: " + employee2.bonus() + " TL");
        employee2.raiseSalary();
        System.out.println("Yeni Maaş: " + employee2.getSalary() + " TL\n");

        System.out.println("--------------------------------------------------\n");

        System.out.println(employee3.toString());
        System.out.println("Vergi: " + employee3.tax() + " TL");
        System.out.println("Bonus: " + employee3.bonus() + " TL");
        employee3.raiseSalary();
        System.out.println("Yeni Maaş: " + employee3.getSalary() + " TL\n");

        System.out.println("--------------------------------------------------\n");

        System.out.println(employee4.toString());
        System.out.println("Vergi: " + employee4.tax() + " TL");
        System.out.println("Bonus: " + employee4.bonus() + " TL");
        employee4.raiseSalary();
        System.out.println("Yeni Maaş: " + employee4.getSalary() + " TL\n");
    }
}
