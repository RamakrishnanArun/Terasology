/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rendering.world.viewDistance;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.ReceiveEvent;
import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterMode;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.network.Client;
import org.terasology.network.ClientComponent;
import org.terasology.network.NetworkSystem;
import org.terasology.registry.In;
import org.terasology.world.chunks.ChunkProvider;

/**
 * Handles view distance changes on the server
 */
@RegisterSystem(RegisterMode.AUTHORITY)
public class ServerViewDistanceSystem extends BaseComponentSystem {

    @In
    private NetworkSystem networkSystem;

    @In
    private ChunkProvider chunkProvider;

    @ReceiveEvent(components = ClientComponent.class)
    public void onChangeViewDistanceChanged(ViewDistanceChangedEvent request, EntityRef entity) {
        Client client = networkSystem.getOwner(entity);
        if (client != null) {
            client.setViewDistanceMode(request.getNewViewRange());
            chunkProvider.updateRelevanceEntity(entity, client.getViewDistance().getChunkDistance());
        }
    }

}