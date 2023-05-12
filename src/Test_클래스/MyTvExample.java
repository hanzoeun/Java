package Test_클래스;

public class MyTvExample {

	// class MyTv

	
		public static void main(String args[]) {
			MyTv t = new MyTv();

			t.channel = 100;
			t.volume = 0;
			System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
			t.channelDown();
			t.volumeDown();
			System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
			t.volume = 100;
			t.channelUp();
			t.volumeUp();
			System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		}

	}


