package com.ljredmond.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1SolverTest {

    private final P1Solver p1Solver = new P1Solver();

    @Test
    public void test() {
        assertEquals(233168, p1Solver.solve(1000));
    }
}