package ex1217;

interface OnClickListener {
	void onClick();
}

class Window {
	String message;
	OnClickListener listener;

	public Window(String message) {
		this.message = message;
	}

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	public void clickButton() {
		listener.onClick();
	}
}

public class Exam16 {
	public static void main(String[] args) {
		Window window = new Window("hello world");
		window.setOnClickListener(new

		OnClickListener() {
			@Override
			public void onClick() {
				System.out.printf("%s", window.message);
			}
		});
		window.clickButton();
	}
}
