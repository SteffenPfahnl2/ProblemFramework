package framework.graph;
import framework.problem.*;
import java.util.List;
import java.util.Stack;

/**
 * @author Your name here
 */
public class GraphCreator {
    
    public Graph createGraphFor(Problem problem) {
        graph = new Graph();
        stack = new Stack();
        start = new Vertex(problem.getInitialState());
        stack.push(start);
        moveNames = problem.getMover().getMoveNames();
        
        while(stack.size() > 0) {
            u = (Vertex) stack.pop();
            
            for(String m : moveNames) {
                next = problem.getMover().doMove(m, (State)u.getData());
                
                if(next!=null) {
                    v = new Vertex(next);
                    if(graph.getVertices().containsKey(v)) {
                        v = graph.getVertices().get(v);
                    } else {
                        stack.push(v);
                    }
                    graph.addEdge(u, v);
                }
                
            }
            
        }
        
        return graph;
    }
    
    private Graph graph = null;
    private Stack stack;
    private Vertex start, u, v;
    private List<String> moveNames;
    private State next;
}