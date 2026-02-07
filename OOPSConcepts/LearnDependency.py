class Document:
    def __init__(self, title, content):
        self.title = title
        self.content = content

    def get_title(self):
        return self.title

    def get_content(self):
        return self.content
    
class Printer:
    # this is exmaple of dependency using only within a method as a method parameter
    def print_document(self, document):
        print(f"Printing Document: {document.get_title()}")
        print(f"Content: {document.get_content()}") 
        
if __name__ == "__main__":
    my_document = Document("My Report", "This is the content of my report.")
    my_printer = Printer()
    my_printer.print_document(my_document)
    
class Email:
    def __init__(self, recipient, subject, body):
        self.recipient = recipient
        self.subject = subject
        self.body = body

    def get_recipient(self):
        return self.recipient

    def get_subject(self):
        return self.subject

    def get_body(self):
        return self.body

class EmailSender:
    # another example of dependency using only within a method as a method parameter
    def send_email(self, email):
        print(f"Sending Email to: {email.get_recipient()}")
        print(f"Subject: {email.get_subject()}")
        print(f"Body: {email.get_body()}")  
        
if __name__ == "__main__":
    # this is depdency injection via method parameter
    my_email = Email("abcd", "Meeting Reminder", "Don't forget about our meeting tomorrow at 10 AM.")
    email_sender = EmailSender()
    email_sender.send_email(my_email)   
    
# dependency injection via constructor
class Logger:
    def log(self, message):
        print(f"Log: {message}")        
        
class Application:
    def __init__(self, logger: Logger):
        self.logger = logger
        
    def run(self):
        self.logger.log("Application is starting...")
        # Application logic here
        self.logger.log("Application is running...")
        self.logger.log("Application has stopped.")
        
if __name__ == "__main__":
    logger = Logger()
    app = Application(logger)
    app.run()
    
