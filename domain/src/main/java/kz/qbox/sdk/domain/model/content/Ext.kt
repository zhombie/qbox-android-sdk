package kz.qbox.sdk.domain.model.content

import androidx.annotation.StringRes
import kz.garage.file.extension.Extension
import kz.garage.multimedia.store.model.*
import kz.qbox.sdk.domain.R

fun Content.asContentType(): ContentType? =
    when (this) {
        is Image -> ContentType.IMAGE
        is Video -> ContentType.VIDEO
        is Audio -> ContentType.AUDIO
        is Document -> ContentType.DOCUMENT
        else -> null
    }


inline val Content.PublicFile.extension: Extension?
    get() = Extension::class.java.enumConstants?.find {
        it.value == getFile()?.extension
    }

inline val Content.RemoteFile.extension: Extension?
    get() = Extension::class.java.enumConstants?.find {
        it.value == url.split("/").last().split(".").last()
    }


inline val Content.representation: Int
    @StringRes
    get() = if (this is Document) representation else -1

inline val Document.representation: Int
    @StringRes
    get() = when (publicFile?.extension ?: remoteFile?.extension) {
        Extension.TXT -> R.string.text_file
        Extension.DOC, Extension.DOCX -> R.string.microsoft_word_document
        Extension.XLS, Extension.XLSX -> R.string.microsoft_excel_document
        Extension.PPT, Extension.PPTX -> R.string.microsoft_power_point_document
        Extension.PDF -> R.string.pdf_file
        Extension.HTML -> R.string.html_text
        else -> R.string.file
    }