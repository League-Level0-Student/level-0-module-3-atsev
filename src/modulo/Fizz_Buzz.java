package modulo;

public class Fizz_Buzz {

	public static void main(String[] args) {
for (int i = 1; i <= 20; i++) {
if(i%3 ==0&&i%5==0) {
	System.out.println("fizzbuzz");
}
else if(i%5 ==0) {
	System.out.println("buzz");
}
else if(i%3==0) {
	System.out.println("fizz");
}
else if(i==i) {
	System.out.println(i);
}
}
	}

}
