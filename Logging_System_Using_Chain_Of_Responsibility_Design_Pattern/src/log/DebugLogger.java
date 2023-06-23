package log;

public class DebugLogger extends Logger{
	public DebugLogger(Logger logger) {
		super(logger);
	}
	public void log(Level level, String message) {
		if(level == Level.DEBUG) {
			System.out.println("Log DEBUG : "+message);
		}
		else {
			super.log(level, message);
		}
	}
}
