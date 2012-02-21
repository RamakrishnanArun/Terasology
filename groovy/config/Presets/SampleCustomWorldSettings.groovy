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

World{
    Physics{
        maxGravity = 1.0d
        maxGravitySwimming = 0.04d
        gravity = 0.008d
        gravitySwimming = 0.008d * 4d
        friction = 0.15d
        walkingSpeed = 0.025d
        runningFactor = 1.5d
        jumpIntensity = 0.16d
    }
    Biomes {
        Forest{
            grassDensity = 0.3d
        }
        Plains{
            grassDensity = 0.1d
        }
        Snow{
            grassDensity = 0.001d
        }
        Mountains{
            grassDensity = 0.2d
        }
        Desert{
            grassDensity = 0.001d
        }
    }
    DiurnalCycle{
        dayNightLengthInMs = new Long((60 * 1000) * 30) // 30 minutes in ms
        initialTimeOffsetInMs = new Long(60 * 1000) // 60 seconds in ms
    }
    Creation{
        spawnOrigin = new Vector2f(-24429, 20547)
        defaultSeed = "Pinkie Pie!"
    }
}