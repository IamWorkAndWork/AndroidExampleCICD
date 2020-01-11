package app.practice.example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun computeResult(
        interestedRate: Float,
        currentAge: Int,
        retirementAge: Int,
        monthlySaving: Int,
        currentSaving: Int
    ) {

        val result =
            "InterestedRate = ${interestedRate}, currentAge = $currentAge, retirementAge = ${retirementAge}, " +
                    "monthlySaving = $monthlySaving, currentSaving = $currentSaving"

        _result.value = result
    }

}