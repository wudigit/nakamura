/*
 * Licensed to the Sakai Foundation (SF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The SF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.sakaiproject.kernel.persistence.dynamic;

import java.net.URL;
import java.util.Enumeration;

public class UrlEnumeration implements Enumeration<URL> {

  private URL url;

  public UrlEnumeration(URL url) {
    this.url = url;
  }

  public boolean hasMoreElements() {
    return url != null;
  }

  public URL nextElement() {
    URL url2 = url;
    url = null;
    return url2;
  }

}