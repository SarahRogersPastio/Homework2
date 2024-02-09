package Homework2;

public class GroveTester {
    public static void main(String[] args){

        Grove grove = new Grove("Grove 1");
        grove.toString();

        for (int i = 0; i<7; i++){
            Tree spruce = new Tree(i, 37, "Spruce");
            grove.plantTree(spruce);
        }
        grove.toString();

        grove.uprootTree(3);
        grove.uprootTree(5);
        grove.toString();

        Tree maple = new Tree(7, 13, "Maple");
        grove.plantTree(maple);
        grove.toString();
    }
}
