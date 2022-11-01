# skyhive-springboot-interview
This is a simple repository that has instructions for creating a program to be reviewed by SkyHive staff

## Instructions
1. Clone this repository (only contains README)
2. Use the SpringBoot initializer to create an application using Gradle / Java / Spring 2.7.5
3. Add SpringWeb and SpringHATEOAS
4. Create a controller which takes the following sentence as 'input':  "The quick brown fox jumps over the lazy dog" and returns a JSON object containing two fields, 'input' and 'output' where output is the sentence in reverse word order, i.e., 

```
{ input: 'One two three', output: 'three two One' }
```

5. The controller method should be POST
6. Write a JUnit test to excercise the controller.
7. Application should be executable and tested.
8. When complete, check your code into the repsotory and send the link to your repository

#### Extra Credit: add a DELETE controller that does nothing, then add the HATEOAS to the POST response above 
