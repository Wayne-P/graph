package aoni.graph

import aoni.graph.entity.A
import aoni.graph.entity.B
import aoni.graph.entity.C
import aoni.graph.repository.ARepository
import aoni.graph.repository.BRepository
import aoni.graph.repository.CRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GraphApplication {
    @Bean
    fun init(aRepository: ARepository, bRepository: BRepository, cRepository: CRepository): CommandLineRunner {
        return CommandLineRunner {
            val c1 = C(cName = "c1")
            val c2 = C(cName = "c2")
            val b1 = B(bName = "b1", cList = listOf(c1, c2))
            val a1 = A(aName = "a1", b = b1, c = c1)

            aRepository.deleteAll()
            bRepository.deleteAll()
            cRepository.deleteAll()

            aRepository.save<A>(a1)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<GraphApplication>(*args)
}
