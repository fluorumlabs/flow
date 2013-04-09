/*
 * Copyright 2000-2013 Vaadin Ltd.
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

package com.vaadin.client.ui;

/**
 * Some Widgets need to handle the required handling for WAI-ARIA themselfs, as
 * this attribute needs to be set to the input element itself. In such a case,
 * the Widget needs to implement this interface.
 */
public interface HandlesAriaRequired {
    /**
     * Called to set the element, typically an input element, as required.
     * 
     * @param required
     *            boolean true when the element needs to be set as required
     */
    void setRequired(boolean required);
}
