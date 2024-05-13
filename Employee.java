/* Q1."Develop  a  class  named  “TaxCalculator“ with a method named calculateTax with the following method parameters,
VariableName   Data Type
empName        String
isIndian        boolean
empSal        double*/
package ThreadsEx;
public class Employee 
{
	private String name;
    private boolean isIndian;
    private double salary;
    private double taxAmount;
    private String phoneNumber;
    private String panCardNumber;

    public Employee(String name, boolean isIndian, double salary, double taxAmount, String phoneNumber, String panCardNumber) 
    {
        this.name = name;
        this.isIndian = isIndian;
        this.salary = salary;
        this.taxAmount = taxAmount;
        this.phoneNumber = phoneNumber;
        this.panCardNumber = panCardNumber;
    }

    // Add getters for fields
    
    public double getTaxAmount() 
	{
		// TODO Auto-generated method stub
		return taxAmount;
	}

	public double getSalary() 
	{
		// TODO Auto-generated method stub
		return salary;
	}

	public String getName() 
	{
		// TODO Auto-generated method stub
		return name;
	}
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public String getPanCardNumber() 
    {
        return panCardNumber;
    }

    // Add toString method to display employee information
    @Override
    public String toString() 
    {
        return "Employee Name: " + name +
                "\nIs Indian: " + isIndian +
                "\nEmployee Salary: " + salary +
                "\nTax amount is: " + taxAmount +
                "\nPhone Number: " + phoneNumber +
                "\nPAN Card Number: " + panCardNumber;
    }
}
