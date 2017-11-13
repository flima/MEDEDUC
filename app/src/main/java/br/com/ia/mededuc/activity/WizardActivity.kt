package br.com.ia.mededuc.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import br.com.ia.mededuc.R
import kotlinx.android.synthetic.main.activity_wizard.*
import org.jetbrains.anko.startActivity

class WizardActivity : AppCompatActivity() {

    private var currentStepWizard: Int = 0
    private val maxStepWizard: Int by lazy { resources.getStringArray(R.array.wizard_introduction_messages).size }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_wizard)
        setupView()
    }

    private fun setupView() {
        txtMessage.text = resources.getStringArray(R.array.wizard_introduction_messages)[currentStepWizard]
        btnNext.text = resources.getStringArray(R.array.wizard_button_text)[currentStepWizard]
        btnNext.setOnClickListener {

            if(++currentStepWizard < maxStepWizard){
                txtMessage.text = resources.getStringArray(R.array.wizard_introduction_messages)[currentStepWizard]
                btnNext.text = resources.getStringArray(R.array.wizard_button_text)[currentStepWizard]
            } else {
                startActivity<HomeActivity>()
            }

        }
    }

}
