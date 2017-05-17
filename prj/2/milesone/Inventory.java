/* Shantha Thangiah
 * Project demo - Milestone
 */

public class Inventory {

	public static int rtfTemp;
	public static int rtuTemp;
	public static int rtuTemp2;
	//public static int qtySum = rtfTemp+rtuTemp; 
	//public static int rtfQty;

	public static void main(String[] args){
		// 1st Array - RTU company inventory file. 
			String arrayRTU[][];
			arrayRTU = new String[3][3];
			
			arrayRTU[0][0]="SAVK40";		// Part Number
			arrayRTU[0][1]="95";			// Quantity
			arrayRTU[0][2]="CANOPY MOTOR";	// Description
			arrayRTU[1][0]="SAVK60";
			arrayRTU[1][1]= "79";
			arrayRTU[1][2]= "STOCKER MOTOR";
			arrayRTU[2][0]= "SAVK80";
			arrayRTU[2][1]= "38";
			arrayRTU[2][2]= "THICK WAFER GUIDE";
		// end of 1st Array (RTU)----------------
		
		// 2nd Array - RTU company special type inventory file.
			String arrayDEP[][];
			arrayDEP = new String[3][3];
			
			arrayDEP[0][0]="SAVK40";
			arrayDEP[1][0]="SAVK80";
			arrayDEP[2][0]="SAVK90";
		// end of 2nd Array (RTU Special)----------------------

		// 3rd Array - RTF (HQ) company inventory file.
		String arrayRTF[][];
		arrayRTF = new String[6][3];
		
		arrayRTF[0][0]="SAVK10";
		arrayRTF[0][1]="57";
		arrayRTF[0][2]="";
		arrayRTF[1][0]="SAVK20";
		arrayRTF[1][1]= "97";
		arrayRTF[1][2]= "";
		arrayRTF[2][0]= "SAVK40";
		arrayRTF[2][1]= "37";
		arrayRTF[2][2]= "";
		arrayRTF[3][0]="SAVK60";
		arrayRTF[3][1]="57";
		arrayRTF[3][2]="";
		arrayRTF[4][0]="SAVK80";
		arrayRTF[4][1]= "97";
		arrayRTF[4][2]= "";
		arrayRTF[5][0]= "SAVK90";
		arrayRTF[5][1]= "37";
		arrayRTF[5][2]= "";
		// end of 3rd Array - RTF HQ--------------------

		// Column headings for the results display---------------
		System.out.println("P/N\tUS1\tUS2\tUS3\tFR1\tTOTAL");
		System.out.println("====\t====\t====\t====\t===\t=====");
		
		/* 1st FOR loop (Outer) - This allows to pick a Part Number 
		 * from the RTU (master file) holds it until searched from
		 * other two arrays. Then, it switches to next Part number.*/
		for (int counter = 0; counter < arrayRTU.length; counter++){ // LOOP#1
			int noMatch = 1; // This variable used as a switch for item found/not.
			
			/* 2nd FOR loop (1st inner) - This is to search picked part number
			 * from 1st loop and searches in the RTF array.
			 * If found carries, the value of quantity will carries for add qty.*/
			for (int rtfCount = 0; rtfCount < arrayRTF.length; rtfCount++){ // LOOP#2
				
				/* The IF statement tries to match a part number from
				 * the master file to every record in RTF array*/
				if (arrayRTU[counter][0] == arrayRTF[rtfCount][0]){
					/* when there is a match, the string value is parse to integer
					 * for calculation, then holds quantity value for that part number*/
					 Inventory.rtfTemp = Integer.parseInt(arrayRTF[rtfCount][1]);
				} //endif rtf part search
			} // end of loop#2 - RTF array search

			/* 3rd FOR loop (2nd inner) - This loop is to pick part numbers line-by-line
			 * in the master RTF file and check the special status in the DEP file/array.
			 * If matched, then the will display the quantity in different 
			 * inventory warehouse location */
			for (int depCount = 0; depCount < arrayDEP.length; depCount++){ // LOOP#3
				
				/* Matching if parts will fall under special category,
				 * it it will display the qty under different locations.*/
				if (arrayRTU[counter][0] == arrayDEP[depCount][0]){
					
					/* If part numbers matched, then parse string to integer,
					 * and store the quantity values and calculate*/
					Inventory.rtuTemp = Integer.parseInt(arrayRTU[counter][1]);
					// adding the quantity on hand in different warehouses
					int qtySum = rtfTemp+rtuTemp;
					// Displays part number, quantity of each warehouse, and the totals
					System.out.println(arrayRTU[counter][0] 
							+ "\t\t" + rtuTemp + "\t\t" + rtfTemp + "\t" + qtySum);
					noMatch = 0; // this is to skip next process and go back to loop until EO
				} // endif DEP array search 
			} // end of loop#3 - DEP array search

			/* This IF statement looking for noMatch variable original value.
			 * This means no matches found on RTF and/or DEP arrays.
			 * Thus no modification took place, and it prints master file data*/
			if (noMatch == 1) {
				rtuTemp2 = Integer.parseInt(arrayRTU[counter][1]);
				int qtySum = rtuTemp2+rtfTemp;
				System.out.println(arrayRTU[counter][0] + "\t" + rtuTemp2 + "\t\t\t" + rtfTemp + "\t" + qtySum);
			} // endif noMatch
		} // end of loop#1
	} // end of main
} // end of TwodArrays
