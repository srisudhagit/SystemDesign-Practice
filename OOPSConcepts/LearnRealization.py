from abc import ABC, abstractmethod

class Flyable(ABC):
    @abstractmethod 
    def fly(self):
        pass
    
# use realization when we have to implement an interface.
# no relationship between the classes other than the implementation of the interface.
# all can use the same interface which defines the contract to provide their own implementation.
class Bird(Flyable):
    def fly(self):
        return "Bird is flying"
    
class Aeroplane(Flyable):
    def fly(self):
        return "Aeroplane is flying"

class Drone(Flyable):
    def fly(self):
        return "Drone is flying"

if __name__ == "__main__":
    bird = Bird()
    aeroplane = Aeroplane()
    drone = Drone()
    
    flyables = [bird, aeroplane, drone]
    
    for f in flyables:
        print(f.fly())
        