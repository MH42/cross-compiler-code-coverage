package org.apache.hupa.client.storage;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.shared.storage.AppCacheMemory;
import org.apache.hupa.shared.storage.AppSerializer;

import com.google.gwt.storage.client.Storage;
import com.google.gwt.storage.client.StorageMap;
import com.google.inject.Inject;

/**
 * AppCache implementation in Browser localStorage.
 *
 * @author manolo
 */

public class AppCacheHTML5 extends AppCacheMemory {

    Storage localStorage;
    StorageMap storageMap;

    @Inject
    public AppCacheHTML5(AppSerializer s) {
        super(s);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f4c53054aa0x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f4c53054aa0x10x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f4c53054aa0x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f4c53054aa0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f4c53054aa0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f4c53054aa");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f481c61b310x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f481c61b31_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f481c61b310x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f418e5ffe5_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f418e5ffe50x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f418e5ffe50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f4");
    }

    @Override
    public void createStorageImplementationSync() {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x00x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x0");
		localStorage = Storage.getLocalStorageIfSupported();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x10x0");
		if (localStorage == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x10x10x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x10x10x0");
			super.createStorageImplementationSync();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x10x10x1");
			return;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x00x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x00x00x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x00x0");
			storageMap = new StorageMap(localStorage);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x10x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x1");
			localStorage.setItem(".", ".");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x20x0");
			localStorage.getItem(".");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x30x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x3");
			storageMap.containsKey(".");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x4_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x00x40x0");
			localStorage.removeItem(".");
        } catch (Exception e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x10x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x10x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x10x10x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x10x10x00x0");
			super.createStorageImplementationSync();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x20x10x10x1");
			return;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x3_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x0");
		syncStorage = new SyncStorage() {
            @Override
            public void setItem(String key, Object data) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x4_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x3_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x30x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc994");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x40x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x40x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x12d3bc9940x40x00x00x0");
				localStorage.setItem(key, "" + data);
            }

            @Override
            public void removeItem(String key) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x3_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x30x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x30x0");
				if (storageMap.containsKey(key)) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x30x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x30x00x10x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1841d73d20x30x00x10x00x0");
					localStorage.removeItem(key);
                }
            }

            @Override
            public int getLength() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1aa3b42b30x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1aa3b42b30x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1aa3b42b30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1aa3b42b3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1aa3b42b30x20x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1aa3b42b30x20x00x0");
				return localStorage.getLength();
            }

            @Override
            public String getItem(String key) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x20x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x3_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x30x00x10x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x30x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x30x00x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x30x00x0");
				String ret =  localStorage.getItem(key);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x15259a17f0x30x1");
				return ret;
            }

            @Override
            public boolean containsKey(String key) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x17885ed7c0x20x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x17885ed7c0x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x17885ed7c0x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x17885ed7c0x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x17885ed7c0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x17885ed7c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x17885ed7c0x30x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x17885ed7c0x30x0");
				return storageMap.containsKey(key);
            }

            @Override
            public void clear() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1168cbb2e");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1168cbb2e0x2_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1168cbb2e0x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1168cbb2e0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1168cbb2e0x20x00x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x1168cbb2e0x20x0");
				localStorage.clear();
            }

            @Override
            public String key(int i) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x141cdd845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x141cdd8450x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x141cdd8450x1_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x141cdd8450x20x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x141cdd8450x3_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x141cdd8450x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x141cdd8450x30x0_____org_apache_hupa_client_storage_AppCacheHTML5_java0x05d4057f44069c1b60x20x30x00x00x141cdd8450x30x00x0");
				return localStorage.key(i);
            }

            @Override
            public native void log(Object o) /*-{
                if ($wnd.console && typeof $wnd.console.log == 'function')
                  $wnd.console.log(o);
            }-*/;

            @Override
            public native int getSize() /*-{
                try {
                  return JSON.stringify(localStorage).length;
                } catch (e) {
                  return 0;
                }
            }-*/;
        };
    }
}
