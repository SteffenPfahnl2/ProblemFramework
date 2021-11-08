package domains.puzzle;

import framework.problem.Mover;
import framework.problem.State;

/**
 * This class is the mover for ArithmeticMover. It simply does the basic
 * operations, add 3, subtract 5, multiply by 2, or divide by 2.
 * @author Steffen Pfahnl
 */
public class PuzzleMover extends Mover {
    
        public static final String SLIDE1 = "SLIDE TILE 1";
        public static final String SLIDE2 = "SLIDE TILE 2";
        public static final String SLIDE3 = "SLIDE TILE 3";
        public static final String SLIDE4 = "SLIDE TILE 4";
        public static final String SLIDE5 = "SLIDE TILE 5";
        public static final String SLIDE6 = "SLIDE TILE 6";
        public static final String SLIDE7 = "SLIDE TILE 7";
        public static final String SLIDE8 = "SLIDE TILE 8";
    
        
        public PuzzleMover() {
            super.addMove(SLIDE1, s -> slide1(s));
            super.addMove(SLIDE2, s -> slide2(s));
            super.addMove(SLIDE3, s -> slide3(s));
            super.addMove(SLIDE4, s -> slide4(s));
            super.addMove(SLIDE5, s -> slide5(s));
            super.addMove(SLIDE6, s -> slide6(s));
            super.addMove(SLIDE7, s -> slide7(s));
            super.addMove(SLIDE8, s -> slide8(s));
        }
        
        /*
        *@param Sends in a state.
        *@return Returns an ArithmeticState of the value state+3.
        */
        
        // breaker
        
        private State slide1(State state) {
            PuzzleState s = (PuzzleState) state;
            
            if(s.getLocation(1).getColumn() == s.getLocation(0).getColumn()) {
                if(s.getLocation(1).getRow()+1 == s.getLocation(0).getRow() || s.getLocation(1).getRow()-1 == s.getLocation(0).getRow()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(1));
                    
                }
                
            }
            
            if(s.getLocation(1).getRow() == s.getLocation(0).getRow()) {
                if(s.getLocation(1).getColumn()+1 == s.getLocation(0).getColumn() || s.getLocation(1).getColumn()-1 == s.getLocation(0).getColumn()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(1));
                    
                }
                
            }
            
            
            return null;
        }

        // breaker
        
        
         private State slide2(State state) {
            PuzzleState s = (PuzzleState) state;
            
            if(s.getLocation(2).getColumn() == s.getLocation(0).getColumn()) {
                if(s.getLocation(2).getRow()+1 == s.getLocation(0).getRow() || s.getLocation(2).getRow()-1 == s.getLocation(0).getRow()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(2));
                    
                }
                
            }
            
            if(s.getLocation(2).getRow() == s.getLocation(0).getRow()) {
                if(s.getLocation(2).getColumn()+1 == s.getLocation(0).getColumn() || s.getLocation(2).getColumn()-1 == s.getLocation(0).getColumn()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(2));
                    
                }
                
            }
            
            return null;
        }
 
         // breaker
         
         
          private State slide3(State state) {
            PuzzleState s = (PuzzleState) state;
            
            if(s.getLocation(3).getColumn() == s.getLocation(0).getColumn()) {
                if(s.getLocation(3).getRow()+1 == s.getLocation(0).getRow() || s.getLocation(3).getRow()-1 == s.getLocation(0).getRow()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(3));
                    
                }
                
            }
            
            if(s.getLocation(3).getRow() == s.getLocation(0).getRow()) {
                if(s.getLocation(3).getColumn()+1 == s.getLocation(0).getColumn() || s.getLocation(3).getColumn()-1 == s.getLocation(0).getColumn()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(3));
                    
                }
                
            }
            
            return null;
        }
          
          
          // breaker
          
          
           private State slide4(State state) {
               PuzzleState s = (PuzzleState) state;
            if(s.getLocation(4).getColumn() == s.getLocation(0).getColumn()) {
                if(s.getLocation(4).getRow()+1 == s.getLocation(0).getRow() || s.getLocation(4).getRow()-1 == s.getLocation(0).getRow()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(4));
                    
                }
                
            }
            
            if(s.getLocation(4).getRow() == s.getLocation(0).getRow()) {
                if(s.getLocation(4).getColumn()+1 == s.getLocation(0).getColumn() || s.getLocation(4).getColumn()-1 == s.getLocation(0).getColumn()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(4));
                    
                }
                
            }
            return null;
        }
           
           // breaker
           
           
            private State slide5(State state) {
               PuzzleState s = (PuzzleState) state;
            if(s.getLocation(5).getColumn() == s.getLocation(0).getColumn()) {
                if(s.getLocation(5).getRow()+1 == s.getLocation(0).getRow() || s.getLocation(5).getRow()-1 == s.getLocation(0).getRow()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(5));
                    
                }
                
            }
            
            if(s.getLocation(5).getRow() == s.getLocation(0).getRow()) {
                if(s.getLocation(5).getColumn()+1 == s.getLocation(0).getColumn() || s.getLocation(5).getColumn()-1 == s.getLocation(0).getColumn()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(5));
                    
                }
                
            }
            return null;
        }
            
            
            // breaker
            
             private State slide6(State state) {
               PuzzleState s = (PuzzleState) state;
            if(s.getLocation(6).getColumn() == s.getLocation(0).getColumn()) {
                if(s.getLocation(6).getRow()+1 == s.getLocation(0).getRow() || s.getLocation(6).getRow()-1 == s.getLocation(0).getRow()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(6));
                    
                }
                
            }
            
            if(s.getLocation(6).getRow() == s.getLocation(0).getRow()) {
                if(s.getLocation(6).getColumn()+1 == s.getLocation(0).getColumn() || s.getLocation(6).getColumn()-1 == s.getLocation(0).getColumn()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(6));
                    
                }
                
            }
            return null;
        }
             
             // breaker
             
              private State slide7(State state) {
               PuzzleState s = (PuzzleState) state;
            if(s.getLocation(7).getColumn() == s.getLocation(0).getColumn()) {
                if(s.getLocation(7).getRow()+1 == s.getLocation(0).getRow() || s.getLocation(7).getRow()-1 == s.getLocation(0).getRow()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(7));
                    
                }
                
            }
            
            if(s.getLocation(7).getRow() == s.getLocation(0).getRow()) {
                if(s.getLocation(7).getColumn()+1 == s.getLocation(0).getColumn() || s.getLocation(7).getColumn()-1 == s.getLocation(0).getColumn()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(7));
                    
                }
                
            }
            return null;
        }
              
              
              // breaker
              
              
            private State slide8(State state) {
               PuzzleState s = (PuzzleState) state;
            if(s.getLocation(8).getColumn() == s.getLocation(0).getColumn()) {
                if(s.getLocation(8).getRow()+1 == s.getLocation(0).getRow() || s.getLocation(8).getRow()-1 == s.getLocation(0).getRow()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(8));
                    
                }
                
            }
            
            if(s.getLocation(8).getRow() == s.getLocation(0).getRow()) {
                if(s.getLocation(8).getColumn()+1 == s.getLocation(0).getColumn() || s.getLocation(8).getColumn()-1 == s.getLocation(0).getColumn()) {
                
                    return new PuzzleState(s, s.getLocation(0), s.getLocation(8));
                    
                }
                
            }
            return null;
        }

}
