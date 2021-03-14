
// MazeSearcher.java
// Andrew Davison, ad@fivedots.coe.psu.ac.th, Jan 2021
/* 
   Usage:
      java MazeSearcher maze1.txt    (maze2.txt)
*/

//6135512026 Jaturon Moonjan
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



  private boolean explore(Maze maze, int x, int y,ArrayList<Coord> path) 
  {
    // Students: put your code here
    //6135512026 Jaturon Moonjan
    
    //If Exit stop now!!
    if(maze.isExit(x, y))  
    {
      return true;
    }

    //If Wall Don't Pass
    if(maze.isWall(x, y))
    {
      return false;
    }
    //If wasVisited Don't Go
    if(maze.wasVisited(x, y))
    {
      return false;
    }

    
    if(maze.isValidLoc(x, y))
    {
      //Set Visited Now!
      maze.setVisited(x, y);
      if(   explore(maze, x, y+1, path)  //Find Up
          ||explore(maze, x+1, y, path)  //Find Right
          ||explore(maze, x, y-1, path)  //Find Down
          ||explore(maze, x-1, y, path)) //Find Left
      {
        path.add(new Coord(x, y));
        return true;
      }
      else
        return false;
    }

    


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
