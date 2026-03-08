package com.aayaniqbal.jetpackcomposepokedex.data.remote.responses

import com.google.gson.annotations.SerializedName
import java.io.Serial

data class GenerationIii(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen") val fireredLeafgreen: FireredLeafgreen,
    @SerializedName("ruby-sapphire") val rubySapphire: RubySapphire
)