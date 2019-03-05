import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExamOneDynTests {

	@Test
	public void testDyn() {
		
		for(int i = 0; i < 100; i++)
			assertEquals(ExamOneDynamic.recSol(i), ExamOneDynamic.dynSol(i));
		
	}
	

}
