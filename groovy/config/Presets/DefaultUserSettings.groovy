/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
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

import javax.vecmath.Vector2f
import org.lwjgl.opengl.PixelFormat
import org.lwjgl.opengl.DisplayMode

Game{
    Graphics{
        maxParticles = 256
        cloudResolution = new Vector2f(128, 128)
        cloudUpdateInterval = (Integer) 8000
        maxThreads = 2
        saveChunks = true
        chunkCacheSize = 2048
        maxChunkVBOs = 512
        gamma = 2.2d
        pixelFormat = new PixelFormat().withDepthBits(24)
        displayMode = new DisplayMode(1280, 720)
        fullscreen = false;
        viewingDistanceNear = 8
        viewingDistanceModerate = 16
        viewingDistanceFar = 26
        viewingDistanceUltra = 32
        enablePostProcessingEffects = true
        animatedWaterAndGrass = true
        verticalChunkMeshSegments = 1
    }
    Controls{
        mouseSens = 0.075d
    }
    Player {
        fov = 86.0d
        cameraBobbing = true
        renderFirstPersonView = true
    }
    HUD{
        placingBox = true
    }
}