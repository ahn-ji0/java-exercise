package week3.day2;

public class RandomCalculator implements RandomNumber {
    private int a;
    private int randNum;
    @Override
    public void genRandNum(){
        randNum = (int) (Math.random() * 10);
        System.out.println(randNum);
    }

    public int getRandNum() {
        return randNum;
    }

    public RandomCalculator(int a){
        this.a = a;
    }

    public int randPlus(){return a+randNum;}
    public int randMinus(){return a-randNum;}
    public int randMultiply(){return a*randNum;}
    public double randDivide(){
        double result = 0;
        try {
            result = (double) a / randNum;
        }catch (Exception e){
            System.out.println("Error");
        }
        return result;
    }


}
