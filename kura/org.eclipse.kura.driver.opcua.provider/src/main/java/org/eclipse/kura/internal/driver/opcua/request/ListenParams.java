/**
 * Copyright (c) 2018, 2019 Eurotech and/or its affiliates and others
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.kura.internal.driver.opcua.request;

import java.util.Map;

import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;

public abstract class ListenParams extends ReadParams {

    public ListenParams(final Map<String, Object> channelConfig) {
        super(channelConfig);
    }

    public ListenParams(final ReadValueId readValueId) {
        super(readValueId);
    }

    public abstract double getSamplingInterval();

    public abstract long getQueueSize();

    public abstract boolean getDiscardOldest();
}
