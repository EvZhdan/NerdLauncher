class GuessGame{
	
	Player p1;//���������� ��� ���� �������� Player
	Player p2;
	Player p3;
	
	public void startGame()
	{
		p1 = new Player();//������� ��� �������
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;//��� ���������� ��� �������� ������� ������� ������
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;//��� ���������� ��� �������� ��������� �� ������� ������
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);//������� �����, ������� ������ ������ �������
		System.out.println("�����, ������� ����� �������: " + targetNumber);
		
		while(true){
				p1.guess();//�������� ����� guess ��� ������� ������� Player
				p2.guess();
				p3.guess();
				
				guessp1 = p1.number;//��������� �������� ������� ������ - ���������� ������ ������ guess ������� ������ � �� ���������� number
				System.out.println("������ ����� ������, ��� ����� " + guessp1);	

				guessp2 = p2.number;
				System.out.println("������ ����� ������, ��� ����� " + guessp2);	

				guessp3 = p3.number;
				System.out.println("������ ����� ������, ��� ����� " + guessp3);
				
				if(targetNumber == guessp1){//������� �������� ������� �� �������
					p1isRight = true;
				}				
				
				if(targetNumber == guessp2){
					p2isRight = true;
				}				
				
				if(targetNumber == guessp3){
					p3isRight = true;
				}			
				
				if(p1isRight || p2isRight || p3isRight){//���� ���-�� �������, ����� �� ����
					System.out.println("� ��� ���� ����������!");
					System.out.println("������ �����: " + p1isRight);
					System.out.println("������ �����: " + p2isRight);
					System.out.println("������ �����: " + p3isRight);
					System.out.println("����� ����");
					break;//��������� ����
				}else{
					System.out.println("����� �� ������. ������ ������� ������");
			}
		}	
	}	
}


class Player{
	int number = 0;//������� �����
	
	public void guess(){
		number = (int) (Math.random() * 10);
		System.out.println("�����, ��� ��� ����� " + number);
	}
}


class GameLauncher{
	
	public static void main(String[] agrs){
		GuessGame game = new GuessGame();
		
		game.startGame();
	}
}

