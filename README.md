# Introduction-Spring-Lab3

## Part I - Basic workshop

1. Open the project sources in NetBeans.
2. Review the Spring configuration file already included in the project (src / main / resources). It indicates that Spring will automatically search for the 'Beans' available in the indicated package.

    A continuación realizamos la revision del applicationContext.xml el cual indica que Spring va a hacer la búsqueda automática para el       "Bean".

     ![Capture1](https://user-images.githubusercontent.com/48154086/73945619-95a9a600-48c2-11ea-82ff-ae7cdb439d44.PNG)


3. Making use of the Spring configuration based on annotations mark with the annotations @Autowired and @Service the dependencies that must be injected, and the 'beans' candidates to be injected -respectively-:

    - GrammarChecker will be a bean, which depends on something like 'SpellChecker'.

    ![Capture2](https://user-images.githubusercontent.com/48154086/73945979-2aac9f00-48c3-11ea-8b9c-2353a0188c31.PNG)

    - EnglishSpellChecker and SpanishSpellChecker are the two possible candidates to be injected. One must be selected, or another, but         NOT   both (there would be dependency resolution conflict). For now, have EnglishSpellChecker used. 

    ![Capture3](https://user-images.githubusercontent.com/48154086/73946067-53cd2f80-48c3-11ea-8157-7f067063e7c3.PNG)
  
    También podemos realizar la implementacion de las inyecciones desde el Bean, tal como se muestra a continuación:
    
    ![Capture4](https://user-images.githubusercontent.com/48154086/73947719-ec64af00-48c5-11ea-8098-28fb7fae7c1f.PNG)
  
4. Make a test program, where an instance of GrammarChecker is created by Spring, and use it:

    Realizamos una prueba unitaria con EnglishSpellChecker: 
    
      ![Capture5](https://user-images.githubusercontent.com/48154086/73947904-36e62b80-48c6-11ea-9465-7179e5708c24.PNG)
    
    
## Part II 

1. Modify the configuration with annotations so that the Bean 'GrammarChecker' now makes use of the SpanishSpellChecker class (so that GrammarChecker is injected with EnglishSpellChecker instead of SpanishSpellChecker.) Verify the new result.

    Habilitamos la etiqueta @Service en la clase SpanishSpellChecker y la documentamos en la clase EnglishSpellChecker para que no haya un conflicto en la resolución de dependencias.

    ![Capture2](https://user-images.githubusercontent.com/44879884/73964484-45d9d780-48e0-11ea-93cb-155b647008ce.PNG)

    Con las modificaciones realizadas tenemos como resultado:

    ![Capture](https://user-images.githubusercontent.com/44879884/73964193-be8c6400-48df-11ea-938b-81f4d3f0bf04.PNG)
  
