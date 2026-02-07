#association based on unidirectionality
class Engine:
    def __init__(self, parts):
        self.parts = parts
        
    def start(self):
        return "Engine started"
    
    def stop(self):
        return "Engine stopped"

    def add_part(self, part):
        self.parts.append(part)
    
class Part:
    def __init__(self, part_name):
        self.part_name = part_name  
        
    def get_part_name(self):
        return self.part_name
    
    def set_part_name(self, part_name):
        self.part_name = part_name

#association based on bidirectionality
class Library:
    def __init__(self, name):
        self.name = name
        self.books = []
        
    def add_book(self, book):
        self.books.append(book)
        book.set_library(self)
        
    def get_books(self):
        return [book.title for book in self.books]  
    
class Book:
    def __init__(self, title):
        self.title = title
        self.library = None
        
    def set_library(self, library):
        self.library = library
        
    def get_library_name(self):
        if self.library:
            return self.library.name
        return None
    
# association based on 1-1 multiplicity relationship
class Person:
    def __init__(self, name):
        self.name = name
        self.id_card = None

class IdCard:
    def __init__(self, card_number):
        self.card_number = card_number
        self.person = None

    def set_person(self, person):
        self.person = person
        
#assocaition based on 1-many multiplicity relationship
class Company:
    def __init__(self, name):
        self.name = name
        self.employees = []
        
    def add_employee(self, employee):
        self.employees.append(employee)
        employee.set_company(self)
        
class Employee:
    def __init__(self, name):
        self.name = name
        self.company = None
        
    def set_company(self, company):
        self.company = company  
        
#association based on many-many multiplicity relationship
class Student:
    def __init__(self, name):
        self.name = name
        self.courses = []
        
    def enroll(self, course):
        if course not in self.courses:
            self.courses.append(course)
            course.add_student(self)
            
class Course:
    def __init__(self, title):
        self.title = title
        self.students = []
        
    def add_student(self, student):
        if student not in self.students:
            self.students.append(student)
            
# Example usage
if __name__ == "__main__":
    # Unidirectional Association
    engine = Engine(parts=[])
    part1 = Part("Piston")
    part2 = Part("Spark Plug")
    engine.add_part(part1)
    engine.add_part(part2)
    print(engine.start())
    print(f"Engine parts: {[part.get_part_name() for part in engine.parts]}")
    print(engine.stop())
    
    # Bidirectional Association
    library = Library("City Library")
    book1 = Book("1984")
    book2 = Book("To Kill a Mockingbird")
    library.add_book(book1)
    library.add_book(book2)
    book1.set_library(library)
    book2.set_library(library)
    print(f"Books in {library.name}: {library.get_books()}")
    print(f"'{book1.title}' is in library: {book1.get_library_name()}")
    
    # 1-1 Multiplicity Association
    person = Person("John Doe")
    id_card = IdCard("ID123456")
    id_card.set_person(person)
    person.id_card = id_card
    print(f"{person.name} has ID card number: {person.id_card.card_number}")
    
    # 1-Many Multiplicity Association
    company = Company("Tech Corp")
    emp1 = Employee("Alice")
    emp2 = Employee("Bob")
    company.add_employee(emp1)
    company.add_employee(emp2)
    emp1.set_company(company)
    emp2.set_company(company)
    print(f"Employees at {company.name}: {[emp.name for emp in company.employees]}")
    
    # Many-Many Multiplicity Association
    student1 = Student("Charlie")
    student2 = Student("Diana")
    course1 = Course("Math 101")
    course2 = Course("History 201")
    student1.enroll(course1)
    student1.enroll(course2)
    student2.enroll(course1)
    course1.add_student(student1)
    course1.add_student(student2)
    course2.add_student(student1)
    print(f"{student1.name} is enrolled in: {[course.title for course in student1.courses]}")
    print(f"{student2.name} is enrolled in: {[course.title for course in student2.courses]}")
    print(f"Students in {course1.title}: {[student.name for student in course1.students]}")