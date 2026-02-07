class Student:
    def __init__(self, name, id):
        self.name = name
        self.id = id

    def get_student_info(self):
        return f"Student Name: {self.name}, ID: {self.id}"
        
class Department:
    def __init__(self, name):
        self.name = name
        self.students = []
        
    def get_department_name(self):
        return self.name
    
    def set_department_name(self, name):
        self.name = name
        
    def add_students(self, students):
        self.students = students
    
class University:
    def __init__(self, name):
        self.name = name
        self.departments = []
        
    def get_university_name(self):
        return self.name
    
    def set_university_name(self, name):
        self.name = name
        
    def add_departments(self, departments):
        self.departments = departments  
        
if __name__ == "__main__":
    # Create Students
    student1 = Student("Alice", "S001")
    student2 = Student("Bob", "S002")
    student3 = Student("Charlie", "S003")
    
    # Create Departments and add students
    cs_department = Department("Computer Science")
    cs_department.add_students([student1, student2])
    
    math_department = Department("Mathematics")
    math_department.add_students([student3])
    
    # Create University and add departments
    university = University("Tech University")
    university.add_departments([cs_department, math_department])
    
    # Display information
    print(f"University: {university.get_university_name()}")
    for dept in university.departments:
        print(f" Department: {dept.get_department_name()}")
        for stu in dept.students:
            print(f"  - {stu.get_student_info()}")
            
            