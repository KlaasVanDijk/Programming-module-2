package hotel;


public class Safe {
	public int safenubmer;
	public Password password;
	boolean safeActivated = false;
	boolean safeOpened = false;
	
	
	public Safe(int safenumber, String password) {
		this.safenubmer = safenumber;
	
	}

	public void activate(String givenPassword) {
		if (password.testWord(givenPassword)) {
			safeActivated = true;
		}
	}

	public void deactivates() {
		safeActivated = false;
	}

	
	public void open(String givenPassword) {
		if (password.testWord(givenPassword)) {
			safeOpened = true;
		}
	}

	
	public void close() {
		safeOpened = false;
	}

	public boolean isActive() {
    return safeActivated;
	}

	public boolean isOpen() {
		return safeOpened;
	}

	public String getPassword() {
		return password.getPassword();
	}
}
