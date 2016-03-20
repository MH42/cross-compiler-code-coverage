/*
 *    Copyright 2012 Thomas Broyer <t.broyer@ltgt.net>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hupa.client.mapper;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

/**
 * Makes it easy to put any {@link Activity} behind a split-point.
 * <p>
 * For simple activities, that could be done using an
 * {@link com.google.gwt.user.client.AsyncProxy AsyncProxy}, but it's not
 * possible for activities created through factories or via dependency
 * injection.
 * <p>
 * As a bonus, the {@link Activity} won't be instantiated at all in case the
 * {@link ActivityAsyncProxy} is {@link #onCancel cancelled} before the
 * {@link GWT.runAsync async call} returns.
 */
public abstract class ActivityAsyncProxy implements Activity {

    public ActivityAsyncProxy(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed37c9a9b85_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed37c9a9b850x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed37c9a9b850x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed37c9a9b850x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed33fae185b_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed33fae185b0x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed33fae185b0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed33fae185b0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed399b14ede_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed399b14ede0x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed399b14ede0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed399b14ede0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c3bec6bc_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c3bec6bc0x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c3bec6bc0x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c3bec6bc0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3532f4e45_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3532f4e450x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3532f4e450x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3532f4e450x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed359b189070x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed359b18907_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed359b189070x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed359b189070x1");
	}
	
	private boolean hasAsyncBeenIssued;
    private boolean hasAsyncBeenCancelled;
    private boolean hasAsyncFailed;
    private AcceptsOneWidget display;
    private EventBus eventBus;
    private Activity instance;

    @Override
    public String mayStop() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x20x00x0");
		checkHasAsyncFailed();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x20x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x20x10x0");
		assert this.instance != null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x20x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3f653745f0x20x2");
		return this.instance.mayStop();
    }

    @Override
    public void onCancel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x00x0");
		if (this.instance != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x00x10x00x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x00x10x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0");
			this.instance.onCancel();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x10x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x1");
		checkHasAsyncFailed();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3994124b60x20x2");
		this.hasAsyncBeenCancelled = true;
    }

    @Override
    public void onStop() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x20x00x0");
		checkHasAsyncFailed();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x20x10x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x20x1");
		assert this.instance != null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x20x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3d2e0f1d90x20x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0");
		this.instance.onStop();
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x30x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x3_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a52");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x00x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0");
		if (this.instance != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x00x10x00x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x00x10x0");
			this.instance.start(panel, eventBus);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x00x10x1");
			return;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x10x0");
		checkHasAsyncFailed();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x20x00x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0");
		assert !this.hasAsyncBeenIssued || this.hasAsyncBeenCancelled;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x3_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x30x0");
		this.display = panel;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x4_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x40x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0");
		this.eventBus = eventBus;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x5_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x50x0");
		this.hasAsyncBeenCancelled = false;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x6_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x0");
		if (!this.hasAsyncBeenIssued) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x00x0");
			this.hasAsyncBeenIssued = true;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x0");
			if (!ActivityAsyncProxy.this.hasAsyncBeenCancelled) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x10x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x10x00x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0");
				assert ActivityAsyncProxy.this.instance == null;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x10x10x00x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x10x10x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x10x1");
				ActivityAsyncProxy.this.instance = createInstance();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x10x2_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3c5962a520x40x60x10x10x10x20x0");
				ActivityAsyncProxy.this.instance.start(
                        ActivityAsyncProxy.this.display,
                        ActivityAsyncProxy.this.eventBus);
            }
//            doAsync(new RunAsyncCallback() {
//
//                @Override
//                public void onSuccess() {
//                    if (!ActivityAsyncProxy.this.hasAsyncBeenCancelled) {
//                        assert ActivityAsyncProxy.this.instance == null;
//                        ActivityAsyncProxy.this.instance = createInstance();
//                        ActivityAsyncProxy.this.instance.start(
//                                ActivityAsyncProxy.this.display,
//                                ActivityAsyncProxy.this.eventBus);
//                    }
//                }
//
//                @Override
//                public void onFailure(Throwable reason) {
//                    ActivityAsyncProxy.this.hasAsyncFailed = true;
//                    if (GWT.getUncaughtExceptionHandler() != null) {
//                        GWT.getUncaughtExceptionHandler().onUncaughtException(
//                                reason);
//                    }
//                }
//            });
        }
    }

    /**
     * Implementors should simply call {@link GWT#runAsync} here, and nothing
     * else.
     * <p>
     * This is required to have a different split-point generated for each
     * {@link ActivityAsyncProxy} sub-class.
     */
    protected abstract void doAsync(RunAsyncCallback callback);

    protected abstract Activity createInstance();

    private void checkHasAsyncFailed() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b8160x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b816_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b8160x1_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b8160x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b8160x20x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0");
		if (this.hasAsyncFailed) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b8160x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b8160x20x00x10x00x00x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b8160x20x00x10x00x0_____org_apache_hupa_client_mapper_ActivityAsyncProxy_java0x0b17f2ed3dc00b8160x20x00x10x0");
			throw new IllegalStateException("runAsync load previously failed");
        }
    }
}
