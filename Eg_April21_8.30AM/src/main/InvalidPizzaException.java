package main;

public class InvalidPizzaException extends Exception {
	public InvalidPizzaException(String info) {
		super(info);
	}
}
