
public class StartHere {

	public static void main(String[] args) {
		String first_welcome = "Yo! You found it! well done! Now get out!";
		String second_welcome = "So your staying. Okay. Well we gonna play a game or you could just leave.";
		String third_welcome = "Nope you're still here. Are you ready you disobedient human?";


		CreateMsg welcome = new CreateMsg();
		welcome.msg(first_welcome);
		welcome.msg(second_welcome);
		welcome.msg(third_welcome);

		GuessNumber guessOne = new GuessNumber();
		guessOne.StartGame();

	}

}
