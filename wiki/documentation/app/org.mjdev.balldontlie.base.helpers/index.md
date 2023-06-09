//[app](../../index.md)/[org.mjdev.balldontlie.base.helpers](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [Ext](-ext/index.md) | [androidJvm]<br>object [Ext](-ext/index.md) |
| [ListPagingSource](-list-paging-source/index.md) | [androidJvm]<br>class [ListPagingSource](-list-paging-source/index.md)&lt;[T](-list-paging-source/index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;(source: [SOURCE](index.md#1428666533%2FClasslikes%2F-912451524)&lt;[T](-list-paging-source/index.md)&gt; = { _, _ -&gt; emptyList() }, maxRetryCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = DEFAULT_MAX_RETRY_COUNT, retryDelay: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = DEFAULT_RETRY_DELAY) : [PagingSource](https://developer.android.com/reference/kotlin/androidx/paging/PagingSource.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [T](-list-paging-source/index.md)&gt; <br>List paging source. |
| [OverlayImagePainter](-overlay-image-painter/index.md) | [androidJvm]<br>class [OverlayImagePainter](-overlay-image-painter/index.md)(image: [ImageBitmap](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/ImageBitmap.html), imageOverlay: [ImageBitmap](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/ImageBitmap.html), srcOffset: [IntOffset](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/IntOffset.html) = IntOffset.Zero, srcSize: [IntSize](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/IntSize.html) = IntSize(image.width, image.height), overlaySize: [IntSize](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/IntSize.html) = IntSize(imageOverlay.width, imageOverlay.height)) : [Painter](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/painter/Painter.html) |
| [SOURCE](index.md#1428666533%2FClasslikes%2F-912451524) | [androidJvm]<br>typealias [SOURCE](index.md#1428666533%2FClasslikes%2F-912451524)&lt;[T](index.md#1428666533%2FClasslikes%2F-912451524)&gt; = suspend (page: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), cnt: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) -&gt; [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](index.md#1428666533%2FClasslikes%2F-912451524)&gt;<br>Type alias for handler of source data in list. |

## Functions

| Name | Summary |
|---|---|
| [OverlayImage](-overlay-image.md) | [androidJvm]<br>@[Preview](https://developer.android.com/reference/kotlin/androidx/compose/ui/tooling/preview/Preview.html)<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [OverlayImage](-overlay-image.md)() |
