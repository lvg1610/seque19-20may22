class Utility<T extends Number>
{
   T obj;
   public Utility(T obj)
   {
      this.obj=obj;
   }
   public T getObj()
   {
      return obj;
   } 
}
class Test
{
   public static void  main(String[] args) 
   {
       Utility<Integer> u = new Utility<Integer>(100);
       System.out.println(u.getObj());

       Utility<Double> u2 = new Utility<Double>(200.0);
       System.out.println(u2.getObj());   

      /* Utility<String> u3 = new Utility<String>("Welcome");
       System.out.println(u3.getObj()); */      
   }
}



        


















