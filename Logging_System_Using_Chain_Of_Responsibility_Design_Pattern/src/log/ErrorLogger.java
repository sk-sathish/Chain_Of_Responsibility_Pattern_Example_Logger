package log;

public class ErrorLogger extends Logger{
	public ErrorLogger(Logger logger) {
		super(logger);
	}
	public void log(Level level, String message) {
		if(level == Level.ERROR) {
			System.out.println("Log ERROR : "+message);
		}
		else {
			super.log(level, message);
		}
	}
}
