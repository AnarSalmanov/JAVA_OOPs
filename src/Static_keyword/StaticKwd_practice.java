package Static_keyword;

import Static_keyword.StaticKwd_intro;

public class StaticKwd_practice {

	public static void main(String[] args) {

		StaticKwd_intro.staticMethod();
		String myName = StaticKwd_intro.name;
		System.out.println("my name is " + myName);

		StaticKwd_intro stk1 = new StaticKwd_intro();
		System.out.println(stk1.count); // --1

		StaticKwd_intro stk2 = new StaticKwd_intro();
		System.out.println(stk2.count); // -->2

		System.out.println(StaticKwd_intro.count); // -->2 Because increase logic is inside constructor.
	}

}
