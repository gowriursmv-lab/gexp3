package com.example.maven_github_demo1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class GradecalcTest {
@Test	
void testTotal() {
	assertEquals(225,Gradecalc.calculateTotal(75,68,82));
}
@Test
void testAverage() {
	assertEquals(75.0,Gradecalc.calculateAverage(75,68,82));
}
@Test
void testPass() {
	assertTrue(Gradecalc.isPass(75.0));
}
@Test
void testFail() {
	assertFalse(Gradecalc.isPass(35.0));
}

}
