# Group-16 "CMPT 276"

## Game Name - Knight's Quest: The Goblin Heist !

### Instructor - Dr. Saba Alimadadi

### Group Members -  
Fanyi Luo (fla73@sfu.ca)  
Manya Sharma (msa261@sfu.ca)  
Pardeep Manhas (psmanhas@sfu.ca)  
William Dominic Desa (wdd1@sfu.ca)

### How to Play the Game - 
The objective of the game is to navigate the Knight through a labyrinthian map, avoiding dynamite barrels and goblins 
while you seek to recover your food from the fiends. You navigate the world through the following keys:

W = move up,  
A = move left,  
S = move down,  
D = move right,  
ESC = open the menu, which allows you to quit the game.  

Once you've collected all the meat present on the map, your goal is to return back to the home next to your starting 
position to win the game.

### How to Run the Game -

 Navigate your working directory to the Phase2 folder. Once inside, there are two ways to initialize the game that are 
 listed below.

#### 1) Run the Game Using an IDE
Open your favourite IDE, such as Intellij, and use it to navigate to the Main.java file found in the src folder. This 
can be found at: 

CMPT276S24_group16/Phase2/src/main/java/com/example/Main.java.

Click on the Main.java file, and use your IDE to run the Main file. A target folder will be built on your personal 
computer, and the game will begin running.

#### 2) Run the Game Using the Terminal:
Navigate to the Phase2 folder and make it your working directory. Then, using Maven and your terminal, input the 
following commands:
    
mvn clean package  
java -jar target/Main.jar
    
The first command cleans the Phase2 folder of its target directory and then rebuilds it, creating a Main.jar file. The 
second command executes it. After these commands, the game runs as normal.

### How to Test the Game:

The project provides two alternative methods to test the game. It utilizes JaCoco, JUnit, and Surefire to help test and 
visualize the branch/line coverages.

#### 1) Test the Game Through Maven:

There are two approaches to testing the game in Maven. The first is to change your terminal's working
directory to the Phase2 folder of the project. The second is to open the Phase2 folder in an IDE of your choosing, such
as IntelliJ. Once either method has been chosen, input the command:

"mvn clean package" 

into your computer's terminal (or your IDE's terminal). This will automatically run the tests for you. WARNING: This 
option will cause tests to create multiple game windows, all of which run the game. If you have concerns about system resource usage, it 
may be more beneficial to follow method two. Once  the tests have been completed, you can visualize the branch and line 
coverage by navigating to the target/site/jacoco/index.html file. Open the file in a browser of your choosing, and the 
branch and line coverage will be reported to you.


#### 2) Use IntelliJ to Visualize the Tests:

For this method, merely open Assignment 3 in IntelliJ. Navigate to the src/test/java folder, right-click it, and run the
folder with coverage. IntelliJ will then show the results of the test automatically on the right side of your screen, near
the maven tab. Tests can be run individually this way to avoid the action of having multiple game windows opening at once by navigating to them and running them with coverage as well,
should that be a concern.
