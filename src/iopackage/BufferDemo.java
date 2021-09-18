package iopackage;

public class BufferDemo {
	public static void main(String[] args) {
		String sb=new String("HELLO");
		char[] arr=sb.toCharArray();
		char[] arr1=new char[arr.length];
		int j=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			arr1[j]=arr[i];
			j--;
		}
		System.out.println(arr1);

	}

}
