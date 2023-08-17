/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.iceberg.puffin;

public final class StandardBlobTypes {
  private StandardBlobTypes() {}

  /**
   * A serialized form of a "compact" Theta sketch produced by the <a
   * href="https://datasketches.apache.org/">Apache DataSketches</a> library
   */
  public static final String APACHE_DATASKETCHES_THETA_V1 = "apache-datasketches-theta-v1";

  /**
   * A serialized form of Hive column stats object. The full list of available stats are provided in
   * the <a
   * href="https://cwiki.apache.org/confluence/display/Hive/StatsDev#StatsDev-ColumnStatistics">Hive
   * columns stats wiki </a>
   */
  public static final String HIVE_COLUMN_STATS_OBJ = "hive-column-statistics-obj";

  /**
   * A serialized form of a KLL sketch produced by the <a
   * href="https://datasketches.apache.org/">Apache DataSketches</a> library
   */
  public static final String APACHE_DATASKETCHES_KLL_SKETCH = "apache-datasketches-kll-sketch";
}
