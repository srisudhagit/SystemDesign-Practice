class Car:
    def __init__(self,make, model, year):
        self.make = make
        self.model = model
        self.year = year
        self.speed = 0
        
    def accelerate(self, increment):
        self.speed += increment
        print(f"The car {self.make} has accelerated. Current speed: {self.speed} km/h")
        
    def brake(self, decrement):
        self.speed = max(0, self.speed - decrement)
        print(f"The car {self.make} has slowed down. Current speed: {self.speed} km/h")         
        
        
# Example usage
if __name__ == "__main__":
    my_car = Car("Toyota", "Corolla", 2020)
    my_car.accelerate(30)
    my_car.brake(10)
    my_car.accelerate(50)
    my_car.brake(100)
    
    
    
class Calculator:
    def add(self,a,b,):
        return a + b

    def subtract(self,a,b):
        return a - b
    
    def multiply(self,a,b):
        return a * b
    
    def divide(self,a,b):
        if b == 0:
            return "Error! Division by zero."
        return a / b    
    
if __name__ == "__main__":
    calc = Calculator()
    print("Addition:", calc.add(10, 5))
    print("Subtraction:", calc.subtract(10, 5))
    print("Multiplication:", calc.multiply(10, 5))
    print("Division:", calc.divide(10, 0))
    
class PlayList:
    def __init__(self,name):
        self.name = name
        self.songs = []
        
    def add_song(self, song):
        self.songs.append(song)
        print(f'Added "{song}" to the playlist.')
        
    def remove_song(self, song):
        if song in self.songs:
            self.songs.remove(song)
            print(f'Removed "{song}" from the playlist.')
        else:
            print(f'"{song}" not found in the playlist.')
            
    def display_songs(self):
        print("Playlist:")
        for song in self.songs:
            print(f"- {song}")  
            
    def renamePlaylist(self, new_name):
        self.name = new_name
        print(f'Playlist renamed to "{new_name}".')
        
if __name__ == "__main__":
    my_playlist = PlayList("My Favorites")
    my_playlist.add_song("Song A")
    my_playlist.add_song("Song B")
    my_playlist.display_songs()
    my_playlist.remove_song("Song A")
    my_playlist.renamePlaylist("Chill Vibes")
    my_playlist.display_songs()