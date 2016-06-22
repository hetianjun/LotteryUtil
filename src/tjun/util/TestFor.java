package tjun.util;

public class TestFor {

	public static void main(String[] args) {
		//使用for 输出菱形
		int wi=5;	//外层循环次数 i
		
		
		int nk=9;	//内层循环次数 k
		System.out.println("\n-----------第一步--------------");
		//第一步， 完整的嵌套 for循环
		for( int i=1; i<=wi; i++){
			System.out.print("#");
			
			for( int k=1; k<=nk; k++){//内层循环次数 k
				System.out.print(k);
			}
			
			System.out.print("#");
			System.out.println();//换行
		}
		/*
			#123456789#
			#123456789#
			#123456789#
			#123456789#
			#123456789#
		 */
		//这是第一步输出的图形。理论上每行都一样的。每行的# 都代表外层循环出的行数
		// 再上面的输出图形菱形， 找出需要得到的菱形结构
		/*
		 	#1234*6789#
			#123***789#
			#12*****89#
			#1*******9#
			#*********#
		 */
		//第1行需要输出4个数字(或者空格) 1个*号	+4个数字
		//第2行需要输出3个数字(或者空格) 3个*号	+3个数字
		//第3行需要输出2个数字(或者空格) 5个*号	+4个数字
		//第4行需要输出1个数字(或者空格) 7个*号	+1个数字
		
		System.out.println("\n\n-----------第二步---------------");
		//第二步， 嵌套 for循环输出上部分
		for( int i=1; i<=wi; i++){
			System.out.print("#");
			//将空格和*分开看，看" "的变化 行数  i=1时，他是4 ，	 2的时候是3找规律
		    for(int wj=1;wj<=wi-i;wj++){
		    	//System.out.print(" ");
		    	System.out.print(wj);
		    }
		    //* 号的规律  i是 1 3 5 7  即行数*2-1  (单数)
		    for(int k=1;k<=2*i-1;k++){
		    	System.out.print('*');
		    }
		    
		    //这一步可以不用。只是为了看效果的
		    for(int wj=wi+1;wj<=2*wi-i;wj++){//
		    	//System.out.print(" ");
		    	System.out.print(wj);
		    }//end for
		    System.out.print("#");
			System.out.println();//换行
		}
		
		System.out.println("\n\n-----------第三步---------------");
		//第三步， 完成 下半部同理。。// 相比第二部的不同。。仅仅将最外层的循环变量变成由大到小递减
		for( int i=wi; i>=1; i--){	//----------------------------------------TODO 相比第二步 唯一改变的地方
			System.out.print("#");
			//将空格和*分开看，看" "的变化 行数  i=1时，他是4 ，	 2的时候是3找规律
		    for(int wj=1;wj<=wi-i;wj++){
		    	//System.out.print(" ");
		    	System.out.print(wj);
		    }
		    //* 号的规律  i是 1 3 5 7  即行数*2-1  (单数)
		    for(int k=1;k<=2*i-1;k++){
		    	System.out.print('*');
		    }
		    
		    //这一步可以不用。只是为了看效果的
		    for(int wj=wi+1;wj<=2*wi-i;wj++){//
		    	//System.out.print(" ");
		    	System.out.print(wj);
		    }//end for
		    System.out.print("#");
			System.out.println();//换行
		}
		
		System.out.println("\n\n-----------合并后  中间还会多出一行 所以调整下外层行数---------------");
		for( int i=1; i<=wi-1; i++){	//----------------------------------------TODO 相比第三步 合并后。外层行数减少一行
			System.out.print("#");
			//将空格和*分开看，看" "的变化 行数  i=1时，他是4 ，	 2的时候是3找规律
		    for(int wj=1;wj<=wi-i;wj++){
		    	//System.out.print(" ");
		    	System.out.print(wj);
		    }
		    //* 号的规律  i是 1 3 5 7  即行数*2-1  (单数)
		    for(int k=1;k<=2*i-1;k++){
		    	System.out.print('*');
		    }
		    
		    //这一步可以不用。只是为了看效果的
		    for(int wj=wi+1;wj<=2*wi-i;wj++){//
		    	//System.out.print(" ");
		    	System.out.print(wj);
		    }//end for
		    System.out.print("#");
			System.out.println();//换行
		}
		
		for( int i=wi; i>=1; i--){	//TODO 相比第二步 唯一改变的地方
			System.out.print("#");
			//将空格和*分开看，看" "的变化 行数  i=1时，他是4 ，	 2的时候是3找规律
		    for(int wj=1;wj<=wi-i;wj++){
		    	//System.out.print(" ");
		    	System.out.print(wj);
		    }
		    //* 号的规律  i是 1 3 5 7  即行数*2-1  (单数)
		    for(int k=1;k<=2*i-1;k++){
		    	System.out.print('*');
		    }
		    
		    //这一步可以不用。只是为了看效果的
		    for(int wj=wi+1;wj<=2*wi-i;wj++){//
		    	//System.out.print(" ");
		    	System.out.print(wj);
		    }//end for
		    System.out.print("#");
			System.out.println();//换行
		}
	}
	
}
