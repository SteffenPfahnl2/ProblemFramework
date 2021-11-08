/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.problem.Mover;
import framework.problem.State;

/**
 *
 * @author Steffen Pfahnl
 * 
 */
public class FarmerMover extends Mover {
    
    public static final String ALONE = "Farmer Goes Alone";
    public static final String WOLF = "Farmer Takes Wolf";
    public static final String GOAT = "Farmer Takes Goat";
    public static final String CABBAGE = "Farmer Takes Cabbage";
    
        
    public FarmerMover() {
        super.addMove(ALONE, s -> goAlone(s));
        super.addMove(WOLF, s -> takesWolf(s));
        super.addMove(GOAT, s -> takesGoat(s));
        super.addMove(CABBAGE, s -> takesCabbage(s));
        }
    
    
    private State goAlone(State state) {
        FarmerState s = (FarmerState) state;
        
        if(s.getGoat() == s.getWolf()) {
            return null;
        } else if(s.getGoat() == s.getCabbage()) {
            return null;
        }
        
        if(s.getFarmer() == "West") {
            s = new FarmerState("East", s.getWolf(), s.getGoat(), s.getCabbage());
        } else if(s.getFarmer() == "East") {
            s = new FarmerState("West", s.getWolf(), s.getGoat(), s.getCabbage());
        }
        return s;
    }
    
    private State takesWolf(State state) {
        FarmerState s = (FarmerState) state;
        
        if(s.getFarmer() != s.getWolf()) {
            return null;
        } else if(s.getCabbage() == s.getGoat()) {
            return null;
        }
        
        if(s.getFarmer() == "West" && s.getWolf() == "West") {
            s = new FarmerState("East", "East", s.getGoat(), s.getCabbage());
        } else if(s.getFarmer() == "East" && s.getWolf() == "East") {
            s = new FarmerState("West", "West", s.getGoat(), s.getCabbage());
        }
        
        System.out.println(s.getFarmer() + s.getWolf() + s.getGoat() + s.getCabbage());
        return s;
    }
    
    private State takesGoat(State state) {
        FarmerState s = (FarmerState) state;
        
        if(s.getFarmer() != s.getGoat()) {
            return null;
        } 
        
        if(s.getFarmer() == "West" && s.getGoat() == "West") {
            s = new FarmerState("East", s.getWolf(), "East", s.getCabbage());
        } else if(s.getFarmer() == "East" && s.getGoat() == "East") {
            s = new FarmerState("West", s.getWolf(), "West", s.getCabbage());
        }
        return s;
    }
    
    private State takesCabbage(State state) {
        FarmerState s = (FarmerState) state;
        
        if(s.getFarmer() != s.getCabbage()) {
            return null;
        } else if(s.getWolf() == s.getGoat()) {
            return null;
        }
        
        if(s.getFarmer() == "West" && s.getCabbage() == "West") {
            s = new FarmerState("East", s.getWolf(), s.getGoat(), "East");
        } else if(s.getFarmer() == "East" && s.getCabbage() == "East") {
            s = new FarmerState("West", s.getWolf(), s.getGoat(), "West");
        }
        return s;
    }
    
}
