package tc3.shared;
public class InstrumentationLoggerProvider {
	private static Instrumentation instrumentationLogger = new Instrumentation() {
		public void instrument(String nodeIdentifier) {
		}
	};
	public static void set(Instrumentation instrumentationLogger) {
		InstrumentationLoggerProvider.instrumentationLogger = instrumentationLogger;
	}
	public static Instrumentation get() {
		return InstrumentationLoggerProvider.instrumentationLogger;
	}
}