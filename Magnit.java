class Magnit
{
	public static void main(String[] args)
	{
		Echo e1 = new Echo();
		Echo e2 = e1;//_________________

		int x = 0;
		
		while (x < 4)//__________
		{
			e1.hello();//		привеееееет...
			e1.count = e1.count + 1;
			
			if(x == 3)
			{
				e2.count = e2.count + 1;
			}
			if(x > 0)
			{
				e2.count = e2.count + e1.count;
			} 
			x = x + 1;
		} 
		System.out.println(e2.count); //надо чтобы e2.count было 10
	}
}

class Echo {
	int count = 0;
	void hello() {//______________
		System.out.println("привеееееет...");
	}
}








