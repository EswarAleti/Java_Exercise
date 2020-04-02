import java.util.ArrayList;
public class VideoStore
{
	private int videoCount=0;
	private VideoStore[] arr=new VideoStore[10];
	public void addVideo(String title)
	{
		//If shelved are full
		if(videoCount>=10)
		{
			System.out.println("Sorry, the shelves are full");
			return;
		}
		//If shelves are not full then add video
		System.out.println("Adding video...!");
		arr[videoCount]=new VideoStore();
		//Increment video count
		videoCount++;
		System.out.println("Number of vdeos after adding new video: "+videoCount);
	}
	public void checkOutVideo(int video)
	{
		if(video>=videoCount)
		{
			System.out.println("Video index is not found");
			return;
		}
		System.out.println("Checking out video...!");
		//Traverse from video index to end of array
		for(int i=video;i<videoCount-1;i++)
		{
			//Move each video to left
			arr[i]=arr[i+1];
		}
		//Decrement video count by 1
		videoCount--;
		System.out.println("Number of videos after checking out is: "+videoCount);
	}
}