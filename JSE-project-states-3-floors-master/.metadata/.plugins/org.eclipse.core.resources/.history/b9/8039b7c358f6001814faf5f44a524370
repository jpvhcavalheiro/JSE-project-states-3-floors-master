package io.altar.textInterface.stateMachine.states;

public class InitialMenu implements State {
	@Override
	public int execute() {
		System.out.println("1)Show product menu");
		System.out.println("2)Show shelf menu");
		System.out.println("3)Quit");
		int [] validValues = {1,2,3};
		return scannerUtils.getValidIntFromScanner("Please choose one of the following options",validValues);
	}
}
