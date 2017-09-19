
object GCD
{
	def gcd(a:Int, b: Int): Int = 
	{
		if(b==0) a else gcd(b, a%b)
	}
	def main(args: Array[String])
	{
		println("Enter First Number : ");
		var x = Console.readInt();
		println("Enter Second Number : ");
		var y = Console.readInt();
		println("you entered : " + x);
		println("GCD Of " + x + " & " +  y + " is: " + gcd(x,y));
	}
 
}

