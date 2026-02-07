from enum import Enum

class Color(Enum):
    RED = 1
    GREEN = 2
    BLUE = 3

    def __init__(self, color_code):
        self.color_code = color_code
        
    def describe(self):
        return f"{self.name} has color code {self.color_code}"

def print_color_info(color):
    if color == Color.RED(1):
        Color.RED.describe()
        print("Color is Red")
    elif color == Color.GREEN(2):
        Color.GREEN.describe()
        print("Color is Green")
    elif color == Color.BLUE(3):
        Color.BLUE.describe()
        print("Color is Blue")
    else:
        print("Unknown Color")
        
    