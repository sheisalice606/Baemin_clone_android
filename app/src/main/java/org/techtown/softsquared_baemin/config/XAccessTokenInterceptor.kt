package org.techtown.softsquared_baemin.config

import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.X_ACCESS_TOKEN
import org.techtown.softsquared_baemin.config.ApplicationClass.Companion.sSharedPreferences
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class XAccessTokenInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {

        val builder: Request.Builder = chain.request().newBuilder()

        val jwtToken: String? = sSharedPreferences.getString(X_ACCESS_TOKEN, null)
        // jwt 토큰이 필요없는 상황 발급받지 않는다


        if (jwtToken != null) {
            builder.addHeader("X-ACCESS-TOKEN", jwtToken)
        }

        return chain.proceed(builder.build())

    }
}