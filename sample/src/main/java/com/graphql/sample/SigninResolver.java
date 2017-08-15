package com.graphql.sample;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.sample.model.SigninPayload;
import com.graphql.sample.model.User;

public class SigninResolver implements GraphQLResolver<SigninPayload> {

    public User user(SigninPayload payload) {
        return payload.getUser();
    }
}