public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validateAge(int age) throws IllegalArgumentException{
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        else if (age>150) {
			throw new IllegalArgumentException("Age must be realistic");
		}
		return true;
    }

	public static double withdraw (double amount, double balance) throws IllegalArgumentException, IllegalStateException{
		if (amount <=0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		}
		if (balance<amount) {
			throw new IllegalStateException("Not enough funds");
		}
		return balance-amount;
	}

	public static String validateEmail(String email) throws IllegalArgumentException {
		if (email==null||email.equals("")) {
			throw new IllegalArgumentException("Email cannot be empty");
		}
		if (!email.contains("@")) {
			throw new IllegalArgumentException("Invalid email format");
		}
		if (!email.substring(email.indexOf("@"), email.length()).contains(".")) {
			throw new IllegalArgumentException("Invalid email format");
		}
		return email.trim();
		

	}

	public static int getElement(int[] array, int index) throws NullPointerException, IndexOutOfBoundsException {
		if (array==null) {
			throw new NullPointerException("Array cannot be null");
		}
		if (index<0) {
			throw new IndexOutOfBoundsException("Index cannot be negative");
		}
		if (index>=array.length) {
			throw new IndexOutOfBoundsException ("Index cannot be greater then array size");
		}
		return array[index];
	}

	

}
