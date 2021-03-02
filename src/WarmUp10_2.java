/* Create an integer array of size 6, use a method print 
 * out the array to look like { 2 4 5 6 7 1 }. Then create two 
 * more methods, the first is sent the array and then
 * returns the position of largest element. The second is
 * sent the array and an integer, it returns true or false
 * as to whether the integer argument is in the array.
 */
import java.util.ArrayList;

public class WarmUp10_2 {
	static int[] array = {2,4,5,6,7,1};
	public static void main(String[] args) {

	printIt();
		System.out.println("Largest element is in position " + largestElement(array));
		System.out.println(checkForInt(array,10));
	}

	public static void printIt() {

		String text = "{ ";


		for (int x = 0; x < array.length; x += 1) {
			if (x == array.length - 1) {
				text += array[x];
				text += " }";
			} else {
				text += array[x] + " ";
			}
		}
		System.out.println(text);

	}
	public static int largestElement(int[] array) {
		int largestNum = array[0];
		int position = 0;
		for (int v = 0; v < array.length; v += 1) {
			if (array[v] > largestNum) {
				largestNum = array[v];
				position = v;
			}
		}
		return position;
	}
	public static boolean checkForInt(int[] array, int num) {
		//for (temporary variable of matching datatype: collection)

		//for(int currentValue: array) { // ForEach
			// if (num == currentValue) {
		//	return true;
		//}
	//}


		for (int c = 0; c < array.length; c += 1) {
			if (array[c] == num) {

				return true;
			}
		}

		return false;
	}
}
