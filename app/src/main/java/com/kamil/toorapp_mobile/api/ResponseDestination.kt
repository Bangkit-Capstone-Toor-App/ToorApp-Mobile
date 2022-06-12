package com.kamil.toorapp_mobile.api

import com.google.gson.annotations.SerializedName

data class ResponseDestination(

    @field:SerializedName("jenis_wisata")
    val jenisWisata: String? = null,

    @field:SerializedName("golongan_wisata")
    val golonganWisata: String? = null,

    @field:SerializedName("jenis_kegiatan")
    val jenisKegiatan: String? = null,

    @field:SerializedName("tipe_wisata")
    val tipeWisata: String? = null,

    @field:SerializedName("tujuan_khusus")
    val tujuanKhusus: String? = null,

    @field:SerializedName("jenis_lokasi")
    val jenisLokasi: String? = null,

    @field:SerializedName("rating")
    val rating: Int? = null,

    @field:SerializedName("jenis_rekreasi")
    val jenisRekreasi: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("kelompok_wisata")
    val kelompokWisata: String? = null,

    @field:SerializedName("hobi")
    val hobi: String? = null,

    @field:SerializedName("budget")
    val budget: String? = null
)