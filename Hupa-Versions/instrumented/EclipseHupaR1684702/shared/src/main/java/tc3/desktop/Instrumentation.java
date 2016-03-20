package tc3.desktop;
public interface Instrumentation {
	public void instrument(String nodeIdentifier);
	public void startLogging(String testCaseName);
	public void stopLogging();
	public void setupDB();
}