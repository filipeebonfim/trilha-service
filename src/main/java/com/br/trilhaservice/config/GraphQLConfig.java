package com.br.trilhaservice.config;

import com.br.trilhaservice.gateway.database.repository.TrilhaRDBRepository;
import graphql.schema.DataFetcher;
import graphql.schema.GraphQLScalarType;
import graphql.schema.idl.SchemaDirectiveWiring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.data.query.QuerydslDataFetcher;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

@Configuration
public class GraphQLConfig {

//    @Bean
//    public RuntimeWiringConfigurer runtimeWiringConfigurer(final TrilhaRDBRepository repository) {
//
//        GraphQLScalarType scalarType = GraphQLScalarType.newScalar().build() ;
//        SchemaDirectiveWiring directiveWiring = ... ;
//        DataFetcher dataFetcher = QuerydslDataFetcher.builder(repository).single();
//
//        return wiringBuilder -> wiringBuilder
//                .scalar(scalarType)
//                .directiveWiring(directiveWiring)
//                .type("Query", builder -> builder.dataFetcher("book", dataFetcher));
//    }
}
