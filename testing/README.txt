this project is created using Maven commands.
mvn archetype:generate -DgroupId=com.aek426rahmani.examples -DartifactId=plinko -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
This command will create a project with the following structure:
.
├── pom.xml
└── src
├── main
│ ├── java
│ │ └── com
│ │ └── aek426rahmani
│ │ └── examples
│ │ └── App.java
│ └── resources
└── test
├── java
│ └── com
│ └── aek426rahmani
│ └── examples
│ └── AppTest.java
└── resources

all what we want to see in this project is the test folder.
we will use JUnit to test our code.
to run the code we will use this command:
mvn test