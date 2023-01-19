
public class VideoStoreLauncher {

	public static void main(String[] args) {
		VideoStore vid1 = new VideoStore();
		vid1.setTitle("The Godfather");
		vid1.addRating(3);
		vid1.addRating(2);
		vid1.addRating(5);
		
		System.out.println(vid1.getTitle()+":"+vid1.getRating());

		vid1.checkOut();
		getStatus(vid1);
		vid1.returnTostore();
		getStatus(vid1);
	}
	
	public static void getStatus(VideoStore v) {
		if(v.isCheckOut()) {
			System.out.println("\'"+v.getTitle()+"\' is checked out.");
		}else{
			System.out.println("\'"+v.getTitle()+"\' is on the shelves.");
		}
	}

}
