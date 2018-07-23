import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class TheBigBangTheory {

	private Queue<String> queue = new ArrayDeque<String>();
	
	private String Sheldon = new String("Sheldon");
	private String Leonard = new String("Leonard");
	private String Volovitc = new String("Volovitc");
	private String Kutrapalli = new String("Kutrapalli");
	private String Penny = new String("Penny");
	private int colas;
	
	public TheBigBangTheory(int colas) {
		super();
		this.colas = colas;
	}
	public TheBigBangTheory() {
		super();
	}
	
	private void adddQueue() {
		queue.add(Sheldon);
		queue.add(Leonard);
		queue.add(Volovitc);
		queue.add(Kutrapalli);
		queue.add(Penny);
	}
	
	public void start() {
		adddQueue();
		for(int i = 0; i < colas; i++) {
			String temp = new String("");
			temp = queue.remove();
			queue.add(temp);
			queue.add(temp);
		}
	    System.out.println(queue.toString());
	}
	
}
