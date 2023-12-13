package java_by_kunal;

public class maxItem_fromArray {

	public static void main(String[] args) {
		int[] arr= {10,52,45,74,12};
		System.out.println(max(arr));
		//calling maxRange function
		System.out.println(maxRange(arr,0,2));
				
	}
	//work on edge cases,like array being null
	static int max(int[] arr) {
		if(arr.length<1) {
			return -1;
		}
		int maxITem=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>maxITem) {
				maxITem=arr[i];
			}
			
		}
		return maxITem;
	}
	
	//function for finding maximum item in a given range
	static int maxRange(int[] arr,int sR, int eR) {
		if(sR>eR) {
			return -1;
		}
		if(arr==null) {
			return -1;
		}
		int maxVal=arr[sR];
		for(int i=sR;i<=eR;i++) {
			if(arr[i]>maxVal) {
				maxVal=arr[i];
			}
		}
		return maxVal;
	}

}
