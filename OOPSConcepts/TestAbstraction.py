from abc import ABC, abstractmethod

# one kind of abstraction using abstact classes
class Vehicle(ABC):
    @abstractmethod
    def start_engine(self):
        pass

    @abstractmethod
    def stop_engine(self):
        pass
    
    def accelerate(self, speed):
        pass
    
class Car(Vehicle):
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
        self.engine_running = False

    def start_engine(self):
        if not self.engine_running:
            self.engine_running = True
            print(f"The engine of the {self.year} {self.make} {self.model} has started.")
        else:
            print("The engine is already running.")

    def stop_engine(self):
        if self.engine_running:
            self.engine_running = False
            print(f"The engine of the {self.year} {self.make} {self.model} has stopped.")
        else:
            print("The engine is already stopped.")
            
    def accelerate(self, speed):
        if self.engine_running:
            print(f"The {self.year} {self.make} {self.model} is accelerating to {speed} mph.")
        else:
            print("Start the engine first before accelerating.")
            
    def brake(self, speed):
        if self.engine_running:
            print(f"The {self.year} {self.make} {self.model} is braking to {speed} mph.")
        else:
            print("Start the engine first before braking.")
            
# Example usage
if __name__ == "__main__":
    my_car = Car("Honda", "Civic", 2022)
    my_car.start_engine()
    my_car.accelerate(60)
    my_car.brake(30)
    my_car.stop_engine()
    
    
# another kind of abstraction using interfaces
class Document():
    def __init__(self,content):
        self.content = content
        
    def getContent(self):
        return self.content
    
class Printer(ABC):
    @abstractmethod
    def print_document(self, document: Document):
        pass

# Docuemnt is being associated with Printer interface
class InkjetPrinter(Printer):
    def print_document(self, document: Document):
        print(f"Inkjet Printer is printing the document with content: {document.getContent()}")

class LaserPrinter(Printer):
    def print_document(self, document: Document):
        print(f"Laser Printer is printing the document with content: {document.getContent()}")

if  __name__ == "__main__":
    my_document = Document("This is a sample document.")
    my_printer = InkjetPrinter()
    my_printer.print_document(my_document)
    another_printer = LaserPrinter()
    another_printer.print_document(my_document)
    
    
# ather way of abstracting is using public APIs
class EmailService:
    def send_email(self, to_address, subject, body):
        # Simulating sending an email
        pass
    
    def receive_email(self):
        # Simulating receiving an email
        pass
    
    def __opensockettosendemail(self):
        # Simulating opening a socket to send email
        pass
    
    def delete_email(self, email_id):     
        # Simulating deleting an email
        pass
    
    def list_emails(self):
        # Simulating listing emails
        pass
    
    
