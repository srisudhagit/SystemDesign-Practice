# use only when we have a is-a relationship. 
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self):
        return f"Hello, my name is {self.name} and I am {self.age} years old."
    
class Student(Person):
    def __init__(self, name, age, student_id):
        super().__init__(name,age)
        self.student_id = student_id
        
    def introduce(self):
        parent_intro = super().introduce()
        return f"{parent_intro} I am also a student with ID: {self.student_id}."
    
    
class Teacher(Person):
    def __init__(self, name, age, subject, teacher_id):
        super().__init__(name,age)
        self.subject = subject 
        self.teacher_id = teacher_id
        
    def introduce(self):
        parent_intro = super().introduce()
        return f"{parent_intro} I am a teacher with Id: {self.teacher_id} and I teach {self.subject}."
    
    
if __name__ == "__main__":
    student = Student("Alice", 20, "S12345")
    teacher = Teacher("Mr. Bob", 40, "Mathematics", "T67890")
    
    print(student.introduce())
    print(teacher.introduce())

