package aoni.graph.entity

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship

@Node ("NODE_B")
data class B constructor(
    @Id @GeneratedValue val id: Long? = null, val bName:String, @Relationship(type = "B_TO_C_REL") val cList: List<C>
)