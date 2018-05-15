class GuessGame{
	
	Player p1;//экземпляры для трех объектов Player
	Player p2;
	Player p3;
	
	public void startGame()
	{
		p1 = new Player();//создаем три объекта
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;//три переменные для хранения ответов каждого игрока
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;//три переменные для хранения вариантов от каждого игрока
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);//создаем число, которое игроки должны угадать
		System.out.println("Число, которое нужно угадать: " + targetNumber);
		
		while(true){
				p1.guess();//вызываем метод guess для каждого объекта Player
				p2.guess();
				p3.guess();
				
				guessp1 = p1.number;//извлекаем варианты каждого игрока - результаты работы метода guess поулчая доступ к их переменным number
				System.out.println("Первый игрок думает, что число " + guessp1);	

				guessp2 = p2.number;
				System.out.println("Второй игрок думает, что число " + guessp2);	

				guessp3 = p3.number;
				System.out.println("Третий игрок думает, что число " + guessp3);
				
				if(targetNumber == guessp1){//сверяем варианты каждого из игроков
					p1isRight = true;
				}				
				
				if(targetNumber == guessp2){
					p2isRight = true;
				}				
				
				if(targetNumber == guessp3){
					p3isRight = true;
				}			
				
				if(p1isRight || p2isRight || p3isRight){//если кто-то выиграл, пишем об этом
					System.out.println("У нас есть победитель!");
					System.out.println("Первый игрок: " + p1isRight);
					System.out.println("Второй игрок: " + p2isRight);
					System.out.println("Третий игрок: " + p3isRight);
					System.out.println("Конец Игры");
					break;//прерываем цикл
				}else{
					System.out.println("Никто не угадал. Крутим барабан заново");
			}
		}	
	}	
}


class Player{
	int number = 0;//вариант числа
	
	public void guess(){
		number = (int) (Math.random() * 10);
		System.out.println("Думаю, что это число " + number);
	}
}


class GameLauncher{
	
	public static void main(String[] agrs){
		GuessGame game = new GuessGame();
		
		game.startGame();
	}
}

