from abc import ABC, abstractmethod

"""
class Document(ABC):
    @abstractmethod
    def open(self) -> str:
        raise NotImplementedError("Subclasses must implement this method")
    
    @abstractmethod
    def save(self, content: str) -> None:
        raise NotImplementedError("Subclasses must implement this method")
        
class ReadOnlyDocument(Document):
    def __init__(self, content: str):
        self._content = content 
        
    def open(self) -> str:
        return "Opening read-only document."
    
    def save(self, content: str) -> None:
        raise Exception("Cannot save a read-only document.")
        
class EditableDocument(Document):
    def __init__(self, content: str):
        self._content = content
    
    def open(self) -> str:
        return "Opening editable document."
        
    def save(self, content: str) -> None:
        self._content = content
        
if __name__ == "__main__":
    read_only_doc = ReadOnlyDocument("This is a read-only document.")
    editable_doc = EditableDocument("This is an editable document.")
    print(read_only_doc.open())
    print(read_only_doc.save("Trying to save."))  # This will raise an exception. Sub class should not violate the base class contract.
    print(editable_doc.open())
    editable_doc.save("This is the updated content of the editable document.")
"""


# Refactored code adhering to Liskov Substitution Principle
# Here, we separate the responsibilities of read-only and editable documents into different interfaces.
# This way, a ReadOnlyDocument does not have to implement a save method that it cannot support.

class Document(ABC):
    @abstractmethod
    def open(self) -> str:
        raise NotImplementedError("Subclasses must implement this method")
    @abstractmethod
    def get_content(self) -> str:
        raise NotImplementedError("Subclasses must implement this method")
    
class Editable(ABC):
    @abstractmethod
    def save_content(self, content: str) -> None:
        raise NotImplementedError("Subclasses must implement this method")
    
class ReadOnlyDocument(Document):
    def __init__(self, content: str):
        self._content = content
        
    def open(self) -> str:
        return "Opening read-only document."
    
    def get_content(self) -> str:
        return self._content
    
class EditableDocument(Document, Editable):
    def __init__(self, content: str):
        self._content = content
        
    def open(self) -> str:
        return "Opening editable document."
    
    def get_content(self) -> str:
        return self._content
    
    def save_content(self, content: str) -> None:
        self._content = content
        
if __name__ == "__main__":
    read_only_doc = ReadOnlyDocument("This is a read-only document.")
    editable_doc = EditableDocument("This is an editable document.")
    
    print(read_only_doc.open())
    print(read_only_doc.get_content())
    
    print(editable_doc.open())
    print(editable_doc.get_content())
    
    editable_doc.save_content("This is the updated content of the editable document.")
    print(editable_doc.get_content())