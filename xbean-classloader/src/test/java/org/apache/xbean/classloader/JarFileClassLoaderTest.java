/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.xbean.classloader;

import java.net.URL;

/**
 * Test the JarFileClassLoader.
 *
 * @author Dain Sundstrom
 * @version $Id: JarFileClassLoaderTest.java 437551 2006-08-28 06:14:47Z adc $
 * @since 2.0
 */
public class JarFileClassLoaderTest extends MultiParentClassLoaderTest {
    protected MultiParentClassLoader createClassLoader(String name, URL[] urls, ClassLoader[] parents) {
        return new JarFileClassLoader(name, urls, parents);
    }
}
