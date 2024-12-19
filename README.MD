architecture and prerequisites:

programming language: Java 11
dependency manager: maven 3.8.8
Implemented design pattern: POM
IDE: Intellij Idea
IDE plugins: cucumber for java. gherkin

Execution:

test scenarios
The test scenarios are hosted in a file with a .feature extension, the path to find them is as follows:
src/test/resources/features.

Each test scenario is identified by a "tag", which is recognized because it begins
with the character "@", in order to execute it, said scenario id must be captured 
and configured in the "Runner" class.

In the Runner class found in the path: src/test/java, the "tag" attribute is found,
there it is pasted into the id of the test scenario and click on the run button
of the corresponding IDE.



description of the automation strategy:

For each of the proposed scenarios, their respective E2E flows are designed, 
in which there is the possibility of executing the happy paths to guarantee 
the minimum viable product and the functionality of the module, as well as 
the same scenario can be executed but that performs the validations proposed 
in the technical test, generating a regression scenario strategy complemented with
the smoke testing technique.


Bugs Report URL
https://www.notion.so/Reporte-de-incidencias-161840c7ace28069b23be79feff0a1b6