package tjun.util;


public class TestMethod {

	public static void main(String[] args) {
		/*
		 * 李白街上走，提壶去买酒遇店加一倍，见花喝一斗
		 * 李筱安° 2016/6/14 星期二 16:06:14
		 * 五遇店和花，喝光壶中酒，原有多少酒？
		 * 
		 * 每次遇到店和花 相当于  (X x 2)+1 斗
		 * 连续5次。得结果。 X=0
		 * 
		 */
		double num=0;
		for(int i=5;i>=1;i--){
			num=(num+1)/2;		
			System.out.println("第"+i+"次遇店和花=="+num);
		}
		System.out.println("原来有就"+num+"斗。。");
		
		//验证
		for(int i=1;i<=5;i++){
			num=(num*2)-1;
			System.out.println("第"+i+"次遇店和花=="+num);
		}
	}
	
	private static double clac(double num){
		double sub=0;
		
		return sub;
	}
}
