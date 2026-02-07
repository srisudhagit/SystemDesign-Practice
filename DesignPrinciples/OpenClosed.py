from abc import ABC, abstractmethod

class Payment_Method(ABC):
    @abstractmethod
    def process_payment(self, amount):
        raise NotImplementedError("Subclasses must implement this method")
    
class CreditCardPayment(Payment_Method):
    def process_payment(self, amount):
        return f"Processing credit card payment of ${amount}"

class PayPalPayment(Payment_Method):
    def process_payment(self, amount):
        return f"Processing PayPal payment of ${amount}"
    
# when a new payment method is added, we just need to create a new class
# that implements the Payment_Method interface without modifying existing code. 
# Using abstraction, we implement open/closed principle where payment_method is open for extension but closed for modification.
class BitcoinPayment(Payment_Method):
    def process_payment(self, amount):
        return f"Processing Bitcoin payment of ${amount}"
    
class PaymentProcessor:
    def __init__(self, payment_method: Payment_Method):
        self.payment_method = payment_method
        
    def execute_payment(self, amount):
        return self.payment_method.process_payment(amount)
    
if __name__ == "__main__":
    credit_card_payment = CreditCardPayment()
    paypal_payment = PayPalPayment()
    bitcoin_payment = BitcoinPayment()
    
    processor1 = PaymentProcessor(credit_card_payment)
    processor2 = PaymentProcessor(paypal_payment)
    processor3 = PaymentProcessor(bitcoin_payment)
    
    print(processor1.execute_payment(100))
    print(processor2.execute_payment(200))
    print(processor3.execute_payment(300))
    
