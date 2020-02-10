# Blueprint Management 1


## Part I[](https://eci.gitbook.io/workshops/blueprint-management-1#part-i)

![](https://blobscdn.gitbook.com/v0/b/gitbook-28427.appspot.com/o/assets%2F-LWJN2LirJZqzEmpZ3Gn%2F-LmoBwcRZgykpBDUEYdn%2F-LmoD5BKRb7fFj_aqsS1%2FBluePrint.png?alt=media&token=2f0b638a-15ee-475b-ae09-19cd34321099)

Blueprint Class Diagram

Configure the application to work under a dependency injection scheme, as shown in the previous diagram.

The above requires:

1.  Add the dependencies of Spring. Add the Spring settings. Configure the application - by means of annotations - so that the persistence scheme is injected when the `BlueprintServices` bean is created. Complete the `getBluePrint()` and `getBlueprintsByAuthor()` operations. Implement everything required from the lower layers (for now, the available persistence scheme `InMemoryBlueprintPersistence`) by adding the corresponding tests in `InMemoryPersistenceTest`.

Se completaron los métodos addNewBluePrint(), getAllBlueprints(), getBlueprint() y getBlueprintsByAuthor(), tanto en la clase BlueprintsServices como en la clase InMemoryBlueprintPersistence y también se adicionaron en la interface BlueprintsPersistence.

![Capture3](https://user-images.githubusercontent.com/48154086/74170592-28b44a00-4bfb-11ea-822c-ed7f989b4b1d.PNG)
![Capture4](https://user-images.githubusercontent.com/48154086/74170948-b55f0800-4bfb-11ea-8ab8-02f73b90a42a.PNG)
![Capture5](https://user-images.githubusercontent.com/48154086/74170951-b5f79e80-4bfb-11ea-9d92-9c3af9f48021.PNG)

Y realizamos las respectivas para probar las funcionalidades implementadas anteriormente.

![Capture7](https://user-images.githubusercontent.com/48154086/74171077-f22aff00-4bfb-11ea-9c09-d187210e7c78.PNG)
![Capture8](https://user-images.githubusercontent.com/48154086/74171079-f2c39580-4bfb-11ea-8be4-7af4f5e13544.PNG)
![Capture6](https://user-images.githubusercontent.com/48154086/74171080-f35c2c00-4bfb-11ea-82bb-4f4e91776d92.PNG)

    
2.  Make a program in which you create (through Spring) an instance of `BlueprintServices`, and rectify its functionality: register plans, consult plans, register specific plans, etc.

Creamos la clase MainClass() en la cual instaciamos la clase BlueprintServices en donde rectificamos el funcionamiento de las funciones de registrar un Blueprints, consultar Blueprints y consultar Blueprints por autor haciendo uso de Spring.

![Capture2](https://user-images.githubusercontent.com/48154086/74170175-81371780-4bfa-11ea-9218-1fdf478dacbc.PNG)
    
3.  You want the plan query operations to perform a filtering process, before returning the planes consulted. These filters are looking to reduce the size of the plans, removing redundant data or simply sub-sampling, before returning them. Adjust the application (adding the abstractions and implementations you consider) so that the BlueprintServices class is injected with one of two possible 'filters' (or possible future filters). The use of more than one at a time is not contemplated:
    
    1.  (A) Redundancy filtering: deletes consecutive points from the plane that are repeated.
        
    2.  (B) Subsampling filtering: suppresses 1 out of every 2 points in the plane, interspersed.
        
    
4.  Add the corresponding tests to each of these filters, and test its operation in the test program, verifying that only by changing the position of the annotations - without changing anything else - the program returns the filtered planes in the way (A) or in the way (B).
