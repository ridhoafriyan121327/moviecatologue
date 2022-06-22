import android.os.Parcel
import android.os.Parcelable
import android.telecom.Call
import retrofit2.http.GET

interface MovieApiInterface() : Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    @GET("/3/movie/popular?api_key=8c23d8f7de35b3c32e59b2a4ad697fc1")
    protected fun getMovieList(): Call<MovieResponse>
    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MovieApiInterface> {
        override fun createFromParcel(parcel: Parcel): MovieApiInterface {
            return MovieApiInterface(parcel)
        }

        override fun newArray(size: Int): Array<MovieApiInterface?> {
            return arrayOfNulls(size)
        }
    }
}