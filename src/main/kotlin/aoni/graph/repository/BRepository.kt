package aoni.graph.repository

import aoni.graph.entity.B
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface BRepository : Neo4jRepository<B, Long>


