public class TestPollymorphism
{
	public static void main(String args[] )
	{
		Item items[] = new Item[3];
		items[0] = new CD("four", "Led Zepelin", 8, 55);
		items[1] = new DVD("Match Point", "Woody Allen", "Jonathan Rhys Meyers",90);
		items[2] = new DVD("Anna Karenina", "Joe Wright", "Keira Christina Knightley", 115);
	
		for(Item item : items){
			item.print();	
		}
	}
}






