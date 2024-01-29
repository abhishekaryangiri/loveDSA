package loveDSA;

public class ArrayAsArgument4 {
//array as argument
	public static void update(int score[]) {

		for( int i=0;i<score.length;i++) {
			score[i] = score[i]+ 5;
		}
	}
	public static void main(String[] args) {
		int score[] = {105, 106, 98};
		update(score);
		for( int i=0; i<score.length;i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
	}
}
