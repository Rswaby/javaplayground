
package javaplay;

import java.math.BigDecimal;

public class Employee extends Person {
    private String taxpayerIdentificationNumber;
    private String employeeNumber;
    private BigDecimal salary;

    public String getTaxpayerIdentificationNumber() {
        return this.taxpayerIdentificationNumber;
    }

    public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
    }

    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Employee() {
        super();
        // Auto‑generated constructor stub
    }

    public Employee(String name, int age, int height, int weight, String eyeColor, String gender) {
        super(name, age, height, weight, eyeColor, gender);
        // Auto-generted constructor
    }
    

    @Override
    public void printAudit(StringBuilder buffer) {
        // Call the superclass version of this method first to get its attribute values
        super.printAudit(buffer);

        // Now format this instance's values
        buffer.append("TaxpayerIdentificationNumber=");
        buffer.append(getTaxpayerIdentificationNumber());
        buffer.append(",");
        buffer.append("EmployeeNumber=");
        buffer.append(getEmployeeNumber());
        buffer.append(",");
        buffer.append("Salary=");
        buffer.append(getSalary().setScale(2).toPlainString());
    }


}