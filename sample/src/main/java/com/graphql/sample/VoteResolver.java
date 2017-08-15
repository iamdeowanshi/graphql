package com.graphql.sample;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.sample.model.Link;
import com.graphql.sample.model.User;
import com.graphql.sample.model.Vote;
import com.graphql.sample.repository.LinkRepository;
import com.graphql.sample.repository.UserRepository;

public class VoteResolver implements GraphQLResolver<Vote> {

    private final LinkRepository linkRepository;
    private final UserRepository userRepository;

    public VoteResolver(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public User user(Vote vote) {
        return userRepository.findById(vote.getUserId());
    }

    public Link link(Vote vote) {
        return linkRepository.findById(vote.getLinkId());
    }
}

