package abstractions;

public class XLSFile extends File{

	@Override
	public void open() {
		System.out.println("XLS file is opening");
	}
}
