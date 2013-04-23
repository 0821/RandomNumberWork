RandomNumberWork
================public class RandomNumber3 {
  private int LoBound;
  private int HiBound;
  public RandomNumber3()
  {
  	LoBound = 1;
  	HiBound = 10;
  }
  public RandomNumber3(int low , int high)
  {
  	LoBound = low;
  	HiBound = high;
  }
  
      public int GetANumber ()
      {
      	int ComputerNum;
      	ComputerNum = LoBound = (int)(Math.random()* HiBound);
  	return ComputerNum;
  	
  }

}

public class RandomNumber4 {
public static void main (String [] args)
{
  RandomNumber3 random1 = new RandomNumber3();
  
  RandomNumber3 random2 = new RandomNumber3(1, 20);
  System.out.printf("random number1 gets a random number %d\n", random1.GetANumber());
  
  System.out.printf("random number2 gets a random number %d\n", random2.GetANumber());
}
}
