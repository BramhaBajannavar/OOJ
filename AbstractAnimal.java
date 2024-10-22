//different files


public abstract class Animal{
	public abstract void eat();
	public abstract void sleep();

	public static void main(String [] args){
		Animal lion  = new Lion();
		Animal tiger = new Tiger();
		Animal deer = new Deer();

		lion.eat();
		lion.sleep();
		tiger.eat();
		tiger.sleep();
		deer.eat();
		deer.sleep();

	}
}



public class Lion extends Animal{
	@Override
	public void eat(){
		System.out.println("The lion is eating");
	}


	@Override
	public void sleep(){
		System.out.println("The lion is sleeping");
	}
}



public class Tiger extends Animal{
	@Override
	public void eat(){
		System.out.println("The tiger is eating");
	}


	@Override
	public void sleep(){
		System.out.println("The tiger is sleeping");
	}
}




public class Deer extends Animal{
	@Override
	public void eat(){
		System.out.println("The deer is eating");
	}


	@Override
	public void sleep(){
		System.out.println("The deer is sleeping");
	}
}
