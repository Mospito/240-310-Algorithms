
// MazeSearcher.java
// Andrew Davison, ad@fivedots.coe.psu.ac.th, Jan 2021
/* 
   Usage:
      java MazeSearcher maze1.txt    (maze2.txt)
*/


import java.io.*;
import java.util.*;


public class MazeSearcher 
{
  private static final int[][] STEPS = 
          { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };  // (dx, dy)
         //  DOWN    RIGHT    UP      LEFT


  public MazeSearcher(Maze maze) 
  {
    ArrayList<Coord> path = new ArrayList<>();
    Coord entry = maze.getStart();
    if (explore(maze, entry.getX(), entry.getY(), path)) {
       maze.printPath(path);
    }
    else
      System.out.println("No path found");
  }  // end of MazeSearcher()



  private boolean explore(Maze maze, int x, int y,
                                   ArrayList<Coord> path) 
  {
    // Students: put your code here
    return false;
  }  // end of explore()


  // Students: you can add other functions if you wish





  // --------------------------------------------


  public static void main(String[] args) throws Exception 
  {
    if (args.length != 1)
      System.out.println("Usage: java MazeSearcher <maze textfile>");
    else {
      Maze maze = new Maze( new File(args[0])); 
      MazeSearcher dfs = new MazeSearcher(maze);
    }
  }

}  // end of MazeSearcher class
