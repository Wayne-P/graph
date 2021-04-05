package aoni.graph.entity

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship

@Node ("NODE_A")
data class A constructor(
    @Id @GeneratedValue val id: Long? = null, val aName: String, @Relationship(type = "A_TO_B_REL") val b: B, @Relationship(type = "A_TO_C_REL") val c: C
)
