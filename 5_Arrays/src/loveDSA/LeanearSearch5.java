package loveDSA;

public class LeanearSearch5 {
	
	public static int  linearSearch (int scoreDhoni[], int key) {
		for(int i=0;i<scoreDhoni.length; i++) {
			if ( scoreDhoni[i] == key) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int scoreDhoni[] = {100, 90,85, 50};
	int key = 50;
	
	int index = linearSearch(scoreDhoni, key);
	if( index == -1) {
		System.out.println("Key not found");
	}else {
		System.out.println("Key is available at index :  "+index);
	}
}
}
