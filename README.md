# Scala_Assignment_Mukul-Dev

## Exercise 01
#### Setup Scala(2.11.7) (Run “scala -version” to verify).
Just download <i><b>scala.deb</b></i> and install it:
<pre>
sudo apt-get remove scala-library scala
wget http://www.scala-lang.org/files/archive/scala-2.11.7.deb
sudo dpkg -i scala-2.11.6.deb
sudo apt-get update
sudo apt-get install scala
</pre>
#### Setup sbt(0.13.9) (Run “sbt sbt-version” to verify).
    The simplest way of installing SBT on ubuntu is the deb package provided by Typesafe.
    Run the following shell commands:
<pre>
wget http://apt.typesafe.com/repo-deb-build-0002.deb
sudo dpkg -i repo-deb-build-0002.deb
sudo apt-get update
sudo apt-get install sbt
</pre>

#### Setup intellij IDE with scala mode and Get Hello World project working with Scala + Intellij.
<pre>
https://github.com/devmukul44/scala_assignment/blob/master/Installation_IntelliJ.pdf
</pre>
#### Go through Chapters 01-09 (and do the examples) from programming scala book.(Go through this as well: http://twitter.github.io/scala_school/ ) 

## Quiz 02
###### Why is Scala a functional programming language?
<pre>
Scala provides a large number of capabilities that are found only in functional programming languages. 
Scala permits you to code in functional style, and makes your life easier (than in Java) in a number of ways:

- There are first-class functions
- There is an immutable collections library
- Tail recursion is supported (to the extent that the JVM can manage)
- Pattern matching is supported Scala is a perfect choice if you want to explore the world of functional programming without completely disregarding object oriented programming.
</pre>

###### What is the difference between val and var?
    object assigned to a val cannot be replaced (immutable) and var can be replaced (mutable)
###### What is an "Object" in Scala?
###### What is an Application in Scala and how to define one?
###### What is the Unit return type? 

## Exercise 02
#### Build an Object called "Factorial" and write a method in it to compute the factorial of any integer from 1 until 100 (Note: the method must compute the factorial iteratively)
    - The program must be invoked from the command-line with the integer as a command-line parameter
    - The program must print a message and exit with a status of 1 when a command-line parameter is missing
    - The class must raise an "FactorialInputOutOfRange" Exception when the input is < 1 or > 100
    - Print the output using string interpolation
    - BONUS: Create a recursive version of the factorial method
<pre>
https://github.com/devmukul44/scala_assignment/blob/master/ex2.scala
</pre>
 
## Quiz 03
###### How to define a Class, fields, constructor, and methods?
###### What is an overridden method?
###### How to do operator overloading in Scala?
###### What are companion objects? What purpose do they serve?
###### What is the purpose of apply and unapply methods in companion objects? 

## Exercise 03
#### Write a class called "InnoString" that does the following:
    - A private string variable
    - A constructor that accepts a String value as input and sets it to the private variable
    - An overridden toString() method that returns the string
    - A concat method that concatenates a String to the private string variable
    - An overloaded '+' operator that has the same functionality as the concat method
    - An overloaded '==' operator that compares two InnoString objects for equivalence
    - An isPalindrome method that returns true if the private string variable is a palindrome
<pre>
https://github.com/devmukul44/scala_assignment/blob/master/ex3.scala
</pre>

## Quiz 04
###### What is SBT? How to create a brand new project in SBT from the CLI?
###### How to write your own basic build.sbt?
###### What do SBT tasks clean, compile and run do?
###### How would you import an existing SBT project as a new project in IntelliJ?
###### How would you run SBT tasks from within IntelliJ?

## Exercise 04
#### Convert the InnoString class from Exercise 02 in to a SBT project:
    - Create a new SBT project from the command line
    - Write your build.sbt file
    - Copy the code for InnoString class but put it in a package called "com.innovaccer":
    - Compile and run this from SBT in the command-line
    - In IntelliJ, import the SBT project created above and run it using SBT
<pre>
https://github.com/devmukul44/scala_assignment/blob/master/ex4.zip
</pre>

## Quiz 05
###### How does Scala implement Array and Map collections?
###### How would you open a file in Scala and read the contents?
###### How would you break out of a while loop or for loop in Scala?
###### What are traits? What is the Runnable trait? How would you use it? - How does Scala implement multi-threading with executors & thread pools?

## Exercise 05
#### Implement a multi-threaded Chat Server:
    - Create a brand new SBT project in IntelliJ
    - Add dependency (http://lihaoyi.github.io/upickle-pprint/pprint/) 
    - Create a Resource file called 'settings.txt' with these settings:
    - host=127.0.0.1
    - port=4000
    - Create a "com.innovaccer" package
    - Create a Chat Server class in the com.innovaccer package:
    - This should be multi-threaded
    - This should use a thread pool with ten threads
    - All chat messages must be printed on the server
    - All chat messages must be echoed on the originating client
    - All chat messages should be broadcast to all connected clients
    - This should use the thread name as the display handle for the client
    - Create a Main Object that:
    - Reads the settings.txt file
    - Creates a Map of the settings defined in the settings.txt file
    - Pretty print the Map using the Pretty Printer Dependency Class
    - Instantiates the chat server with the host and port in settings
    - Run a while (true) loop waiting for incoming chat client connections 
<pre>    
https://github.com/devmukul44/scala_assignment/tree/master/ex5/
</pre>
