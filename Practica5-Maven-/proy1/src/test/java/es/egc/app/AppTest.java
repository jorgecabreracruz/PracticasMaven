package es.egc.app;


import org.junit.*;
import static org.junit.Assert.*;

import org.jgrapht.*;
import org.jgrapht.graph.*;


public class AppTest{

    

	@Test
    public void App()
    {
        assertTrue( true );
    }
	
	@Test
	public void createStringGraph()
    {
        UndirectedGraph<String, DefaultEdge> g = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
		assertNotNull(g);
        assertTrue(true);

		
}
}
