# FactoryDesignPattern

Type: This falls in creational design pattern. 

1. OS.java is an interface and Three different classes(Windows, IOS, Android) are implementing this interface.
2. FactoryPattern is a class which is responsible for returnning the instance of required class based on type.
3. FactoryMain will create a object of factoryPattern class and will get an instance of required class and then will call getSpecification of that class.

So, in this way we can see, how object creation is abstracted from the actual application.
