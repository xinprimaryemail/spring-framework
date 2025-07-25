/*
 * Copyright 2002-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.jms.listener.adapter;

import jakarta.jms.BytesMessage;
import jakarta.jms.MapMessage;
import jakarta.jms.ObjectMessage;
import jakarta.jms.TextMessage;

/**
 * See the MessageListenerAdapterTests class for usage.
 *
 * @author Rick Evans
 */
public interface MessageDelegate {

	void handleMessage(TextMessage message);

	void handleMessage(MapMessage message);

	void handleMessage(BytesMessage message);

	void handleMessage(ObjectMessage message);

}
