package com.yhx.google04affirmations.data

import com.yhx.google04affirmations.R
import com.yhx.google04affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations() :List<Affirmation>{

        return listOf<Affirmation>(
            Affirmation(R.string.affirmation01),
            Affirmation(R.string.affirmation02),
            Affirmation(R.string.affirmation03),
            Affirmation(R.string.affirmation04),
            Affirmation(R.string.affirmation05),
            Affirmation(R.string.affirmation06),
            Affirmation(R.string.affirmation07),
            Affirmation(R.string.affirmation08),
            Affirmation(R.string.affirmation09),
            Affirmation(R.string.affirmation10)
        )
    }
}