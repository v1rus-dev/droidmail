package yegor.cheprasov.droidmailx

@DslMarker
annotation class EmailDSL

@EmailDSL
class DroidmailXBuilderDsl: DroidMailX.Builder()

@EmailDSL
class CallbackBuilderDsl: DroidMailX.onCompleteCallback.Builder()

inline fun sendEmail(buildMaildroidX: DroidmailXBuilderDsl.() -> Unit) {
    val maildroidXBuilder = DroidmailXBuilderDsl()
    maildroidXBuilder.buildMaildroidX()
    maildroidXBuilder.mail()
}

inline fun DroidMailX.Builder.callback(buildCallBack: CallbackBuilderDsl.() -> Unit) {
    val callbackBuilder = CallbackBuilderDsl()
    callbackBuilder.buildCallBack()
    val callBack = callbackBuilder.build()
    this.onCompleteCallback(callBack)
}