package com.genericmc.genericmc.application.adapterin.controller;

import com.genericmc.genericmc.application.adapterin.response.MotoClubResponse
import com.genericmc.genericmc.domain.portin.MotoClubPortIn
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class InicialController(private val motoClubPortIn: MotoClubPortIn) {

    private val logger = KotlinLogging.logger {}

    @GetMapping("/motoclubs")
    fun getAllMotoClubs(): List<MotoClubResponse> {
        logger.info { "TEste" }

        return motoClubPortIn.findAllMotoClubs()
    }

}
