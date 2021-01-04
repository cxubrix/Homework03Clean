
public class SortArray2D {

	public static void main(String[] args) {

		int[][] grades = { // size = 4(comes from user input)
				{ 1, 2, 3, 0 }, // small
				{ 9, 8 }, // great values
				{ 5, 6, 5, 5, 5, 5 }, // avg
				{ 1, 1, 0, 2, 2 } // very small
		};

		// sort2DarrayDesc(grades)

		// for (int[] tmp : grades) {
		// sortArray(tmp)
		// }

		grades = new int[][] { // size = 4
				
				{ 9, 8 }, // great values        avg
			
				{ 3, 2, 1, 0 }, // small         avg

				{ 6, 5, 5, 5, 5, 5 }, // avg     avg

				{ 2, 2, 1, 1, 0 } // very small  avg
		};

		float[] avgGrades = { 2.2f, 6.6f, 5.0f, 1.1f };
		
		// float[] avgGrades = new float[grades.lenght];
		// for (int i = 0; i < grades.lenght; i++) {
		// float avg = avg(grades[i]);
		// avgGrades[i] = avg;
		// }

		// for (int i = 0; i < grades.lenght; i++) {
		//   if(needToSwap()) {
		
		//    float elem = avgGrades[0];
		//    avgGrades[0]  = avgGrades[1];
		//    avgGrades[1]  = elem;
		
		//    int[] tmp = grades[0];
		//    grades[0] = grades[1];
		//    grades[1] = tmp;
		//   }
		// }

	}

}
