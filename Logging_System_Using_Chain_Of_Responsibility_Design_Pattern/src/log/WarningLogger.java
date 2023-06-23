package log;

public class WarningLogger extends Logger{
	public WarningLogger(Logger logger) {
		super(logger);
	}
	public void log(Level level, String message) {
		if(level == Level.WARNING) {
			System.out.println("Log WARNING : "+message);
		}
		else {
			super.log(level, message);
		}
	}
}
