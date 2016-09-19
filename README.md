# interactors-core


### Introduction

This project parses IntAct clustered interactions and save them into a lightweight database (SQLite). Once the database is created, the Service layer can be used to access interactor data.

### How to run the parser in order to create the database ?


- Clone project

```
git clone https://github.com/reactome-pwp/interactors-core.git
```

- Go to project directory and package.

```
mvn package -DskipTests
```

- Run IntActParser

```
java -jar target/InteractorsParser-jar-with-dependencies.jar
```

  Options:
  
  ```
    -f <IntAct file to be parsed>
    -g <Interactor Database Path> ** Required **
    -d <Flag to download IntAct file>
    -o <Output parser file messages>
    -t <Folder to save the downloaded file>
  ```

