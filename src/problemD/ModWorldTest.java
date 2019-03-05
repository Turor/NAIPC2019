package problemD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModWorldTest {

	@Test
	void test() {
		for(int q = 2; q < 168; q++)
			for(int p = 1;  p< q; p++) {
				
				for(int n = 1; n < q*4; n++) {
					assertEquals(ModWorld.correct(p, q, n),ModWorld.mySolution(p, q, n));
				}
				System.out.println();
			}
	}

}
