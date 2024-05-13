/* Q1."Develop  a  class  named  “TaxCalculator“ with a method named calculateTax with the following method parameters,
VariableName   Data Type
empName        String
isIndian        boolean
empSal        double*/
package ThreadsEx;
import java.util.Scanner;

class CountryNotValidException extends Exception 
{
    public CountryNotValidException(String message) 
    {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception 
{
    public EmployeeNameInvalidException(String message) 
    {
        super(message);
    }
}

class TaxNotEligibleException extends Exception 
{
    public TaxNotEligibleException(String message)
    {
        super(message);
    }
}

public class CalculatorSimulator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.print("Enter employee name: ");
            String empName = scanner.nextLine();

            System.out.print("Is the employee Indian? (true/false): ");
            boolean isIndian = scanner.nextBoolean();

            if (isIndian) 
            {
                System.out.print("Enter employee salary: ");
                double empSal = scanner.nextDouble();

                // Get phone number from the user
                System.out.print("Enter employee phone number: ");
                String phoneNumber = scanner.next();

                // Get PAN card number from the user
                System.out.print("Enter employee PAN card number: ");
                String panCardNumber = scanner.next();

                double taxAmount = TaxCalculator.calculateTax(empName, isIndian, empSal);

                // Create an instance of Employee
                Employee employee = new Employee(empName, isIndian, empSal, taxAmount, phoneNumber, panCardNumber);

                // Display employee details with modified output
                System.out.println("Employee details:\n" +
                        "Employee Name: " + employee.getName() +
                        "\nThe employee is an Indian Citizen" +
                        "\nEmployee Salary: " + employee.getSalary() +
                        "\nPhone Number: " + employee.getPhoneNumber() +
                        "\nPAN Card Number: " + employee.getPanCardNumber() );
                
                // Print the tax amount line
                System.out.println("Your tax amount is: " + employee.getTaxAmount() + " Rs");
                
            } 
            else 
            {
                throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
            }
        } 
        catch (CountryNotValidException e) 
        {
            System.out.println("Country not valid: " + e.getMessage());
            e.printStackTrace();
        } 
        catch (EmployeeNameInvalidException e) 
        {
            System.out.println("Employee name not valid: " + e.getMessage());
            e.printStackTrace();
        } 
        catch (TaxNotEligibleException e) 
        {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
            e.printStackTrace();
        } 
        finally 
        {
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    }
}

