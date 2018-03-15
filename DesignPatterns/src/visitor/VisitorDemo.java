package visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerPart c=new Computer();
		c.accept(new ComputerPartDisplayVisitor());
	}

}
