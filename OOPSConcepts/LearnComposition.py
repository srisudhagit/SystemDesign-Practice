class Computer:
    def __init__(self, brand, processor, ram, storage):
        # classic exmaple of composition
        self.brand = brand
        self.processor = Processor("abc123", 8, 3.6)  # example processor
        self.ram = RAM(16, "DDR4")  # example RAM
        self.storage = Storage(512, "SSD")  # example storage

    def display_specs(self):
        return (f"Brand: {self.brand}, Processor: {self.processor}, "
                f"RAM: {self.ram}GB, Storage: {self.storage}GB")
        
class Processor:
    def __init__(self, model, cores, frequency):
        self.model = model
        self.cores = cores
        self.frequency = frequency  # in GHz

    def get_processor_info(self):
        return f"Model: {self.model}, Cores: {self.cores}, Frequency: {self.frequency}GHz"
    
class RAM:
    def __init__(self, size, type):
        self.size = size  # in GB
        self.type = type  # e.g., DDR4, DDR5

    def get_ram_info(self):
        return f"Size: {self.size}GB, Type: {self.type}"    
    
class Storage:
    def __init__(self, capacity, type):
        self.capacity = capacity  # in GB
        self.type = type  # e.g., SSD, HDD

    def get_storage_info(self):
        return f"Capacity: {self.capacity}GB, Type: {self.type}"

if __name__ == "__main__":
    my_computer = Computer("Dell", None, None, None)
    print(my_computer.display_specs())
    print(my_computer.processor.get_processor_info())
    print(my_computer.ram.get_ram_info())
    print(my_computer.storage.get_storage_info())
    