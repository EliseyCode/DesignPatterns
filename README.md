#Design Patterns
Projects which contain design patterns

**Behavioral:**

* **Builder:**

| Scheme | Problem | Solution 
| :---:| :---: | :---: |
| ![alt tag](https://github.com/EliseyCode/DesignPatterns/blob/8b4b971df3a8a5b93ad283e999b8b26a793de73f/src/main/resources/Builder.gif?raw=true)  | An application needs to create the elements of a complex aggregate. The specification for the aggregate exists on secondary storage and one of many representations needs to be built in primary storage.| Separate the construction of a complex object from its representation. Construct the product step by step under the control of the "director". The "director" invokes "builder" services as it interprets the external format. The "builder" creates part of the complex object each time it is called and maintains all intermediate state. When the product is finished, the client retrieves the result from the "builder".


