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
package com.vaadin.router.event;

/**
 * Any {@code com.vaadin.ui.Component} implementing this interface will be informed when they
 * have been attached to the UI and all navigation tasks have resolved.
 *
 * @author Vaadin Ltd
 */
@FunctionalInterface
public interface AfterNavigationObserver {

    /**
     * Method called after navigation has been executed.
     * 
     * @param event
     *            after navigation event with event details
     */
    void afterNavigation(AfterNavigationEvent event);
}