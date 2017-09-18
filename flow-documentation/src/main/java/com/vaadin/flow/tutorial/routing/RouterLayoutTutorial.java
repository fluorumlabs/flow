/*
 * Copyright 2000-2017 Vaadin Ltd.
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
package com.vaadin.flow.tutorial.routing;

import com.vaadin.annotations.ParentLayout;
import com.vaadin.annotations.Route;
import com.vaadin.annotations.Tag;
import com.vaadin.flow.html.Div;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.tutorial.annotations.CodeFor;
import com.vaadin.ui.Component;

@CodeFor("routing/tutorial-router-layout.asciidoc")
public class RouterLayoutTutorial {

    @Tag("div")
    @Route(value = "company", layout = MainLayout.class)
    public class CompanyComponent extends Component {
    }


    public class MainLayout extends Div implements RouterLayout {
    }

    @ParentLayout(MainLayout.class)
    public class MenuBar extends Div implements RouterLayout {
        public MenuBar() {
            addMenuElement(TutorialView.class, "Tutorial");
            addMenuElement(IconsView.class, "Icons");
        }
        private void addMenuElement(Class<? extends Component> navigationTarget, String name) {
            // implementation omitted
        }
    }

    @Route(value = "tutorial", layout = MenuBar.class)
    public class TutorialView extends Div {
    }

    @Route(value="icons", layout = MenuBar.class)
    public class IconsView extends Div {
    }
}