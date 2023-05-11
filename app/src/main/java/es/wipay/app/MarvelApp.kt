package es.wipay.app

import android.app.Application
import android.content.Intent
import es.wipay.presentation.ui.activities.LoginActivity

class MarvelApp : Application() {
	override fun onCreate() {
		super.onCreate()
		val intent = Intent(applicationContext, LoginActivity::class.java)
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
		startActivity(intent)
	}
}