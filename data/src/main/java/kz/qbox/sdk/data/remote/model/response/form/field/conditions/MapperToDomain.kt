package kz.qbox.sdk.data.remote.model.response.form.field.conditions

import kz.qbox.sdk.data.remote.model.response.form.FormResponse
import kz.qbox.sdk.domain.model.form.Form

fun FormResponse.FieldResponse.ConditionsResponse.toFormFieldConditions(): Form.Field.Conditions =
    Form.Field.Conditions(
        keyboard?.map {
            Form.Field.Conditions.Condition(
                payload = it.payload,
                nextStep = it.nextStep,
                showSteps = it.showSteps,
                hideSteps = it.hideSteps
            )
        }
    )
