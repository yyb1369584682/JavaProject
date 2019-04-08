package test;

import java.util.Scanner;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
 * 个整数，判断数组中是否含有该整数
 */
public class ArrayFind {

	public static void main(String[] args) {
		//定义一个二维数组
		int[][] array = new int[10][10];
		//为数组赋值
		for(int i = 0;i < 10;i++){
			for (int j = 0;j<10;j++){
				array[i][j] = i+j;
			}
		}
		for(int i = 0;i < 10;i++){
			for (int j = 0;j<10;j++){
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		int num ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要判断的数");
		num = scanner.nextInt();
		boolean b = find(num, array);
		if (find(num, array)==true){
			System.out.println("存在该数");
		}else {
			System.out.println("不存在该数");
		}


	}
	public static boolean find(int num,int[][] array){
		boolean flag = false;
		for(int i = 0;i < array.length;i++){
			for (int j = 0;j<array[0].length;j++){
				if(array[i][j]==num){
					flag = true;
				}
			}
		}
		return flag;
	}

}
