package tjun.util;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Util {

	public static void main(String[] args) {
		new Util().test();
	}
	
	
	//测试方法
	public void test(){
		List<Gift> gifts = new ArrayList<Gift>();
        // 序号==物品Id==物品名称==概率
        gifts.add(new Gift(1, "P1", "物品1", 1d));
        gifts.add(new Gift(2, "P2", "物品2", 20d));
        gifts.add(new Gift(3, "P3", "物品3", 30d));
        gifts.add(new Gift(4, "P4", "物品4", 40d));
        gifts.add(new Gift(5, "P5", "物品5", 90d));//

        //奖品概率集合
        List<Double> orignalRates = new ArrayList<Double>(gifts.size());
        for (Gift gift : gifts) {
            double probability = gift.getProbability();	//奖品概率
            if (probability < 0) {
                probability = 0;
            }
            orignalRates.add(probability);//奖品概率集合
        }

        int orignalIndex=0;
        //循环抽奖i次
        for(int i=0;i<20;i++){
        	//抽奖方法---得到奖项索引
            orignalIndex = Util.lottery(orignalRates);
            //奖项索引--转换成奖品
            Gift gift=gifts.get(orignalIndex);
            
            System.out.println(gift);
        }
        
	}
	
	
	
	/**
     * 抽奖
     * @param ratesList 原始的概率列表，保证顺序和实际物品对应
     * @return 物品的索引
     */
    private static int lottery(List<Double> ratesList) {
        if (ratesList == null || ratesList.isEmpty()) {
            return -1;
        }
 
        int size = ratesList.size();
      //System.out.println("========size  利率大小======="+size);
        
        // 计算总概率，这样可以保证不一定总概率是1
        double sumRate = 0d;
        for (double rate : ratesList) {
            sumRate += rate;
        }
 
       //System.out.println("===sumRate 利率总和===="+ sumRate);
        
        // 计算每个物品在总概率的基础下的概率情况
        List<Double> sortOrignalRates = new ArrayList<Double>(size);
        Double tempSumRate = 0d;
        for (double rate : ratesList) {
            tempSumRate += rate;
            sortOrignalRates.add(tempSumRate / sumRate);
        }
       //System.out.println(">>>>>>>>sortOrignalRates   利率比>>>>>>"+sortOrignalRates);
 
        // 根据区块值来获取抽取到的物品索引
        double nextDouble = Math.random();
       //System.out.println("nextDouble.  随机数........."+nextDouble);
        sortOrignalRates.add(nextDouble);
        Collections.sort(sortOrignalRates);
       //System.out.println(">>>>>>>>sortOrignalRates   利率比   反转#####>>>>>>"+sortOrignalRates);
        int numA=sortOrignalRates.indexOf(nextDouble);
        //System.out.println("--------------numA-------"+numA);
        return numA;
    }
    
    
	public static int getRandomNum(int max) {
		int rnum;
		//线程随机数
		rnum = Math.abs(java.util.concurrent.ThreadLocalRandom.current().nextInt(0,max));
		return rnum;
	}
	
	
}



class Gift {
    private int index;
    private String gitfId;
    private String giftName;
    private double probability;

    public Gift(int index, String gitfId, String giftName, double probability) {
        this.index = index;
        this.gitfId = gitfId;
        this.giftName = giftName;
        this.probability = probability;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getGitfId() {
        return gitfId;
    }

    public void setGitfId(String gitfId) {
        this.gitfId = gitfId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "Gift [index=" + index + ", gitfId=" + gitfId + ", giftName=" + giftName + ", probability=" + probability + "]";
    }

}