/*
 * Copyright 2011 Red Hat, Inc, and individual contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.projectodd.stilts.stomp.server.protocol;

import java.util.HashMap;
import java.util.Map;

import org.projectodd.stilts.stomp.TransactionalAcknowledger;

public class AckManager {

    AckManager() {

    }

    public void registerAcknowledger(String messageId, TransactionalAcknowledger acknowledger) {
        this.acknowledgers.put( messageId, acknowledger );
    }

    TransactionalAcknowledger removeAcknowledger(String messageId) {
        return this.acknowledgers.remove( messageId );
    }
    
    private final Map<String, TransactionalAcknowledger> acknowledgers = new HashMap<String, TransactionalAcknowledger>();
}
