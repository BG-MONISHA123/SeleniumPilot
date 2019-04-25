package skeliton;

public class Person {
  int distance;
  String message;

	public void setDistance(Integer int1)
	{
		
		this.distance=int1;
	}

	public void setMessage(String string) {
		// TODO Auto-generated method stub
		if(this.distance<=20 && this.distance>0 )
		{
		this.message=string;
		}
		else
		{
			this.message="CANNOT HEAR";
		}
	}

	public String getMessage() 
	{
		
		return message;
		// TODO Auto-generated method stub
		
	}

}
