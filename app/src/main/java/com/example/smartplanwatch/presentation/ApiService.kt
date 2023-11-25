import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("exampleEndpoint")
    fun getExampleData(): Call<YourModelClass>
}

class YourModelClass {

}
