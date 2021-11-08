package domains.puzzle;

import framework.problem.Mover;
import framework.problem.State;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Your name here
 */

public class PuzzleMoverTest {
        
    /**
     * Declare private instance fields here. For example:
     */
    
    private final State start;
    private final Mover mover;
    private final String slide1, slide2, slide3, slide4,  // move names
	                 slide5, slide6, slide7, slide8;
    
    public PuzzleMoverTest() {
        
        
        
        start = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        mover = new PuzzleMover();
        
        moveNames = mover.getMoveNames();
        
        slide1 = moveNames.get(0);
        slide2 = moveNames.get(1);
        slide3 = moveNames.get(2);
        slide4 = moveNames.get(3);
        slide5 = moveNames.get(4);
        slide6 = moveNames.get(5);
        slide7 = moveNames.get(6);
        slide8 = moveNames.get(7);
        
        
    } 
    
    /**
     * Test all moves in the methods below by replacing the calls to fail.
     */

    @Test
    public void testSlide1() {
        /**
         * For example, if mover, start, and slide1 have been
         * initialized, call:
         *
         *     mover.doMove(slide1, start)
         *
         * and test the result with assertions.
         */
        PuzzleState test1 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        assertTrue(test1.equals(mover.doMove(slide1, start)));
        
        PuzzleState test2 = new PuzzleState(
                new int[][]{new int[]{2, 1, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        PuzzleState test3 = new PuzzleState(
                new int[][]{new int[]{2, 0, 3}, 
                            new int[]{8, 1, 4}, 
                            new int[]{7, 6, 5}});
        
        assertTrue(test3.equals(mover.doMove(slide1, test2)));
        
        assertFalse(test1.equals(mover.doMove(slide1, test3)));
        
    }

    @Test
    public void testSlide2() {
        PuzzleState test1 = new PuzzleState(
                new int[][]{new int[]{1, 0, 3}, 
                            new int[]{8, 2, 4}, 
                            new int[]{7, 6, 5}});
        
        assertTrue(test1.equals(mover.doMove(slide2, start)));
        
        PuzzleState test2 = new PuzzleState(
                new int[][]{new int[]{2, 1, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        PuzzleState test3 = new PuzzleState(
                new int[][]{new int[]{2, 0, 3}, 
                            new int[]{8, 1, 4}, 
                            new int[]{7, 6, 5}});
        
        assertTrue(test2.equals(mover.doMove(slide2, test2)));
        
        assertFalse(test1.equals(mover.doMove(slide2, test3)));        
    }

    @Test
    public void testSlide3() {
        
        assertTrue(start.equals(mover.doMove(slide3, start)));
        
        PuzzleState test2 = new PuzzleState(
                new int[][]{new int[]{2, 1, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        PuzzleState test3 = new PuzzleState(
                new int[][]{new int[]{2, 0, 3}, 
                            new int[]{8, 1, 4}, 
                            new int[]{7, 6, 5}});
        
        PuzzleState test1 = new PuzzleState(
                new int[][]{new int[]{2, 3, 0}, 
                            new int[]{8, 1, 4}, 
                            new int[]{7, 6, 5}});
        
        assertTrue(test1.equals(mover.doMove(slide3, test3)));
        
        assertFalse(test3.equals(mover.doMove(slide3, test3)));      
    }

    @Test
    public void testSlide4() {
        PuzzleState test1 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        PuzzleState test2 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 4, 0}, 
                            new int[]{7, 6, 5}});
        
        assertTrue(test2.equals(mover.doMove(slide4, test1)));
        
        PuzzleState test3 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        
        
        assertTrue(test2.equals(mover.doMove(slide4, test3)));
        
       assertFalse(test1.equals(mover.doMove(slide4, test3)));        
    }

    @Test
    public void testSlide5() {
        PuzzleState test1 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        PuzzleState test2 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 4, 0}, 
                            new int[]{7, 6, 5}});
        
        
        PuzzleState test3 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 4, 5}, 
                            new int[]{7, 6, 0}});
        
        
        
        assertTrue(start.equals(mover.doMove(slide5, test1)));
        assertTrue(test3.equals(mover.doMove(slide5, test2)));
        assertFalse(test3.equals(mover.doMove(slide5, test1)));
    }

    @Test
    public void testSlide6() {
        PuzzleState test1 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 6, 4}, 
                            new int[]{7, 0, 5}});
        
        PuzzleState test2 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        
        PuzzleState test3 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        
        
        assertTrue(start.equals(mover.doMove(slide6, test1)));
        assertTrue(test1.equals(mover.doMove(slide6, test2)));
        assertFalse(test2.equals(mover.doMove(slide6, test2)));        
    }

    @Test
    public void testSlide7() {
        PuzzleState test1 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 6, 4}, 
                            new int[]{7, 0, 5}});
        
        PuzzleState test2 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 6, 4}, 
                            new int[]{0, 7, 5}});
        
        
        PuzzleState test3 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        
        
        assertTrue(test2.equals(mover.doMove(slide7, test1)));
        assertTrue(test1.equals(mover.doMove(slide7, test2)));
        assertFalse(test2.equals(mover.doMove(slide7, test2)));        
    }

    @Test
    public void testSlide8() {
        PuzzleState test1 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{8, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        PuzzleState test2 = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, 
                            new int[]{0, 8, 4}, 
                            new int[]{7, 6, 5}});
        
        
        PuzzleState test3 = new PuzzleState(
                new int[][]{new int[]{8, 2, 3}, 
                            new int[]{1, 0, 4}, 
                            new int[]{7, 6, 5}});
        
        
        
        assertTrue(test2.equals(mover.doMove(slide8, test1)));
        assertTrue(test3.equals(mover.doMove(slide8, test3)));
        assertFalse(test2.equals(mover.doMove(slide8, test2)));       
    }
    
    private final List<String> moveNames;
    
}