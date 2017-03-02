import java.util.ArrayList;
import java.util.List;

public class Servers {
    //variables
    private int serverNum;
    private double tip = 0.0;

    //constructor
    public Servers(int serverNum) {
        this.serverNum = serverNum;
    }
    
    //assign servers to tables
    public void assignToTable(Table table) {
        table.setServer(this);
    }

    //getters
    public int getServerNum() {return serverNum;}
    public double getTip() {return tip;}

    //add to tip
    public void addTip(double tip) {this.tip += tip;}

    @Override
    public String toString() {
        return "Server " + (getServerNum() + 1) + " is currently working.";
    }
}