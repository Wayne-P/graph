package aoni.graph.entity

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node ("NODE_C")
data class C constructor(@Id @GeneratedValue val id: Long? = null, val cName: String)