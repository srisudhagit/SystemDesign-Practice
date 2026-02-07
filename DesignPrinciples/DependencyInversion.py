from abc import ABC, abstractmethod

"""
class Gmail_Service:
    def send_email(self, to: str, subject: str, body: str) -> None:
        return f"Sending email to {to} via Gmail with subject '{subject}'"
    
Email sender here depends on Gmail_Service directly. This creates a tight coupling between Email_Sender and Gmail_Service.
If we want to switch to another email service, we have to modify the Email_Sender class, which violates the Dependency Inversion Principle

class Email_Sender:
    def __init__(self, email_service: Gmail_Service):
        self.email_service = email_service
        
    def send(self, to: str, subject: str, body: str) -> None:
        return self.email_service.send_email(to, subject, body)
"""


class EmailService(ABC):
    @abstractmethod
    def send_email(self, to: str, subject: str, body: str) -> None:
        pass    
    
# low level components depend on the abstraction EmailService
class GmailService(EmailService):
    def send_email(self, to: str, subject: str, body: str) -> None:
        return f"Sending email to {to} via Gmail with subject '{subject}'"
    
class OutlookService(EmailService):
    def send_email(self, to: str, subject: str, body: str) -> None:
        return f"Sending email to {to} via Outlook with subject '{subject}'"

# high level module also depends on the abstraction EmailService
# Dependency is inverted here. Both high level and low level modules depend on the abstraction.
# Dependency inverted from concrete implementation to abstraction.
class EmailSender:
    def __init__(self, email_service: EmailService):
        self.email_service = email_service
        
    def send(self, to: str, subject: str, body: str) -> None:
        return self.email_service.send_email(to, subject, body)
    
if __name__ == "__main__":
    gmail_service = GmailService()
    outlook_service = OutlookService()
    
    gmail_sender = EmailSender(gmail_service)
    outlook_sender = EmailSender(outlook_service)
    
    print(gmail_sender.send("user@example.com", "Hello", "This is a test email using gmail."))
    print(outlook_sender.send("user@example.com", "Hello", "This is a test email using outlook."))