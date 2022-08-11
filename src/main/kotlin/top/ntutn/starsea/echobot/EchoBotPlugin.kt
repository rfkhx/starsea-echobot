package top.ntutn.starsea.echobot

import com.google.auto.service.AutoService
import top.ntutn.starseasdk.v1.BotContentProvider
import top.ntutn.starseasdk.v1.TextChatContext

@AutoService(BotContentProvider::class)
class EchoBotPlugin: BotContentProvider {
    override val pluginName: String
        get() = "echo bot"

    override fun onTextMessage(context: TextChatContext): Boolean {
        context.replyWithText(context.text)
        return true
    }
}