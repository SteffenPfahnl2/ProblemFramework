package domains.arithmetic;

import framework.problem.Mover;
import framework.problem.State;

/**
 * This class is the mover for ArithmeticMover. It simply does the basic
 * operations, add 3, subtract 5, multiply by 2, or divide by 2.
 * @author Steffen Pfahnl
 */
public class ArithmeticMover extends Mover {
    
        public static final String ADD = "Add 3";
        public static final String SUB = "Subtract 5";
        public static final String MULT = "Multiply by 2";
        public static final String DIV = "Divide by 2";
    
        
        public ArithmeticMover() {
            super.addMove(ADD, s -> add(s));
            super.addMove(SUB, s -> subtract(s));
            super.addMove(MULT, s -> multiply(s));
            super.addMove(DIV, s -> divide(s));
        }
        
        /*
        *@param Sends in a state.
        *@return Returns an ArithmeticState of the value state+3.
        */
        private State add(State state) {
            ArithmeticState s = (ArithmeticState) state;
            return new ArithmeticState(s.getValue()+3);
        }

        /*
        *@param Sends in a state.
        *@return Returns an ArithmeticState of the value state-5.
        */
        private State subtract(State state) {
            ArithmeticState s = (ArithmeticState) state;
            return new ArithmeticState(s.getValue()-5);
        }
        
        /*
        *@param Sends in a state.
        *@return Returns an ArithmeticState of the value state*2.
        */
        private State multiply(State state) {
            ArithmeticState s = (ArithmeticState) state;
            return new ArithmeticState(s.getValue()*2);
        }
        
        /*
        *@param Sends in a state.
        *@return Returns an ArithmeticState of the value state/2.
        */
        private State divide(State state) {
            ArithmeticState s = (ArithmeticState) state;
            return new ArithmeticState(s.getValue()/2);
        }
}
