from abc import ABC, abstractmethod

class NotificationService(ABC):
    @abstractmethod
    def send_notification(self, message):
        raise NotImplementedError("Subclasses must implement this method")
    
class EmailNotificationService(NotificationService):
    def send_notification(self, message):
        print(f"Sending Email notification with message: {message}")
        
class SMSNotificationService(NotificationService):
    def send_notification(self, message):
        print(f"Sending SMS notification with message: {message}")
        
class SendNotification:
    # this is polymorphism. It decides which notification service to use at runtime
    def __init__(self, notification_service: NotificationService):
        self.notification_service = notification_service
        
    def notify(self, message):
        self.notification_service.send_notification(message)
        
    def switch_service(self, notification_service: NotificationService):
        self.notification_service = notification_service
    
if __name__ == "__main__":
    email_notification = EmailNotificationService()
    SendNotification(email_notification).notify("Your order has been shipped!")
    
    sms_notification = SMSNotificationService()
    SendNotification(sms_notification).notify("Your package will arrive tomorrow.")

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
        
if __name__ == "__main__":
    credit_card_processor = CreditCardProcessor()
    checkoutservice = CheckoutService(credit_card_processor)
    checkoutservice.checkout(150.00)
    
    paypal_processor = PayPalProcessor()
    checkoutservice.switch_payment_processor(paypal_processor)
    checkoutservice.checkout(250.00)    
