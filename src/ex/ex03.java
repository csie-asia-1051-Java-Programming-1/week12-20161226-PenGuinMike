package ex;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int data [][]=new int [3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				data[i][j]=scn.nextInt();
			}
		}
		if(data[0][0]+data[0][1]+data[0][2]==0){
			System.out.println("plater 0 Win !");
		}else if(data[1][0]+data[1][1]+data[1][2]==0){
			System.out.println("plater 0 Win !");
		}else if(data[2][0]+data[2][1]+data[2][2]==0){
			System.out.println("plater 0 Win !");
		}else if(data[0][2]+data[1][1]+data[2][0]==0){
			System.out.println("plater 0 Win !");
		}else if(data[0][0]+data[1][1]+data[2][2]==0){
			System.out.println("plater 0 Win !");
		}else if(data[0][0]+data[1][0]+data[2][0]==0){
			System.out.println("plater 0 Win !");
		}else if(data[0][1]+data[1][1]+data[2][1]==0){
			System.out.println("plater 0 Win !");
		}else if(data[0][2]+data[1][2]+data[2][2]==0){
			System.out.println("plater 0 Win !");
		}else if(data[0][0]+data[0][1]+data[0][2]==3){
			System.out.println("plater 1 Win !");
		}else if(data[1][0]+data[1][1]+data[1][2]==3){
			System.out.println("plater 1 Win !");
		}else if(data[2][0]+data[2][1]+data[2][2]==3){
			System.out.println("plater 1 Win !");
		}else if(data[0][2]+data[1][1]+data[2][0]==3){
			System.out.println("plater 1 Win !");
		}else if(data[0][0]+data[1][1]+data[2][2]==3){
			System.out.println("plater 1 Win !");
		}else if(data[0][0]+data[1][0]+data[2][0]==3){
			System.out.println("plater 1 Win !");
		}else if(data[0][1]+data[1][1]+data[2][1]==3){
			System.out.println("plater 1 Win !");
		}else if(data[0][2]+data[1][2]+data[2][2]==3){
			System.out.println("plater 1 Win !");
		}else{
			System.out.println("False");
		}
		
	}

}
