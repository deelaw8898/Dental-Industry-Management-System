public class Employee extends Person{
    private String Department;
    private String BranchCode;
    private String EmployeeId;
    private String Pay;

    public Employee(String title, String firstName, String surName, String healthCardNumber, String email, String dateOfBirth, String address, String postalCode, String contactHome, String contactCell, String contactWork, String emergencyContactName, String emergencyContactNumber, String department, String branchCode, String employeeId, String pay) {
        super(title, firstName, surName, healthCardNumber, email, dateOfBirth, address, postalCode, contactHome, contactCell, contactWork, emergencyContactName, emergencyContactNumber);
        Department = department;
        BranchCode = branchCode;
        Pay = pay;
        EmployeeId = employeeId;
    }
    public Employee() {

    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDepartment='" + Department + '\'' +
                ",\nBranchCode='" + BranchCode + '\'' +
                ",\nEmployeeId='" + EmployeeId + '\'';
    }
}