package com.genericmc.genericmc.domain.service;

import com.genericmc.genericmc.application.adapterin.mapper.MotoClubMapper
import com.genericmc.genericmc.application.adapterin.response.MotoClubResponse
import com.genericmc.genericmc.core.repository.MotoClubRepository
import com.genericmc.genericmc.domain.portin.MotoClubPortIn
import mu.KotlinLogging
import org.springframework.stereotype.Service

@Service
class MotoClubUseCase(private val motoClubRepository: MotoClubRepository) : MotoClubPortIn {

    private val logger = KotlinLogging.logger {}
    private val mapper = MotoClubMapper.INSTANCE

    override fun findAllMotoClubs(): List<MotoClubResponse> {
        logger.info { "Getting all MotoClubs" }

        val motoClubs = motoClubRepository.findAll()

        logger.info { "End" }

        return motoClubs.map { mapper.toResponse(it) }
    }

}
