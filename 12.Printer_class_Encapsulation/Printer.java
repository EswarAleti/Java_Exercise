public class Printer
{
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	public Printer(int tonerLevel,boolean duplex)
	{
		if(tonerLevel>100 || tonerLevel<0)
			this.tonerLevel=-1;
		else
			this.tonerLevel=tonerLevel;
		this.duplex=duplex;
	}
	public int getTonerLevel()
	{
		return this.tonerLevel;
	}
	public int getPagesPrinted()
	{
		return this.pagesPrinted;
	}
	public int addToner(int val)
	{
		if(this.tonerLevel+val>100 || this.tonerLevel+val<0)
			return -1;
		this.tonerLevel +=val;
		return this.tonerLevel;
	}
	public int printPages(int pages)
	{
		this. pagesPrinted += duplex ? (pages/2)+(pages%2) : pages;
		return duplex ? (pages/2)+(pages%2) : pages;
	}

}