/* 
@VaadinApache2LicenseForJavaFiles@
 */

package com.vaadin.terminal.gwt.client.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.terminal.gwt.client.ApplicationConnection;
import com.vaadin.terminal.gwt.client.VPaintableWidget;
import com.vaadin.terminal.gwt.client.SimpleTree;
import com.vaadin.terminal.gwt.client.UIDL;
import com.vaadin.terminal.gwt.client.VUIDLBrowser;

public class VUnknownComponent extends Composite implements VPaintableWidget {

    com.google.gwt.user.client.ui.Label caption = new com.google.gwt.user.client.ui.Label();;
    SimpleTree uidlTree;
    private VerticalPanel panel;
    private String serverClassName = "unkwnown";

    public VUnknownComponent() {
        panel = new VerticalPanel();
        panel.add(caption);
        initWidget(panel);
        setStyleName("vaadin-unknown");
        caption.setStyleName("vaadin-unknown-caption");
    }

    public void setServerSideClassName(String serverClassName) {
        this.serverClassName = serverClassName;
    }

    public void updateFromUIDL(UIDL uidl, ApplicationConnection client) {
        if (client.updateComponent(this, uidl, false)) {
            return;
        }
        setCaption("Widgetset does not contain implementation for "
                + serverClassName
                + ". Check its @ClientWidget mapping, widgetsets "
                + "GWT module description file and re-compile your"
                + " widgetset. In case you have downloaded a vaadin"
                + " add-on package, you might want to refer to "
                + "<a href='http://vaadin.com/using-addons'>add-on "
                + "instructions</a>. Unrendered UIDL:");
        if (uidlTree != null) {
            uidlTree.removeFromParent();
        }

        uidlTree = new VUIDLBrowser(uidl, client.getConfiguration());
        uidlTree.open(true);
        uidlTree.setText("Unrendered UIDL");
        panel.add(uidlTree);
    }

    public void setCaption(String c) {
        caption.getElement().setInnerHTML(c);
    }

    public Widget getWidgetForPaintable() {
        return this;
    }
}
