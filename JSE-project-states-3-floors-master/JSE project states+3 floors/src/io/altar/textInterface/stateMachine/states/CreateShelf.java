package io.altar.textInterface.stateMachine.states;

import java.util.ArrayList;

import io.altar.controller.Controller;
import io.altar.models.Product;
import io.altar.textInterface.stateMachine.scannerUtils.ScannerUtils;

public class CreateShelf implements State {
	public int execute() {
		double rentPrice1 = ScannerUtils.isADoubleBetweenMinimumAndMaximum("Please insert price:", 0.0, 1.7E308);
		String capacity = ScannerUtils.addNewString();
		String shouldThisShelfHaveAProduct = "yes";
		long productWhichIsInThisShelf = -2;

		System.out.println("Do you want to put a new product in this shelf?");
		shouldThisShelfHaveAProduct = ScannerUtils.addNewString();
		if (shouldThisShelfHaveAProduct.equals("yes")) {
			System.out.println("What product do you want to put in this shelf?");
			productWhichIsInThisShelf = ScannerUtils.isAValidProductNumber();
			

				
				
				
				
				
		if (rentPrice1 == -1 || discount1 == -1 || iva1 == -1
				|| (!shouldThisProductBeAddedToANewShelf.equals("no")
						&& shouldThisProductBeAddedToANewShelf.equals("yes"))
				|| shelfWhereTheProductIsAllocated == -1) {
			System.out.println("Error! Invalid input");
		} else {
			// Controller.updateShelfRepositoryAccordingToShelvesList(shelveslist1);
			Product product1 = new Product(shelveslist1, discount1, iva1, price1);
			Controller.addNewProductToProductRepository(product1);
		}
		return 0;
	}
}
