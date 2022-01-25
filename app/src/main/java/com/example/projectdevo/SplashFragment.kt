package com.example.projectdevo

import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.navigation.fragment.findNavController


class SplashFragment : Fragment() {

    var videoView: VideoView? = null

    var mediaController: MediaController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        // code for video view
        videoView = view.findViewById(R.id.video_view) as VideoView?


        if(mediaController == null){
           mediaController=MediaController(requireContext())
           mediaController!!.setAnchorView(this.videoView)
          }
          videoView!!.setMediaController(mediaController)



        videoView!!.setVideoURI(Uri.parse("android.resource:com.example.projectdevo//"+R.raw.devo_gif))

        // code for the splash screen
        Handler(Looper.myLooper()!!).postDelayed({
         findNavController().navigate(R.id.action_splashFragment_to_startUpFragment)
         }, 5000)
    }


}




