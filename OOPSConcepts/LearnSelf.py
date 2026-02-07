class TestSelf:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display_info(self):
        return f" name is {self.name} and I am {self.age} years old."       

    def greet(self):
        print(f"Hello, my {self.display_info()}")
        
if __name__ == "__main__":
    person = TestSelf("Sudha", 30)
    person.greet()
