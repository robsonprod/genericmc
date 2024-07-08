package com.genericmc.genericmc.application.adapterin.response


data class MotoClubResponse(
    val id: Long = 0,
    val name: String
) {
    companion object {
        fun builder() = Builder()
    }

    class Builder {
        private var id: Long = 0
        private var name: String = ""

        fun id(id: Long) = apply { this.id = id }
        fun name(name: String) = apply { this.name = name }

        fun build() = MotoClubResponse(id, name)
    }
}