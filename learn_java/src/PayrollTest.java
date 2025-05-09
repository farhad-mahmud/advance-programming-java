import java.util.Scanner;

// Interface Payable
interface Payable {
    double earnings();
}


class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}


abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    public Employee(String firstName, String lastName, String ssn, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
        this.birthDate = birthDate;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public Date getBirthDate() { return birthDate; }

    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s\nBirth Date: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }
}


class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, Date birthDate, double salary) {
        super(firstName, lastName, ssn, birthDate);
        this.weeklySalary = salary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "Salaried Employee: " + super.toString();
    }
}

public class PayrollTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployee("John", "Doe", "111-11-1111",
                new Date(5, 15, 1990), 1000.0);
        employees[1] = new SalariedEmployee("Jane", "Smith", "222-22-2222",
                new Date(10, 5, 1985), 1200.0);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter current month (1-12): ");
        int currentMonth = input.nextInt();

        for (Employee currentEmployee : employees) {
            System.out.println("\n" + currentEmployee);
            double earnings = currentEmployee.earnings();

            if (currentEmployee.getBirthDate().getMonth() == currentMonth) {
                earnings += 100.0;
                System.out.println("Happy Birthday! Bonus added: $100.00");
            }

            System.out.printf("Earned: $%.2f\n", earnings);
        }
    }
}
