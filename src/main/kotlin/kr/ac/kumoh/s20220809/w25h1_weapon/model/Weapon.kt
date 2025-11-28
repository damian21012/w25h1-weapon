package kr.ac.kumoh.s20220809.w25h1_weapon.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "weapons")
data class Weapon(
    @Id val id: String? = null,
    val name: String,
    val tier: String,
    val item_power: Int,
    val identifier: String,
    val icon: String,
)
