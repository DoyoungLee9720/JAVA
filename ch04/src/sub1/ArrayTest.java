package sub1;
/*
	날짜 : 2024/07/02
	이름 : 이도영
	내용 : 배열 실습하기
*/
public class ArrayTest {
	public static void main(String[] args) {
		// 배열
		int[] arr1 = {1,2,3,4,5};
		char[] arr2 = {'A','B','C'};
		String[] arr3 = {"서울","대전","대구","부산","광주"};
		
		// 배열 원소 : 배열의 인덱스로 배열 값 참조
		System.out.println("arr1 1번째 원소 : " + arr1[0]);	
		System.out.println("arr2 1번째 원소 : " + arr2[0]);	
		System.out.println("arr3 1번째 원소 : " + arr3[0]);	
		
		
		// 배열 길이 - 배열 원소 갯수
		System.out.println("arr1 배열 길이 : " + arr1.length);
		System.out.println("arr2 배열 길이 : " + arr2.length);
		System.out.println("arr3 배열 길이 : " + arr3.length);
		
		
		// 배열 반복문
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1 " + i +"번째 원소 : " + arr1[i]);	
		}
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println("arr3 " + i +"번째 원소 : " + arr3[i]);	
		}
		
		for(char ch: arr2) {
			System.out.print(ch +" ");
		}
		
		System.out.println();
		
		for(String city: arr3) {
			System.out.print(city +" ");
			
		}
		System.out.println();
		
		// 1차원 배열 - 선형
		int[] scores = {80, 60, 78, 62, 92}; //배열명은 복수형으로 네이밍
		
		int total = 0;
		for(int i=0;i<scores.length;i++) {
			total += scores[i];
		}
		System.out.println("scores 배열의 총합 : " + total);
		
		total =0;
		
		for(int i: scores) {
			total += i;
		}
		System.out.println("scores 배열의 총합 : " + total);
		
		// 2차원 배열 - 행렬
		int[][] arr2d ={{1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12}};
		
		for(int a=0;a<3;a++) {
			for(int b=0;b<4;b++) {
				System.out.println("arr2d[" + a + "][" + b + "] : " + arr2d[a][b]);
			}
		}
		// 3차원 배열
		int[][][] arr3d = {{{1, 2, 3},{ 4, 5, 6},{ 7, 8, 9}},
						  {{10,11,12},{13,14,15},{16,17,18}},
						  {{19,20,21},{22,23,24},{25,26,27}}};
		
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				for(int z =0;z<3;z++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n",i,j,z, arr3d[i][j][z]);
				}
			}
		}
		
	}
}
