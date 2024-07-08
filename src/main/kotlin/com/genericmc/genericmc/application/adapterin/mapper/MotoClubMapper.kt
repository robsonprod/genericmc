package com.genericmc.genericmc.application.adapterin.mapper

import com.genericmc.genericmc.application.adapterin.response.MotoClubResponse
import com.genericmc.genericmc.core.repository.entity.motoclub
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface MotoClubMapper {

    companion object {
        val INSTANCE: MotoClubMapper = Mappers.getMapper(MotoClubMapper::class.java)
    }

    fun toResponse(motoClub: motoclub): MotoClubResponse

}