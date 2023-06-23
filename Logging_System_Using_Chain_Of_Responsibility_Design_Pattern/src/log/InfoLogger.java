package log;

public class InfoLogger extends Logger{
	public InfoLogger(Logger logger) {
		super(logger);
	}
	public void log(Level level, String message) {
		if(level == Level.INFO) {
			System.out.println("Log INFO : "+message);

//			try {
//				Writer output = new BufferedWriter(new FileWriter("./log.txt", true));
//				output.append("Log INFO : "+message+"\n");
//				output.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		else {
			super.log(level, message);
		}
	}
}
