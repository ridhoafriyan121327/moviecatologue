import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
    data class MovieResponse(
    @SerializedName("results")
    val movies : List<Movie>

) : Parcelable {
    constructor() : this(mutableListOf())

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }
}