
class Parent {

	int value = 1000;

	Parent()
	{

	}
}


class Child extends Parent {

	int value = 10;

	Child()
	{

	}
}


class GFG {

	public static void main(String[] args)
	{


		Child obj = new Child();


		System.out.println("Reference of Child Type :"
						+ obj.value);

		Parent par = obj;

		System.out.println("Reference of Parent Type : "
						+ par.value);
	}
}
