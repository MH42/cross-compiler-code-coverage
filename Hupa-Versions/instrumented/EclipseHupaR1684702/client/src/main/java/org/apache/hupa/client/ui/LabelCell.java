package org.apache.hupa.client.ui;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class LabelCell extends AbstractCell<LabelNode> {

    public LabelCell() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621ce3c3621c0x1_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621ce3c3621c0x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621ce3c3621c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c0x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c0x10x1_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c0x10x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c0x1");
    }

    @Override
    public void render(com.google.gwt.cell.client.Cell.Context context, LabelNode value, SafeHtmlBuilder sb) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x2_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x5_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x20x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x40x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x30x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x4_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x1_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x00x0");
		if (value == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x00x10x0");
			return;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x1_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x00x0");
		if (value.getFolder().getSubscribed()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x10x00x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x10x00x00x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x10x0");
			sb.appendHtmlConstant(value.getNameForDisplay());
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x20x00x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x20x0");
			sb.appendHtmlConstant("<span style='color:gray;'>");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x20x10x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x20x10x00x0_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x20x1");
			sb.appendHtmlConstant(value.getNameForDisplay());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x20x2_____org_apache_hupa_client_ui_LabelCell_java0x0e3c3621c27af4ee00x50x10x20x20x0");
			sb.appendHtmlConstant("</span>");
        }
    }
}
