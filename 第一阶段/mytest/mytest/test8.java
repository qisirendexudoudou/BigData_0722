package mytest;

//遍历二维数组中的所有元素
public class test8 {
	public static void main(String[] args) {
		int[][] a={{2,4,789,464,7894,48},{897,798,74,756,45}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
			
		}
	}
}
