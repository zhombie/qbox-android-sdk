package kz.inqbox.sdk.sample

import kz.garage.activity.intent.startActivity
import kz.garage.kotlin.simpleNameOf
import kz.inqbox.sdk.sample.samples.socket.SocketActivity
import kz.inqbox.sdk.sample.samples.webrtc.WebRTCActivity

class MainActivity : BaseNestedModuleActivity() {

    companion object {
        private val TAG = simpleNameOf<MainActivity>()
    }

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun getHeaderTitle(): String = "Entry Point"

    override fun getSamples(): List<Sample> =
        listOf(
            Sample("socket", "Socket", null),
            Sample("webrtc", "WebRTC", null),
        )

    override fun onSampleClicked(sample: Sample) {
        when (sample.id) {
            "socket" ->
                startActivity<SocketActivity>()
            "webrtc" ->
                startActivity<WebRTCActivity>()
        }
    }

}