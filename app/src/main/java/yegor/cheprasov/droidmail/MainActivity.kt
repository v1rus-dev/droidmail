package yegor.cheprasov.droidmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import yegor.cheprasov.droidmail.databinding.ActivityMainBinding
import yegor.cheprasov.droidmailx.sendEmail

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sendMessage.setOnClickListener {
            sendMail()
        }
    }

    private fun sendMail() {
//        yegor.cheprasov.droidmailx.DroidMailX.Builder()
//            .smtp(SERVER_MAIL_HOST)
//            .port(SERVER_MAIL_PORT)
//            .smtpUsername(FROM_ADDRESS)
//            .smtpPassword(FROM_ADDRESS_PASSWORD)
//            .type(DroidmailXType.HTML)
//            .from(FROM_ADDRESS)
//            .to("yegorcheprasov@gmail.com")
//            .subject("Subject")
//            .body("Body")
//            .onCompleteCallback(object : yegor.cheprasov.droidmailx.DroidMailX.onCompleteCallback {
//                override fun onSuccess() {
//                    Snackbar.make(binding.root, "Email sent!", Snackbar.LENGTH_SHORT).show()
//                }
//
//                override fun onFail(errorMessage: String) {
//                    Snackbar.make(binding.root, "Email error!", Snackbar.LENGTH_SHORT).show()
//                }
//
//                override val timeout: Long
//                    get() = 4000
//            })
//            .mail()
    }

    private fun sendDsl() {
//        sendEmail {
//            smtp(SERVER_MAIL_HOST)
//            smtpUsername(FROM_ADDRESS)
//            smtpPassword(FROM_ADDRESS_PASSWORD)
//            port(SERVER_MAIL_PORT)
//            type(DroidmailXType.HTML)
//            to("virusok384@gmail.com")
//            from(FROM_ADDRESS)
//            subject("Sucject")
//            body("Message")
//            callback {
//                timeOut(3000)
//                onSuccess {
//                    showShortToast("Success")
//                }
//                onFail {
//                    showShortToast("Failed")
//                }
//            }
//        }
    }
}