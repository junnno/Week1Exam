import org.junit.Test;

import com.oocl.group3.ExerciseWithTest.Exercise;

import junit.framework.TestCase;


public class TestExercise extends TestCase {
	Exercise exer = new Exercise();
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testExercise1(){
		assertEquals(13, exer.number1());
		//assertNotEquals(10, exer.number1());
	}
	
	@Test
	public void testExercise2(){
		assertEquals(8, exer.number2());
	}
	
	@Test
	public void testExercise3(){
		assertEquals(26, exer.number3());
	}
	
	@Test
	public void testExercise4(){
		assertEquals(4, exer.number4());
	}
	
	@Test
	public void testExercise5(){}
	
	@Test
	public void testExercise6(){}
	
	@Test
	public void testExercise7(){
		assertEquals(5, exer.number7(60));
	}
	
	@Test
	public void testExercise8(){}
	
	@Test
	public void testExercise9(){}
	
	@Test
	public void testExercise10a(){
		assertEquals(10.5, Exercise.number10a());
	}
	
	@Test
	public void testExercise10b(){}
	
	@Test
	public void testExercise10c(){}
	
	@Test
	public void testExercise10d(){}
	
	@Test
	public void testExercise10e(){}
}
