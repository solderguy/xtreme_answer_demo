package com.pair.jsoper;

import java.util.Arrays;

enum InventoryManager {
    INSTANCE;
    private String[] lossLeaders =
        { "Led Flashlights", "Multitools" };
    public void printLossLeaders() {
        System.out.println(Arrays.toString(lossLeaders));
    }
}

public class Q04_Singletons {
	public static void main(String[] args) {
		InventoryManager.INSTANCE.printLossLeaders();
	}
}
