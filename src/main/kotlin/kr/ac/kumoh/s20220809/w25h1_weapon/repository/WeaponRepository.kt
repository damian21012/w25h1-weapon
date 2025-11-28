package kr.ac.kumoh.s20220809.w25h1_weapon.repository

import kr.ac.kumoh.s20220809.w25h1_weapon.model.Weapon
import org.springframework.data.mongodb.repository.MongoRepository

interface WeaponRepository : MongoRepository<Weapon, String> {
    // 원하는 대로 커스텀 쿼리 추가 가능

    fun findByName(name: String): List<Weapon>
}