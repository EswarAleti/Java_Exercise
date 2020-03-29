public class Song
{
	private String title;
	private double duration;
	//Default constructor
	Song()
	{
		this.title="Title";
		this.duration=4;
	}
	Song(String title, double duration)
	{
		this.title=title;
		this.duration=duration;
	}
	Song(Song song)
	{
		this.title=song.title;
		this.duration=song.duration;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setDuration(double duration)
	{
		this.duration=duration;
	}
	public String getTitle()
	{
		return this.title;
	}
	public double getDuration()
	{
		return this.duration;
	}
	public String toString()
	{
		return this.title+" "+duration;
	}
}