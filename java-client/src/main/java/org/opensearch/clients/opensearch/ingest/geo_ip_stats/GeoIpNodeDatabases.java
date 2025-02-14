/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch.ingest.geo_ip_stats;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

// typedef: ingest.geo_ip_stats.GeoIpNodeDatabases
public final class GeoIpNodeDatabases implements ToJsonp {
	private final List<GeoIpNodeDatabaseName> databases;

	private final List<String> filesInTemp;

	// ---------------------------------------------------------------------------------------------

	protected GeoIpNodeDatabases(Builder builder) {

		this.databases = Objects.requireNonNull(builder.databases, "databases");
		this.filesInTemp = Objects.requireNonNull(builder.filesInTemp, "files_in_temp");

	}

	/**
	 * Downloaded databases for the node.
	 *
	 * API name: {@code databases}
	 */
	public List<GeoIpNodeDatabaseName> databases() {
		return this.databases;
	}

	/**
	 * Downloaded database files, including related license files. Elasticsearch
	 * stores these files in the node’s temporary directory:
	 * $ES_TMPDIR/geoip-databases/&lt;node_id&gt;.
	 *
	 * API name: {@code files_in_temp}
	 */
	public List<String> filesInTemp() {
		return this.filesInTemp;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("databases");
		generator.writeStartArray();
		for (GeoIpNodeDatabaseName item0 : this.databases) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("files_in_temp");
		generator.writeStartArray();
		for (String item0 : this.filesInTemp) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpNodeDatabases}.
	 */
	public static class Builder implements ObjectBuilder<GeoIpNodeDatabases> {
		private List<GeoIpNodeDatabaseName> databases;

		private List<String> filesInTemp;

		/**
		 * Downloaded databases for the node.
		 *
		 * API name: {@code databases}
		 */
		public Builder databases(List<GeoIpNodeDatabaseName> value) {
			this.databases = value;
			return this;
		}

		/**
		 * Downloaded databases for the node.
		 *
		 * API name: {@code databases}
		 */
		public Builder databases(GeoIpNodeDatabaseName... value) {
			this.databases = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #databases(List)}, creating the list if needed.
		 */
		public Builder addDatabases(GeoIpNodeDatabaseName value) {
			if (this.databases == null) {
				this.databases = new ArrayList<>();
			}
			this.databases.add(value);
			return this;
		}

		/**
		 * Set {@link #databases(List)} to a singleton list.
		 */
		public Builder databases(Function<GeoIpNodeDatabaseName.Builder, ObjectBuilder<GeoIpNodeDatabaseName>> fn) {
			return this.databases(fn.apply(new GeoIpNodeDatabaseName.Builder()).build());
		}

		/**
		 * Add a value to {@link #databases(List)}, creating the list if needed.
		 */
		public Builder addDatabases(Function<GeoIpNodeDatabaseName.Builder, ObjectBuilder<GeoIpNodeDatabaseName>> fn) {
			return this.addDatabases(fn.apply(new GeoIpNodeDatabaseName.Builder()).build());
		}

		/**
		 * Downloaded database files, including related license files. Elasticsearch
		 * stores these files in the node’s temporary directory:
		 * $ES_TMPDIR/geoip-databases/&lt;node_id&gt;.
		 *
		 * API name: {@code files_in_temp}
		 */
		public Builder filesInTemp(List<String> value) {
			this.filesInTemp = value;
			return this;
		}

		/**
		 * Downloaded database files, including related license files. Elasticsearch
		 * stores these files in the node’s temporary directory:
		 * $ES_TMPDIR/geoip-databases/&lt;node_id&gt;.
		 *
		 * API name: {@code files_in_temp}
		 */
		public Builder filesInTemp(String... value) {
			this.filesInTemp = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filesInTemp(List)}, creating the list if needed.
		 */
		public Builder addFilesInTemp(String value) {
			if (this.filesInTemp == null) {
				this.filesInTemp = new ArrayList<>();
			}
			this.filesInTemp.add(value);
			return this;
		}

		/**
		 * Builds a {@link GeoIpNodeDatabases}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoIpNodeDatabases build() {

			return new GeoIpNodeDatabases(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GeoIpNodeDatabases
	 */
	public static final JsonpDeserializer<GeoIpNodeDatabases> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GeoIpNodeDatabases::setupGeoIpNodeDatabasesDeserializer);

	protected static void setupGeoIpNodeDatabasesDeserializer(DelegatingDeserializer<GeoIpNodeDatabases.Builder> op) {

		op.add(Builder::databases, JsonpDeserializer.arrayDeserializer(GeoIpNodeDatabaseName.DESERIALIZER),
				"databases");
		op.add(Builder::filesInTemp, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"files_in_temp");

	}

}
