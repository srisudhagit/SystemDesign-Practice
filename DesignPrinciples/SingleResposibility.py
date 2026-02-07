class Employee:
    # Employee class focuses solely on employee details nothing else
    def __init__(self, name, position, id=None):
        self.name = name
        self.position = position
        self.id = id  # Employee ID can be set later
        self.email = None  # Email can be set later
        self.base_salary = 0  # Salary can be set later
        
    def get_details(self):
        return f"Name: {self.name}, Position: {self.position}, ID: {self.id}, email: {self.email}, Base Salary: {self.base_salary}"
    
    def set_email(self, email):
        self.email = email
    
    def set_salary(self, salary):
        self.base_salary = salary

# Separate class to handle payroll calculations following Single Responsibility Principle
# Each class has a single responsibility.
# Even though both classes deal with employee data, their responsibilities are distinct.
class Payroll:
    def __init__(self, employee):
        self.employee = employee    
        self.base_salary = employee.base_salary

    def calculate_payroll(self):
        base_pay = self.base_salary
        # Additional payroll calculations can be added here
        tax = base_pay * 0.1  # Example tax deduction
        benefits = base_pay * 0.05  # Example benefits addition
        total_pay = base_pay - tax + benefits
        return total_pay - tax + benefits

# payslip generation is another responsibility which might be needed by other claases too
# Separate class to handle payslip generation following Single Responsibility Principle
class GeneratePayslip:
    def __init__(self, employee, base_salary):
        self.employee = employee
        self.base_salary = base_salary

    def generate(self):
        return f"Payslip for {self.employee.name}: ${self.base_salary}"  

if __name__ == "__main__":
    emp = Employee("John Doe", "Software Engineer")
    emp.set_salary(5000)
    print(emp.get_details())

    payroll = Payroll(emp)
    payslip = GeneratePayslip(emp, payroll.calculate_payroll())
    print(payslip.generate())