import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		task_03();
//		task_01();
//		task_04();
	}

	static void task_01() {
		List<Object> array = new ArrayList<>();
		array.add(true);
		array.add(new String("Hello"));
		array.add(new String("world"));
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(false);
		array.add(true);
		array.add(4);
		array.add("string");
		System.out.println(array.toString());
		array.remove(0);
		array.remove(0);
		array.remove(array.size() - 1);
		System.out.println(array.toString());
	}
	
	static void task_03() {
		WorkWithFiles wwf = new WorkWithFiles();
		File file = new File("C:\\Users\\Vladislav\\Desktop\\hello.txt");
		wwf.countChars(file);
	}
	static void task_04() {
		TheBigBangTheory bbt = new TheBigBangTheory(2);
		bbt.start();
	}
}
