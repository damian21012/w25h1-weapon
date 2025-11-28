package kr.ac.kumoh.s20220809.w25h1_weapon.controller

import kr.ac.kumoh.s20220809.w25h1_weapon.model.Weapon
import kr.ac.kumoh.s20220809.w25h1_weapon.service.WeaponService

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/weapons")
@CrossOrigin(origins = ["http://localhost:5173"])
class WeaponController(
    private val service: WeaponService
) {
    @GetMapping
    fun getAllWeapons(): List<Weapon> = service.getAllWeapons()

    @GetMapping("/{id}")
    fun getWeaponById(@PathVariable id: String): Weapon? = service.getWeaponById(id)
}