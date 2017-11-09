package game;

public class Character {
    
    String id;
    int str;
    int dex;
    int in;
    int rux;
    int job;
    
    
    @Override
    public String toString() {
        return "Character [id=" + id + ", str=" + str + ", dex=" + dex + ", in=" + in + ", rux=" + rux + "]";
    }


    Character(){
        this.str = 5;
        this.dex = 5;
        this.in = 5;
        this.rux = 5;
                
    }
    

}
