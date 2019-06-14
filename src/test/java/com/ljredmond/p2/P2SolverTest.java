package com.ljredmond.p2;

import org.junit.Test;

import static org.junit.Assert.*;

public class P2SolverTest {

    private final P2Solver p2Solver = new P2Solver();

    @Test
    public void test() {
        assertEquals(4613732L, p2Solver.solve(4000000L));
    }
}