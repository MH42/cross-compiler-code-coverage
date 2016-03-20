/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.hupa.widgets.event;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Event which get fired on any edit operation
 *
 *
 */
public class EditEvent extends GwtEvent<EditHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x30x1_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x40x0_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x3_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x40x00x00x0_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x4_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x0_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x40x00x00x1_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x2_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x40x00x0_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x1_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b4851_____org_apache_hupa_widgets_event_EditEvent_java0x063965451a93b48510x30x0");
	}
	


	public static final Type<EditHandler> TYPE = new Type<EditHandler>();
    private EventType eType;
    private Object oldValue;
    private Object newValue;

    /**
     * The edit types
     *
     */
     public enum  EventType{
        Start,
        Stop,
        Cancel
    }

     public EditEvent(EventType eType,Object oldValue,Object newValue) {
         InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x3_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x10x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x20x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x4_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x30x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x1_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x2_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451b8dd97db9e253470");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451b8dd97db952f3754");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451b8dd97db77dfd213");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x06396545174666ad70x1_____org_apache_hupa_widgets_event_EditEvent_java0x06396545174666ad7_____org_apache_hupa_widgets_event_EditEvent_java0x06396545174666ad70x0_____org_apache_hupa_widgets_event_EditEvent_java0x06396545174666ad70x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654515333c95e0x1_____org_apache_hupa_widgets_event_EditEvent_java0x0639654515333c95e_____org_apache_hupa_widgets_event_EditEvent_java0x0639654515333c95e0x2_____org_apache_hupa_widgets_event_EditEvent_java0x0639654515333c95e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451b8dd97db");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x06396545110b55c8e_____org_apache_hupa_widgets_event_EditEvent_java0x06396545110b55c8e0x0_____org_apache_hupa_widgets_event_EditEvent_java0x06396545110b55c8e0x2_____org_apache_hupa_widgets_event_EditEvent_java0x06396545110b55c8e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x40x00x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x40x0");
		this.eType = eType;
         InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x40x10x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x40x1_____org_apache_hupa_widgets_event_EditEvent_java0x0");
		this.oldValue = oldValue;
         InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x40x2_____org_apache_hupa_widgets_event_EditEvent_java0x0639654518509099e0x40x20x0_____org_apache_hupa_widgets_event_EditEvent_java0x0");
		this.newValue = newValue;
     }

     /**
      * Return the edit type
      *
      * @return eType
      */
     public EventType getEventType() {
         InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654516e2fb3ca0x1_____org_apache_hupa_widgets_event_EditEvent_java0x0639654516e2fb3ca0x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654516e2fb3ca0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654516e2fb3ca");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654516e2fb3ca0x20x0");
		return eType;
     }

     /**
      * Return the oldvalue of the editing component
      *
      * @return oldValue
      */
     public Object getOldValue() {
         InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x06396545133a6fe4a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x06396545133a6fe4a0x2_____org_apache_hupa_widgets_event_EditEvent_java0x06396545133a6fe4a0x1_____org_apache_hupa_widgets_event_EditEvent_java0x06396545133a6fe4a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x06396545133a6fe4a0x20x0");
		return oldValue;
     }

     /**
      * Return the newvalue of the editing component
      *
      * @return newValue
      */
     public Object getNewValue() {
         InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654511b6cd38f0x1_____org_apache_hupa_widgets_event_EditEvent_java0x0639654511b6cd38f0x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654511b6cd38f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654511b6cd38f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654511b6cd38f0x20x0");
		return newValue;
     }

    @Override
    protected void dispatch(EditHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d0x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d0x3_____org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d0x20x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d0x1_____org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d0x30x00x00x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d0x30x0_____org_apache_hupa_widgets_event_EditEvent_java0x0639654514f72c78d0x30x00x0");
		handler.onEditEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<EditHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451adc165ab0x10x0_____org_apache_hupa_widgets_event_EditEvent_java0x063965451adc165ab0x1_____org_apache_hupa_widgets_event_EditEvent_java0x063965451adc165ab0x10x1_____org_apache_hupa_widgets_event_EditEvent_java0x063965451adc165ab0x2_____org_apache_hupa_widgets_event_EditEvent_java0x063965451adc165ab0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_event_EditEvent_java0x063965451adc165ab0x20x0");
		return TYPE;
    }


}
