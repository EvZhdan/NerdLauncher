class DogTestDrive
{
	public static void main(String[] agrs){
	
		Dog d = new Dog();//создаем объект класса Дог
		d.size = 40;//устанавливаем значение поля size
		d.name = "Трезор";
		d.bark();//вызывем метод Барк
		
	}
}

class Dog{
	int size;
	String name;
	
	void bark(){
		System.out.println("Лает " + size + " раз, " + "Имя пса: " + name);
	}
}