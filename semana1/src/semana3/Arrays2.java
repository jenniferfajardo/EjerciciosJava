package semana3;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]matriz=new int[3][3];
		
		matriz[1][1]=12;
		matriz[2][2]=10;
		matriz[0][1]=15;
	
		//System.out.println(matriz[1][1]);
		
		int [][]matriz1= {{30,50,25},{85,12,6},{32,41,23}};
		
		//recorrer una matriz
		
		for(int fila=0;fila<3;fila++) {
			for(int col=0;col<3;col++) {
				System.out.print(matriz1[fila][col]+"\t");
				
			}
			System.out.println("");
		}
		

	}

}
