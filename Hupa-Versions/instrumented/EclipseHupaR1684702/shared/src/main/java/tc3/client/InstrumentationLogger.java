package tc3.client;
import tc3.shared.Instrumentation;
public class InstrumentationLogger implements Instrumentation {
	 public native void instrument(String nodeIdentifier) /*-{
		 if(nodeIdentifier !== '') {
			 $wnd.sendToLoggingServer(nodeIdentifier);
		 }
	}-*/;

}