public class Clock1
{
	private int hr;
	private int min;
	private int sec;
	private String meridiem;

	public void setTime(int h, int m, int s, String meridiem)
	{
		setHr(h);setMin(m);setSec(s);setMeridiem(meridiem);
	}
	public void setHr(int h)
	{
		if (h<0 || h>11) h=0;
		this.hr=h;
	}
	public void setMin(int m)
	{
		if (m<0 || m>59) m=0;
		this.min=m;
	}
	public void setSec(int s)
	{
		if (s<0 || s>59) s=0;
		this.sec=s;
	}
	public void setMeridiem(String mer)
	{
		this.meridiem=mer;
	}
	public int getHr()
	{
		return this.hr;
	}
	public int getMin()
	{
		return this.min;
	}
	public int getSec()
	{
		return this.sec;
	}
	public String getMeridiem()
	{
		return this.meridiem;
	}
	public String toString()
	{
		return this.hr+":"+this.min+":"+this.sec+" "+this.meridiem;
	}
}