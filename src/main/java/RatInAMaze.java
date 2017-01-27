/**
 * http://algorithms.tutorialhorizon.com/backtracking-rat-in-a-maze-puzzle/
 */
public class RatInAMaze {
    
    private int[][] solution;
    
    public RatInAMaze(int n) {
        solution = new int[n][n];
        //initialize the solution to zero matrix
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                solution[i][j] =0 ;
            }
        }
    }
    
    public void solveMaze(int[][] maze, int n) {
        printSolution(maze,n);
        System.out.println("----------------------------------");
        if(findPath(maze, 0, 0, n , "down" )) {
            printSolution(solution, n);
        } else {
            System.out.println("No path found");
        }
        
    }
    
    //recursive program
    public boolean findPath(int[][] maze, int x, int y, int n, String direction) {
        if(x == n-1 && y == n-1) { //we have reached the destination
            solution[x][y] = 1;
            return true;
        }
        
        if(isSafeToGo(maze, x, y, n)) {
            solution[x][y] = 1;
            
            //now check the next directions
            
            if(direction != "up" && findPath(maze, x+1, y, n, "down")) {
                return true;
            }
            
            if(direction!= "left" && findPath(maze, x, y+1, n, "right")) {
                return true;
            }
            
            if(direction != "down" && findPath(maze, x-1 , y, n, "up")) {
                return true;
            }
            
            if(direction != "right" && findPath(maze, x, y-1, n, "left")) {
                return true;
            }
            
            
            
            solution[x][y] = 0;
            
            return false;
        }
        
        return false;
        
    }
    
    //validate whether the next upcoming cell is safe to step into.
    public boolean isSafeToGo(int[][] maze, int x, int y, int n) {
        if(x >= 0 && y >= 0 && x < n  && y < n && maze[x][y] != 0) {
            return true;
        }
        return false;
    }
    
    
    public void printSolution(int[][] solution, int n) {
        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                //solution[i][j] =0 ;
                
                System.out.print(" " + solution[i][j]);
            }
            System.out.print("\n");
            
        }
    }
}
