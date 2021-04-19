package com.yhx.google04affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/*
* Make Affirmation a data class by adding the data keyword before the class definition.
* Add a val integer parameter stringResourceId to the constructor of the Affirmation class.
* Modify the constructor of the Affirmation class by adding another Int parameter named imageResourceId.
* */
data class Affirmation(
        @StringRes val stringResourceId: Int,
        @DrawableRes val imageResourceId: Int) {

}