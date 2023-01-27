package com.tr.poc.service

import com.tr.poc.model.Agent

interface AgentStorageService {
    fun allAgents(): Collection<Agent>
    fun agentById(id: String): Agent?
}