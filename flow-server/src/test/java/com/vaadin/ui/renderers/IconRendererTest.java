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
package com.vaadin.ui.renderers;

import org.junit.Test;

import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;

public class IconRendererTest {

    @Tag(Tag.A)
    public static class TestComponent extends Component {
    }

    @Test(expected = IllegalStateException.class)
    public void dontAllowNullInLabelGenerator() {
        IconRenderer<Object> renderer = new IconRenderer<>(
                obj -> new TestComponent(), obj -> null);
        renderer.createComponent(new Object());
    }

    @Test(expected = IllegalStateException.class)
    public void dontAllowNullInIconGenerator() {
        IconRenderer<Object> renderer = new IconRenderer<>(obj -> null,
                obj -> "");
        renderer.createComponent(new Object());
    }

}