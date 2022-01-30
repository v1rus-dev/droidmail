package yegor.cheprasov.droidmailx

@DslMarker
annotation class EmailDSL

@EmailDSL
class DroidMailXBuilderDsl: DroidMailX.Builder()

@EmailDSL
class CallbackBuilderDsl: DroidMailX.onCompleteCallback.Builder()

inline fun sendEmail(buildDroidMailX: DroidMailXBuilderDsl.() -> Unit) {
    val droidMailXBuilder = DroidMailXBuilderDsl()
    droidMailXBuilder.buildDroidMailX()
    droidMailXBuilder.mail()
}

inline fun DroidMailX.Builder.callback(buildCallBack: CallbackBuilderDsl.() -> Unit) {
    val callbackBuilder = CallbackBuilderDsl()
    callbackBuilder.buildCallBack()
    val callBack = callbackBuilder.build()
    this.onCompleteCallback(callBack)
}