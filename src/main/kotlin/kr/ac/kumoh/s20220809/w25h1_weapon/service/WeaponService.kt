package kr.ac.kumoh.s20220809.w25h1_weapon.service

import kr.ac.kumoh.s20220809.w25h1_weapon.model.Weapon
import kr.ac.kumoh.s20220809.w25h1_weapon.repository.WeaponRepository
import org.springframework.stereotype.Service

@Service
class WeaponService(
    private val repository: WeaponRepository
) {
    fun getAllWeapons(): List<Weapon> = repository.findAll()
    fun getWeaponById(id: String): Weapon? = repository.findById(id).orElse(null)
}