public class Linearsearch {
	public static void main(String[] args) {
		int[] array = { 152, 76, 90, 20, 51, 84 };
		int target = 51; // at index 3
		int result = linear(array, target);
		if (result != -1) {
			System.out.println("Target " + target + " found at index " + result);
		} else {
			System.out.println("Target not found");
		}
	}

	public static int linear(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (target == array[i]) {
				return i;
			}

		}
		return -1;
	}
}