/* 3C 3C 3C 3C
   3C 3C 3C
   3C 3C
   3C
*/


class P4{
	public static void main(String[] args){

		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){// or (j=1;j<=N-i+1;j++) where No.of rows =4
				System.out.print("3C ");
			}
			System.out.println();
		}
	}
}
