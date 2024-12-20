package _CaesarsCypher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarChiperTest {
	
	private CaesarsCipher caesarCipher = new CaesarsCipher();

	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk", caesarCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 12));
	}
	
//	@Test
//	void testCipheredMessageWithOffsetOf11() {
//		assertEquals("tai mdq kag pauzs fapmk", caesarCipher.cipher("how are you doing today", 11));
//	}
	
}
