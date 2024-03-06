package src.main.java.org.example;

public class CommissionEmployee {
    // Fields
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // Constructor
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales,
                              double commissionRate) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // Method to calculate earnings
    public double earnings() {
        return commissionRate * grossSales;
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }

    public static void main(String[] args) {
        // Example usage
        CommissionEmployee employee1 = new CommissionEmployee("Ayomide", "Afolalu", "123-45-6789", 1000.0, 0.1);
        System.out.println(employee1);
        System.out.println("Earnings: $" + employee1.earnings());

        CommissionEmployee employee2 = new CommissionEmployee("will", "Smith", "456-78-9012", 1500.0, 0.15);
        System.out.println(employee2);
        System.out.println("Earnings: $" + employee2.earnings());

        CommissionEmployee employee3 = new CommissionEmployee("Bob", "ayo", "789-01-2345", 2000.0, 0.2);
        System.out.println(employee3);
        System.out.println("Earnings: $" + employee3.earnings());

        CommissionEmployee employee4 = new CommissionEmployee("Mic", "Dan", "234-56-7890", 1200.0, 0.12);
        System.out.println(employee4);
        System.out.println("Earnings: $" + employee4.earnings());

        CommissionEmployee employee5 = new CommissionEmployee("Riyard", "Mill", "567-89-0123", 1800.0, 0.18);
        System.out.println(employee5);
        System.out.println("Earnings: $" + employee5.earnings());
    }
}
