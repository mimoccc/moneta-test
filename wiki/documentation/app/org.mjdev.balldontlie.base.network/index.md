//[app](../../index.md)/[org.mjdev.balldontlie.base.network](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [CacheInterceptor](-cache-interceptor/index.md) | [androidJvm]<br>class [CacheInterceptor](-cache-interceptor/index.md)(maxAge: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, timeUnit: [TimeUnit](https://developer.android.com/reference/kotlin/java/util/concurrent/TimeUnit.html) = TimeUnit.HOURS) : Interceptor<br>Cache interceptor. Made to cache result from internet. Basically for an one hour, to avoid multiple calls. |
| [ConectivityCallback](-conectivity-callback/index.md) | [androidJvm]<br>class [ConectivityCallback](-conectivity-callback/index.md)(val trySend: (data: [NetworkStatus](-network-status/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) : [ConnectivityManager.NetworkCallback](https://developer.android.com/reference/kotlin/android/net/ConnectivityManager.NetworkCallback.html) |
| [NetworkConnectivityService](-network-connectivity-service/index.md) | [androidJvm]<br>interface [NetworkConnectivityService](-network-connectivity-service/index.md) |
| [NetworkConnectivityServiceImpl](-network-connectivity-service-impl/index.md) | [androidJvm]<br>class [NetworkConnectivityServiceImpl](-network-connectivity-service-impl/index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) : [NetworkConnectivityService](-network-connectivity-service/index.md) |
| [NetworkStatus](-network-status/index.md) | [androidJvm]<br>sealed class [NetworkStatus](-network-status/index.md) |
