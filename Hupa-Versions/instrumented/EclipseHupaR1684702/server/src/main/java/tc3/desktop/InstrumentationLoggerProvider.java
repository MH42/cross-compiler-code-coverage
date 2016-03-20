package tc3.desktop;
public class InstrumentationLoggerProvider {
	private static Instrumentation instrumentationLogger = new InstrumentationLogger();
	public static void set(Instrumentation instrumentationLogger) {
		InstrumentationLoggerProvider.instrumentationLogger = instrumentationLogger;
	}
	public static Instrumentation get() {
		return InstrumentationLoggerProvider.instrumentationLogger;
	}
}