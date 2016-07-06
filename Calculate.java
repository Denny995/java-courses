public class Calculate{

    public static void main(String[] arg){

        System.out.println("Calculate");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int summ = first + second;
        System.out.println("sum = " + summ);
        int mno = first * second;
        System.out.println("mno = " + mno);
        int vid = first - second;
        System.out.println("vid = " + vid);
        double dill = (first/second);
        System.out.println("dil = " + dill);
        long step = (first^second);
        System.out.println("step = " + step);
  }
}