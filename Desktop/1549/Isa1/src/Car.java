
public class Car {
int Cap;
public Car(int cap)
{
	
	this.Cap=cap;
}
public int getEngineCapacity()
{
	System.out.println("the capacity is " + Cap/1000 );
	return Cap/1000;
}
}
