package com.genericmc.genericmc.domain.portin

import com.genericmc.genericmc.application.adapterin.response.MotoClubResponse


interface MotoClubPortIn {
    fun findAllMotoClubs(): List<MotoClubResponse>
}