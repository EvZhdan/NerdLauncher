class DogTestDrive
{
	public static void main(String[] agrs){
	
		Dog d = new Dog();//������� ������ ������ ���
		d.size = 40;//������������� �������� ���� size
		d.name = "������";
		d.bark();//������� ����� ����
		
	}
}

class Dog{
	int size;
	String name;
	
	void bark(){
		System.out.println("���� " + size + " ���, " + "��� ���: " + name);
	}
}