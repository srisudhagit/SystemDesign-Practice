class BankAccount:
    def __init__(self, account_number, initial_balance=0):
        # one way fo acheiving encapsulation using private attributes
        self.__account_number = account_number  # Private attribute
        self.__balance = initial_balance        # Private attribute

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            print(f"Deposited: {amount}. New balance: {self.__balance}")
        else:
            print("Deposit amount must be positive.")

    def withdraw(self, amount):
        if 0 < amount <= self.__balance:
            self.__balance -= amount
            print(f"Withdrew: {amount}. New balance: {self.__balance}")
        else:
            print("Insufficient funds or invalid withdrawal amount.")

    # another way of acheiving encapsulation using getter and setter methods
    def get_balance(self):
        return self.__balance

    def get_account_number(self):
        return self.__account_number
    
    def print_account_details(self):
        # private attributes accessed only within the class
        print(f"Account Number: {self.__account_number}, Balance: {self.__balance}")
        
        
if __name__ == "__main__":
    account = BankAccount("123456789", 1000)
    account.print_account_details()
    
    account.deposit(500)
    account.withdraw(200)
    print(f"Final Balance: {account.get_balance()}")
    
    
    
class PaymentProcessor:
    def __init__(self,card_number,amount):
        self.__card_number = card_number
        self.__amount = amount
        
    def __mask_card_number(self):
        return "**** **** **** " + self.__card_number[-4:]
        
    def process_payment(self, amount):
        if amount > 0:
            print(f"Processing payment of ${amount:.2f} using card ending with {self.__card_number[-4:]}")
        else:
            print("Payment amount must be positive.")
    
if __name__ == "__main__":
    payment_processor = PaymentProcessor("1234567812345678", 100)
    payment_processor.process_payment(100)

