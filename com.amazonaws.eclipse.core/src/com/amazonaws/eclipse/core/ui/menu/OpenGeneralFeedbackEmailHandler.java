/*
 * Copyright 2010-2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.core.ui.menu;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.amazonaws.eclipse.core.diagnostic.utils.EmailMessageLauncher;

/**
 * Handler for the "com.amazonaws.eclipse.command.openGeneralFeedbackEmail"
 * (Report Bug or Enhancement) command.
 */
public class OpenGeneralFeedbackEmailHandler extends AbstractHandler {

    public Object execute(ExecutionEvent event) throws ExecutionException {
        EmailMessageLauncher.createEmptyFeedbackEmail().open();
        return null;
    }
}