package app.practice.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.analytics.Analytics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCalculate.setOnClickListener {

            //            Analytics.trackEvent("btSayHello Clicked");

            try {
                val interestedRate = editTxtInterestRate.text.toString().toFloat()
                val currentAge = editTxtYourCurrentAge.text.toString().toInt()
                val retirementAge = editTxtPlannedRetirementAge.text.toString().toInt()
                val monthlySaving = editTxtMonthlySaving.text.toString().toInt()
                val currentSaving = editTxtCurrentSaving.text.toString().toInt()

                val properties = hashMapOf<String, String>()
                properties.put("interested_rate", interestedRate.toString())
                properties.put("current_age", currentAge.toString())
                properties.put("retirement_age", retirementAge.toString())
                properties.put("monthly_saving", monthlySaving.toString())
                properties.put("current_saving", currentSaving.toString())

                if (interestedRate <= 0) {
                    Analytics.trackEvent("wrong_interested_age", properties)
                }

                if (retirementAge <= currentAge) {
                    Analytics.trackEvent("wrong_age", properties)
                }

                txtResult.text =
                    "InterestedRate = ${interestedRate}, currentAge = $currentAge, retirementAge = ${retirementAge}, " +
                            "monthlySaving = $monthlySaving, currentSaving = $currentSaving"

            } catch (e: Exception) {
                Analytics.trackEvent(e.message)
            }


//            throw Exception("Something went wrong")
//            Crashes.generateTestCrash()
        }

    }

}
