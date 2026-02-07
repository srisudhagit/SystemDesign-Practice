from abc import ABC,abstractmethod

class PaymentProcessor(ABC):
    @abstractmethod
    def process_payment(self, amount):
        pass
    
    
class CreditCardProcessor(PaymentProcessor):
    def process_payment(self, amount):
        print(f"Processing credit card payment of ${amount:.2f}")       
        
class PayPalProcessor(PaymentProcessor):
    def process_payment(self, amount):
        print(f"Processing PayPal payment of ${amount:.2f}")
        
class CheckoutService:
    def __init__(self, payment_processor: PaymentProcessor):
        self.payment_processor = payment_processor
        
    def checkout(self, amount):
        self.payment_processor.process_payment(amount)  
        
    def switch_payment_processor(self, payment_processor: PaymentProcessor):
        self.payment_processor = payment_processor
        
# Example usage
if __name__ == "__main__":
    credit_card_processor = CreditCardProcessor()
    paypal_processor = PayPalProcessor()
    
    checkout_service = CheckoutService(credit_card_processor)
    checkout_service.checkout(100.00)
    
    checkout_service.switch_payment_processor(paypal_processor)
    checkout_service.checkout(200.00)   
    
    
class Shape(ABC):
    @abstractmethod
    def area(self):
        pass
    
    @abstractmethod
    def perimeter(self):
        pass

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height
        
    def area(self):
        return self.width * self.height
    
    def perimeter(self):
        return 2 * (self.width + self.height)

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius
        
    def area(self):
        return 3.14159 * self.radius * self.radius
    
    def perimeter(self):
        return 2 * 3.14159 * self.radius
    
# Example usage
if __name__ == "__main__":
    shapes = [Rectangle(4, 5), Circle(3)]
    
    for shape in shapes:
        print(f"Area: {shape.area():.2f}")
        print(f"Perimeter: {shape.perimeter():.2f}")