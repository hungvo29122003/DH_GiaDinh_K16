package com.example.appfindyourdreamhouse

import android.os.Parcel
import android.os.Parcelable

data class HousePost(
    val titleHouse : String,
    val streetName : String,
    val monthlyRent : String,
    val price : String,
    val imgHouse : Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(titleHouse)
        parcel.writeString(streetName)
        parcel.writeString(monthlyRent)
        parcel.writeString(price)
        parcel.writeInt(imgHouse)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HousePost> {
        override fun createFromParcel(parcel: Parcel): HousePost {
            return HousePost(parcel)
        }

        override fun newArray(size: Int): Array<HousePost?> {
            return arrayOfNulls(size)
        }
    }
}
