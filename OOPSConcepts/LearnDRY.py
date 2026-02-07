class User:
    def __init__(self, name, email):
        self.name = name
        self.email = EmailValidator.validate_email(email)

    def display_info(self):
        return f"Name: {self.name}, Email: {self.email}"
    
    def get_email(self):
        return self.email
    
class NewsletterSubscriber:
    def __init__(self, name, email):
        self.name = name
        self.email = EmailValidator.validate_email(email)

    def display_info(self):
        return f"Name: {self.name}, Email: {self.email}"
    
    def get_email(self):
        return self.email
    
# utility class to validate email addresses following DRY principle
class EmailValidator:
    @staticmethod
    def validate_email(email):
        if "@" not in email or "." not in email:
            raise ValueError("Invalid email address")
        return email

if __name__ == "__main__":
    user = User("Alice", "alice@gmail.com")
    subscriber = NewsletterSubscriber("Bob", "bob@gmail.com")
    print(user.display_info())
    print(subscriber.display_info())
    
