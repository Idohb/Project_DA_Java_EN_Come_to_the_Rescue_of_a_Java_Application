package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * <h1>Project Number 2 for OC</h1>
 * 
 * @author KHEK Bodivann
 * @version : 1.0.1
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		Map<String, Integer> countEstablished = analyticsCounter.counter(); // Analyse "symtoms.txt" file
		if (!countEstablished.isEmpty())
			analyticsCounter.outputFile(countEstablished); // Put all occurence in "result.out" file
		else
			System.out.println("The symtomps.txt file is empty, so result.out is not written");
	}
}