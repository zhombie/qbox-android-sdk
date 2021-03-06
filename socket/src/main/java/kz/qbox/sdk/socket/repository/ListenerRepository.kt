package kz.qbox.sdk.socket.repository

import kz.qbox.sdk.socket.listener.*

interface ListenerRepository {
    fun setSocketStateListener(listener: SocketStateListener?)
    fun setCoreListener(listener: CoreListener?)
    fun setChatBotListener(listener: ChatBotListener?)
    fun setCallListener(listener: CallListener?)
    fun setFormListener(listener: FormListener?)
    fun setWebRTCListener(listener: WebRTCListener?)
    fun setARMListener(listener: ARMListener?)
    fun setTaskListener(listener: TaskListener?)

    fun removeAllListeners()
}