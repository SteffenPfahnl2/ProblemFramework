/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.problem.State;
import java.util.Objects;
/**
 *
 * @author Steffen Pfahnl
 * 
 */
public class FarmerState extends State {
    
    public FarmerState(String farmer, String wolf, String goat, String cabbage) {
    
        this.farmer = farmer;
        this.wolf = wolf;
        this.goat = goat;
        this.cabbage = cabbage;
        
    }
    
    @Override
    public String toString() {
        String var = "    |  |    \n";
        if(farmer == "West") {
            var = var + " F  |  |    \n";
        } else {
            var = var + "    |  |  F \n";
        }
        
        if(wolf == "West") {
            var = var + " W  |  |    \n";
        } else {
            var = var + "    |  |  W \n";
        }
        
        if(goat == "West") {
            var = var + " G  |  |    \n";
        } else {
            var = var + "    |  |  G \n";
        }
        
        if(cabbage == "West") {
            var = var + " C  |  |    \n";
        } else {
            var = var + "    |  |  C \n";
        }
        
        var = var + "    |  |    ";
        return var;
                
    }
    
    // GETTER METHODS START HERE
    
    public String getFarmer() {
        return farmer;
    }
    
    public String getWolf() {
        return wolf;
    }
    
    public String getGoat() {
        return goat;
    }
    
    public String getCabbage() {
        return cabbage;
    }
    
    // GETTER METHODS END HERE
    
    @Override
    public boolean equals(Object other) {
        
        if(other == null) {
            return false;
        }
        FarmerState otherState = (FarmerState) other;
        if(this.farmer != otherState.getFarmer()) {
            return false;
        } else if(this.wolf != otherState.getWolf()) {
            return false;
        } else if(this.goat != otherState.getGoat()) {
            return false;
        } else if(this.cabbage != otherState.getCabbage()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.farmer);
        hash = 67 * hash + Objects.hashCode(this.wolf);
        hash = 67 * hash + Objects.hashCode(this.goat);
        hash = 67 * hash + Objects.hashCode(this.cabbage);
        return hash;
    }
    
    
    
    
    
    private String farmer;
    private String wolf;
    private String goat;
    private String cabbage;
    
}
