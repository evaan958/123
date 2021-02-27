//Evaan J 
//Feb 7
//Final project - The Game of Life

public class matrix {
    
    //Creating global objects so it can be refferencede in other classes
    public static matrix matrix = new matrix ();
    public static data data = new data ();
    public static gameGrid gameGrid = new gameGrid ();
    public static print print = new print ();
    public static end end = new end ();
    
    //Creating a global static boolean array and int so it can be refferenced in the main class and other methods
    public static boolean [][] cor1 = new boolean [0][0];
    public static int rowValue;
    public static int colValue;
    
    //Creating global ints so it can be refferenced in other methods
    int numValue;
    int genValue;
    int user;
    int rowUpdate;
    int colUpdate;
    public static int w = 0;
    int k = -1;
    
    public static void main(String [] args){

        //Creating an object for the different classes
        intro intro = new intro ();
        
        //Setting visibility of a gui to true so it can be seen by the user
        intro.setVisible(true);
        
    }
    
    public void create () {
        
        cor1 = new boolean [rowValue][colValue];
    }
    
}