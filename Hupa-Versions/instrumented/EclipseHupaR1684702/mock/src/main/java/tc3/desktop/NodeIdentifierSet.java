package tc3.desktop;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class NodeIdentifierSet extends ConcurrentHashMap {
	private static final long serialVersionUID = 1L;
	
	public NodeIdentifierSet() {
	}

	/**
	 * 
	 * @param e
	 * @return true if the element does not exist so far, false otherwise
	 */
	public synchronized boolean add(String e) {
		if(super.containsKey(e)) {
			final Integer count = (Integer) super.get(e);
			super.put(e, new Integer(count.intValue()+1));
			return false;
		}
		else {
			super.put(e, new Integer(1));
			return true;
		}
	}
	
	
}
