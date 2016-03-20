package tc3.server;
import tc3.shared.Instrumentation;
public class InstrumentationLogger implements Instrumentation {
	public void instrument(String nodeIdentifier) {
		tc3.desktop.InstrumentationLoggerProvider.get().instrument(nodeIdentifier);
	}
}