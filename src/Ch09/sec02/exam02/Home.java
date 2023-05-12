package Ch09.sec02.exam02;

public class Home {
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("티비를 켭니다");
		}

		@Override
		public void turnOff() {
			System.out.println("티비를 끕니다");

		}

	};
	public void user1() {
		rc.turnOff();
		rc.turnOn();
	}
	
	public void user2() {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
				
			}
			
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
	public void user3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
