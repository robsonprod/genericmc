package com.genericmc.genericmc.core.repository

import com.genericmc.genericmc.core.repository.entity.motoclub
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MotoClubRepository : JpaRepository<motoclub, Long> {

}