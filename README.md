#Design Patterns
Projects which contain design patterns

**Creational patterns:**

* **Builder:**

| Scheme | Problem | Solution 
| :---:| :---: | :---: |
| ![alt tag](https://github.com/EliseyCode/DesignPatterns/blob/8b4b971df3a8a5b93ad283e999b8b26a793de73f/src/main/resources/Builder.gif?raw=true)  | An application needs to create the elements of a complex aggregate. The specification for the aggregate exists on secondary storage and one of many representations needs to be built in primary storage.| Separate the construction of a complex object from its representation. Construct the product step by step under the control of the "director". The "director" invokes "builder" services as it interprets the external format. The "builder" creates part of the complex object each time it is called and maintains all intermediate state. When the product is finished, the client retrieves the result from the "builder".

* **Abstract Factory:**

| Scheme | Problem | Solution 
| :---:| :---: | :---: |
| ![alt tag](https://github.com/EliseyCode/DesignPatterns/blob/master/src/main/resources/Abstract_factory.png?raw=true)  | If an application is to be portable, it needs to encapsulate platform dependencies. These "platforms" might include: windowing system, operating system, database, etc. Encapsulation must work without if-else cases. | Provide a level of indirection that abstracts the creation of families of related or dependent objects without directly specifying their concrete classes. The "factory" object has the responsibility for providing creation services for the entire platform family. Clients never create platform objects directly, they ask the factory to do that for them