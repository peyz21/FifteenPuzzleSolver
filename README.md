# FifteenPuzzleSolver (N-Puzzle Solver)
This Repository contains a experimental solver for fifteen-puzzle To be specific, the NxN sliding puzzle solver in JAVA written by my Partenr and Myself. The program uses a specific version of Kruskal Algorithm  mainly known by A* algorithm with 3 different heuristics to obtain the result. It uses Greedy version of the A* algorithm ( also known as Pure-Heurisitc) along side of different a combination of heuristics in order to achieve a realtively fast solution for a given board (aproxiamtely less than 30 seconds). The solver then produce a solution direction in a given format for each given board.

**Note 1**: This program does not focus on the optimality rather it focuses on more cases solved.

**Note 2**: The solution generated will have the form : (BoardPiece - Direction)

Example board1Soution.txt: 

![image](https://user-images.githubusercontent.com/64120482/235430169-eebded9f-471d-409a-9f2e-ce1e7e9e8e55.png)


**Note 3:** The application reads the boards from the "testcases" folder and writes the solution in the given boardName inside the "solutions" folder.

**Note 4:** I included 10 different test cases with various boars sizes less than 9x9, which will work optimally but feel free to add more under the "./testcases". 
Be aware that the bigger the board size gets, the longer this solution will take. ( best wroks within the range of 3-7)



![image](https://user-images.githubusercontent.com/64120482/235431919-dbcc2bda-ebc8-4181-8f4f-05aa9994e0ed.png)

**Step 1**: After downloading, Move to the src/fifteenpuzzle/Solver.java 
![image](https://user-images.githubusercontent.com/64120482/235432037-e1de1495-e6ed-4431-8bd7-8bd15a15ba8f.png)


**Step 2:** Scroll down to the main() method on line 420. 

**Step 3:** 
You can follow one of the 2 options in order to produce the board result:

**-3.1:**  Geneartion of the solution by passing parameters to the main while running through IDE:
The main method takes 1 variable an array of strings, more specifically  of size 2 file names: "Board Name", "Solution Board Name" and their relative path. 
follow the TYPE 1, which is uncommenting the lines 433-435 and commenting the lines 439-441, then in your IDE give the main() following parameters:
    
 ![image](https://user-images.githubusercontent.com/64120482/235429929-0b07eb07-3847-497a-b813-af5c20554e3e.png) 
     
 then run the application.
     
**-3.2:**  Manually editing the code: 
 Follow the TYPE 2, by changing the name and path of the board name in "Input" decleration and the solution board name in the "FileName" decleration:
     
 ![image](https://user-images.githubusercontent.com/64120482/235430632-2d3e4a71-81b9-468b-a03e-42b900c7ce94.png)
 
 then run the application.
 
 

     
