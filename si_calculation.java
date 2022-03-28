
class si_calculation{
    public  double sintrest(double amt,double rate,double time)
    {
      
         double si=(amt*rate*time)/100;
         return si;
    }
    public static void main(String args[])
    {
        si_calculation obj=new si_calculation();
        double s=obj.sintrest(10500,12,4);
        System.out.println(s);
        
    }
}