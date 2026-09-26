package BackTracking;

public class rat_maze {
    public static boolean solve(int[][] maze,int row,int col,boolean[][] visited){

        if (row == maze.length - 1 &&
                col == maze[0].length - 1) {
            return true;
        }
        if(row<0||col<0||row>maze.length-1||col>maze[0].length-1||maze[row][col]==0||visited[row][col]){
            return false;
        }

        visited[row][col]=true;
        if(solve(maze,row+1,col,visited)||solve(maze,row,col+1,visited)||solve(maze,row-1,col,visited)||solve(maze,row,col-1,visited)){
            return true;
        }
        visited[row][col]=false;
        return false;




    }
    public static void main(String[] args) {
int[][] maze={
        {1,0,0},
        {1,1,0},
        {0,0,0}
};
boolean[][] visited={
        {false,false,false},
        {false,false,false},
        {false,false,false}
};
int row=0;
int col=0;
        System.out.println(solve(maze,row,col,visited));
    }
}
