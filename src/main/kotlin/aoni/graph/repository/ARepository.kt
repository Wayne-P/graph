package aoni.graph.repository

import aoni.graph.entity.A
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface ARepository : Neo4jRepository<A, Long>



