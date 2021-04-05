package aoni.graph.repository

import aoni.graph.entity.C
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface CRepository : Neo4jRepository<C, Long>


