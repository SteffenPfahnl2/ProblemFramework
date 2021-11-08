package domains.arithmetic;

import framework.problem.State;

/**
 * This is the basic state setup for ArithmeticState. It simply
 * overrides the toString and equals method, and has a getter for the value.
 * @author Steffen Pfahnl
 */

public class ArithmeticState extends State{
    


 public ArithmeticState(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object other) {
            ArithmeticState otherState = (ArithmeticState) other;
            return this.value == otherState.value;
        }

        @Override
        public String toString() {
            return ("The value is: " + value);
        }
        
        public int getValue() {
            return value;
        }

        private final int value;

        private static final String NEW_LINE = "\n";
    }
