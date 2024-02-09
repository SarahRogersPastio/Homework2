package Homework2;
public class Grove {
    public Tree[] trees;
    public String groveName;

    public Grove(String name){
        this.trees = new Tree[12]; //check for other ways to set array
        this.groveName = name;
    }

    public int plantTree(Tree t){
        for (int i = 0; i < 12; i++){ 
            if (trees[i] == null){ 
                this.trees[i] = t;
                return i;
            }
        }
        return -1;
    }

    public Tree uprootTree(int i){
        Tree t = this.trees[i];
        this.trees[i] = null;
        return t;
    }

    public String toString(){
        int numTrees = 0;
        for (int i = 0; i < 12; i++){
            if (trees[i] != null){
                numTrees ++;
            }
        }
        System.out.println(numTrees);
        return "";
    }
}
