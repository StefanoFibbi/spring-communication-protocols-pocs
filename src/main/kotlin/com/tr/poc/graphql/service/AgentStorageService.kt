package com.tr.poc.graphql.service

import com.tr.poc.graphql.model.Agent

interface AgentStorageService {
    fun allAgents(): Collection<Agent>
    fun agentById(id: String): Agent?
}