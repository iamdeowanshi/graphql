package com.graphql.sample.model;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.graphql.sample.LinkFilter;
import com.graphql.sample.repository.LinkRepository;

import java.util.List;

public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks(LinkFilter filter, Number skip, Number first) {
        return linkRepository.getAllLinks(filter, skip.intValue(), first.intValue());
    }
}