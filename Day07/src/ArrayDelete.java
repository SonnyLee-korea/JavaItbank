import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,11,13};
		
		for(int i =3; i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		
		System.out.println(Arrays.toString(arr));
		int[] temp = new int[arr.length-1];
		for(int i=0 ; i<temp.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		temp=null;
		
		System.out.println(Arrays.toString(arr));
		
	}

}
