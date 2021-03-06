package kz.qbox.sdk.data.remote.model.response.form.field.info

import kz.qbox.sdk.data.remote.model.response.form.FormResponse
import kz.qbox.sdk.data.remote.model.response.form.field.info.extension.toExtension
import kz.qbox.sdk.domain.model.form.Form

fun FormResponse.FieldResponse.InfoResponse.toFormFieldInfo(): Form.Field.Info =
    Form.Field.Info(
        extension = extension?.toExtension(),
        width =  width,
        height = height,
        duration = duration,
        dateAdded = dateAdded,
        dateModified = dateModified,
        dateTaken = dateTaken,
        size = size
    )