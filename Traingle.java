package codeChallengecom.codechallange;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangle {
	 public int maxSum(int triangle[][]) 
	    { int m = triangle[0].length;
		  int n = triangle.length;
	        for (int i = m - 1; i >= 0; i--) 
	        { 
	            for (int j = 0; j <= i; j++) 
	            {  
	                if (triangle[i + 1][j] > triangle[i + 1][j + 1]) 
	                    triangle[i][j] += triangle[i + 1][j]; 
	                else
	                    triangle[i][j] += triangle[i + 1][j + 1]; 
	            } 
	        } 
	      
	
	        return triangle[0][0]; 
	    } 
	 public int TriangleInput() {
		 int totalRow = 100;
			char[][] myArray = new char[totalRow][];
			File file = new File("inputTriangle.txt");
			Scanner scanner;
			try {
				scanner = new Scanner(file);
				for (int row = 0; scanner.hasNextLine() && row < totalRow; row++) {
					myArray[row] = scanner.nextLine().toCharArray();
				}
				for(int j=0;j<myArray.length;j++) {
					for(int k=0;k<myArray[j].length;k++) {
						
					}
				}
				return maxSum(myArray);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
//	public static void main(String[] args) {
//		
//
//	}

}
