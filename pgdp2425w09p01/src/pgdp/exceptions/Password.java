package pgdp.exceptions;

import org.junit.jupiter.api.Test;

public class Password {
	private final int nrUpperShould, nrLowerShould, lengthShould;
	private final char[] illegalChars;

	private static boolean matchesIllegalCharacter(char[] illegalChars, char c) {
		for (char illegalChar : illegalChars)
			if (c == illegalChar) {
				return true;
			}
		return false;
	}

	public Password(int nrUpperShould, int nrLowerShould, int lengthShould, char[] illegalChars) {
		this.nrUpperShould = nrUpperShould;
		this.nrLowerShould = nrLowerShould;
		this.lengthShould = lengthShould;
		this.illegalChars = illegalChars;
	}

	public void checkFormat(String pwd) throws IllegalCharException, NotEnoughException{

		if (pwd.length() < lengthShould) {
			throw new NotLongEnoughException(lengthShould, pwd.length());
		}

		int nrLowerIs = 0;
		int nrUpperIs = 0;
		for (int i = 0; i < pwd.length(); i++) {
			// illegal character
			if (matchesIllegalCharacter(illegalChars, pwd.charAt(i))) {
				throw new IllegalCharException(pwd.charAt(i));
			}
			// lower case
			else if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') {
				nrLowerIs++;
			}
			// upper case
			else if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') {
				nrUpperIs++;
			}
		}

		if (nrUpperIs < nrUpperShould) {
			throw new NotEnoughUpperCaseException(nrUpperShould, nrUpperIs);
		}
		if (nrLowerIs < nrLowerShould) {
			throw new NotEnoughLowerCaseException(nrLowerShould, nrLowerIs);
		}


	}

	public void checkFormatWithLogging(String pwd) throws NotEnoughException, IllegalCharException {
		try {
			checkFormat(pwd);
		} catch (NotEnoughException | IllegalCharException exception){
			System.out.println(exception);
			throw exception;
		}
	}
}
