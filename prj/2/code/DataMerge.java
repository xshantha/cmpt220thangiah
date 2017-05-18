/* Shantha Thangiah
 * CMPT 220L - Java Final Project
 * DataMerge - A customized inventory manipulation software
 * Ver 3.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* read RTF inventory file */

public class DataMerge {

	public static int US01;
	public static int US02;
	public static int FR01;
	public static int TOTAL;
	
	public static void main(String[] args) {
		
		String fileRTU = "rtu_inv.csv";
		String fileRTF = "basebaan.csv";
		String fileDEP = "dep.csv";
		File file = new File(fileRTU); // read RTU File
		File file2 = new File(fileRTF); // read RTF File
		File file3 = new File(fileDEP); // read RTF File
		
		try {
			Scanner InputStream = new Scanner(file); // RTU
			Scanner InputStream2 = new Scanner(file2); // RTF
			Scanner InputStream3 = new Scanner(file3); // RTF
			InputStream.nextLine(); // ignore the first line RTU
			InputStream2.nextLine(); // ignore the first line RTF
			InputStream3.nextLine(); // ignore the first line DEP
			

			int countRTU; //RTU
			int countRTF; //RTF
			int countDEP; //DEP
			countRTU = 0; //RTU
			countRTF = 0; //RTF
			countDEP = 0;
			
			String arrayRTU[][];
			String arrayRTF[][];
			String arrayDEP[][];
			
			arrayRTU = new String[2520][3];
			arrayRTF = new String[58140][2];			
			arrayDEP = new String[914][2];
			
			//for (int count = 0; InputStream.hasNextLine(); count++){
			while (InputStream.hasNextLine()){
				String data = InputStream.nextLine(); // gets a whole line
				String[] valuesRTU = data.split(",");

				arrayRTU[countRTU][0]= valuesRTU[0]; // RTU array
				arrayRTU[countRTU][1]= valuesRTU[1];
				arrayRTU[countRTU][2]= valuesRTU[2];
			    //System.out.println(arrayRTU[countRTU][0] +","+ arrayRTU[countRTU][1]);
				countRTU = countRTU + 1;


			while (InputStream2.hasNextLine()){ // RTF while
				String data2 = InputStream2.nextLine(); // gets a whole line
				String[] valuesRTF = data2.split(",");
				
				arrayRTF[countRTF][0]= valuesRTF[0]; // RTF array
				arrayRTF[countRTF][1]= valuesRTF[1];
				//System.out.println(arrayRTF[countRTF][0] + ", "+ arrayRTF[countRTF][1] ); // test
				countRTF = countRTF + 1;
				
			while (InputStream3.hasNextLine()){ // RTF while
				String data3 = InputStream3.nextLine(); // gets a whole line
				String[] valuesDEP = data3.split(",");
					
				arrayDEP[countDEP][0]= valuesDEP[0]; // DEP array
				arrayDEP[countDEP][1]= valuesDEP[1];
				countDEP = countDEP + 1;
				
				//System.out.println(arrayRTF[countRTF][0] + ", "+ arrayRTF[countRTF][1] ); // test
				//countRTF = countRTF + 1;
				//countDEP = countDEP + 1;
			} // closing of RTF while
			} // closing of RTU while
			} // closing of DEP while
			//System.out.println(arrayRTU[2000][0] + " and " + arrayRTF[5000][0]); // test
			
			
			InputStream.close(); 
			InputStream2.close(); 			
			InputStream3.close(); 			
			
			System.out.printf("%17s %14s %11s %11s %11s \n", "PART NUMBER", "US1", "US2", "FR1", "TOTAL");
			//#1 loop
			for (int counter = 0; counter < arrayRTU.length; counter++){ // 1st For LOOP
				int noMatch = 1;
				// test System.out.println("LOOP # 1");
				//#2 loop
				for (int rtfCount = 0; rtfCount < arrayRTF.length; rtfCount++){ //2nd 
					//System.out.println("LOOP#2 " + arrayRTU[counter][0] + " ----> " + arrayRTF[rtfCount][0]);
					// test System.out.println("LOOP # 2");

					// Locating RTF values
					if (arrayRTU[counter][0].equals(arrayRTF[rtfCount][0])) {
						//System.out.println("LOOP#2 IF STATEMENT ------>" + arrayRTU[counter][0] +" " + arrayRTF[rtfCount][0]);
						//System.out.println(arrayRTU[counter][0] + "\t\t\t\t" + arrayRTF[rtfCount][1]);
						 TOTAL = Integer.parseInt(arrayRTF[rtfCount][1]);
						} //endif rtf
				}// 2nd loop - rtf
				// #3 loop
				for (int depCount = 0; depCount < arrayDEP.length; depCount++){ // # 3rd LOOP
					// System.out.println("LOOP # 3 " + arrayRTU[counter][0] + " " + arrayDEP[depCount][0]);
	
					// System.out.println("counter: " + counter + " depCounter: " + depCount );

					if (arrayRTU[counter][0].equals(arrayDEP[depCount][0])){
						//System.out.println(arrayRTU[counter][0] + " is depreciated");
						US02 = Integer.parseInt(arrayRTU[counter][1]);
						 FR01 = TOTAL-US02;
						System.out.printf("%-20s %3s %11s %7d %3s %7d %3s %7d %3s \n", arrayRTU[counter][0],"|","|", US02,"|", FR01,"|", TOTAL,"|");
						noMatch = 0;
					} // endif 
				} // 3rd loop	

				if (noMatch == 1) {
					//System.out.println(arrayRTU[counter][0] + "\t" + arrayRTU[counter][1]);
					US01 = Integer.parseInt(arrayRTU[counter][1]);
    				 FR01 = TOTAL-(US01+US02);

					System.out.printf("%-20s %3s %7d %3s %11s %7d %3s %7d %3s \n",arrayRTU[counter][0],"|", US01,"|", "|", FR01, "|", TOTAL, "|");
//before					System.out.printf("%-20s%8d%8d%8d\n",arrayRTU[counter][0] + "\t" + US01 + "\t\t\t" + FR01 + "\t" + TOTAL);

					noMatch = 0;
				} // endif noMatch
	
			} // end of 1st (outer) loop
			
		} catch (FileNotFoundException e){
			// todo auto-generated catch block
			e.printStackTrace();
		} // end of catch
    
  } // main

} // end of DataMerge
