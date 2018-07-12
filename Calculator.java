public class Calculator{
    /**
     * Simple calculator 
     */
    public Calculator(){
      
    }
    
    public int add(int a, int b){
      return a + b;
    }
    
    public int substract(int a, int b){
      return a - b;
    }
    
    public int multiply(int a, int b){
      return a * b;
    }
    
    public int divide(int a, int b){
        //not allow division by 0
       if(a == 0 || b == 0){
        return 0;
      }else{
            return a/b;
      }
    }
    
    public int modulo(int a, int b){
       if(a == 0 || b == 0){
        return 0;
      }else{
            return a%b;
      }
    }
  
    
    
    public static void main(String[] args){
  
    Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(1 , 1));
      System.out.println(myCalculator.divide(3, 0));
  
  }
}

/**
 * Output: 2 0
 */