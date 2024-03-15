package abstraction;

public class GoogleVideo extends Google{
@Override
public void search()
{
	System.out.println("video search");
}
public static void main(String args[]) {
	GoogleVideo g=new GoogleVideo();
	g.search();

GoogleImage gm =new GoogleImage();
gm.search();
}
}
