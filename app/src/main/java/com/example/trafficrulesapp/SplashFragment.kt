package com.example.trafficrulesapp


import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieAnimationView

class SplashFragment : Fragment() {

    private lateinit var lottieAnimationView: LottieAnimationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        lottieAnimationView = view.findViewById(R.id.lottieAnimationView)

        lottieAnimationView.setAnimation(R.raw.signal)
        lottieAnimationView.playAnimation()

        // Delay the navigation after 5 seconds
        Handler().postDelayed({
            navigateToIntroFragment()
        }, 5000) // 5000 milliseconds = 5 seconds

        return view
    }

    private fun navigateToIntroFragment() {
        val navController = findNavController()
        navController.navigate(R.id.action_splashFragment_to_introFragment)
    }
}
