package org.apache.hupa.client.ui;
/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
//package com.google.gwt.sample.showcase.client.content.cell;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.user.cellview.client.AbstractPager;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.HasRows;

/**
 * A scrolling pager that automatically increases the range every time the
 * scroll bar reaches the bottom.
 */
public class ShowMorePagerPanel extends AbstractPager {

  static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10428c5cb9");
	}
	
/**
   * The default increment size.
   */
  private static final int DEFAULT_INCREMENT = 20;

  /**
   * The increment size.
   */
  private int incrementSize = DEFAULT_INCREMENT;

  /**
   * The last scroll position.
   */
  private int lastScrollPos = 0;

  /**
   * The scrollable panel.
   */
  private final ScrollPanel scrollable = new ScrollPanel();

  /**
   * Construct a new {@link ShowMorePagerPanel}.
   */
  public ShowMorePagerPanel() {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce10");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x1");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10b5403d59");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce104398420f");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a99d9642");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x0");
	initWidget(scrollable);

    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x10x00x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x10x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x10x0");
	// Do not let the scrollable take tab focus.
    scrollable.getElement().setTabIndex(-1);

    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x2_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x1");
	// Handle scroll events.
    scrollable.addScrollHandler(new ScrollHandler() {
      public void onScroll(ScrollEvent event) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x3_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x2_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x20x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x00x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x00x0");
		// If scrolling up, ignore the event.
        int oldScrollPos = lastScrollPos;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x10x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x10x00x0");
		lastScrollPos = scrollable.getVerticalScrollPosition();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x20x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x2");
		if (oldScrollPos >= lastScrollPos) {
          InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x20x10x0");
		return;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x3_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x30x10x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x30x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x30x1");
		HasRows display = getDisplay();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x4_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x40x0");
		if (display == null) {
          InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x40x10x0");
		return;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x50x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x50x10x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x50x10x00x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x50x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x50x10x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x5");
		int maxScrollTop = scrollable.getWidget().getOffsetHeight()
            - scrollable.getOffsetHeight();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x60x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x6");
		if (lastScrollPos >= maxScrollTop) {
          InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x60x10x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x60x10x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x60x10x00x10x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x60x10x00x1");
		// We are near the end, so increase the page size.
          int newPageSize = Math.min(
              display.getVisibleRange().getLength() + incrementSize,
              display.getRowCount());
          InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x60x10x10x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce1033dcce100x10x20x00x00x162b2c3c70x30x60x10x1");
		display.setVisibleRange(0, newPageSize);
        }
      }
    });
  }

  /**
   * Get the number of rows by which the range is increased when the scrollbar
   * reaches the bottom.
   *
   * @return the increment size
   */
  public int getIncrementSize() {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10c3bb1a9f");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10c3bb1a9f0x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10c3bb1a9f0x2_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10c3bb1a9f0x1");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10c3bb1a9f0x20x0");
	return incrementSize;
  }

  @Override
  public void setDisplay(HasRows display) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x3_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x2_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x20x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b81");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x00x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x00x0");
	assert display instanceof Widget : "display must extend Widget";
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x10x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x10x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x10x00x00x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x1");
	scrollable.setWidget((Widget) display);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x2_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10a5690b810x30x20x0");
	super.setDisplay(display);
  }

  /**
   * Set the number of rows by which the range is increased when the scrollbar
   * reaches the bottom.
   *
   * @param incrementSize the incremental number of rows
   */
  public void setIncrementSize(int incrementSize) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10f4bb5a67");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10f4bb5a670x3_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10f4bb5a670x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10f4bb5a670x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10f4bb5a670x2_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10f4bb5a670x20x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10f4bb5a670x30x0_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10f4bb5a670x30x00x0");
	this.incrementSize = incrementSize;
  }

  @Override
  protected void onRangeOrRowCountChanged() {
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10cf200816");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10cf2008160x1_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10cf2008160x2_____org_apache_hupa_client_ui_ShowMorePagerPanel_java0x033dcce10cf2008160x0");
  }
}