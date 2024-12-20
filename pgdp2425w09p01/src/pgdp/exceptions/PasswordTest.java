package pgdp.exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PasswordTest {

	@Test
	public void testPassword() {
		// Dieser Test ist nicht korrekt und zeigt nur, wie man assertThrows benutzt!
		assertThrows(Exception.class, () -> new Password(1, 1, 1, new char[] { 'x' }).checkFormat("aAx"));
	}
}
