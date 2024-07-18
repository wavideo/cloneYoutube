package com.example.cloneyoutube

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.cloneyoutube.databinding.FragmentVideoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_VIDEO_DATA = "video_data"
private const val ARG_TV_TITLE = "tv_title"

/**
 * A simple [Fragment] subclass.
 * Use the [VideoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VideoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var videoData: VideoData? = null
    private var tvTitle: String? = null
    private val binding by lazy { FragmentVideoBinding.inflate(layoutInflater) }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            videoData = it.getParcelable(ARG_VIDEO_DATA)
            tvTitle = it.getString(ARG_TV_TITLE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivThumb.setImageResource(videoData!!.thumb)
        binding.tvTitle.text = tvTitle

        val viewNumSimple = simplizeViewNum(videoData!!.viewNum)
        val uploadDateTimeSimple = simplizeDateTime(videoData!!.yy, videoData!!.MM, videoData!!.dd, videoData!!.hh, videoData!!.mm)
        binding.tvData.text = "${viewNumSimple}  ${uploadDateTimeSimple}  더보기"

        binding.ivChIcon.setImageResource(videoData!!.chIcon)
        binding.tvChName.text = videoData!!.chName
        val subscriberNumSimple = simplizeSubscridberNum(videoData!!.subscriberNum)
        binding.tvChData.text = "${subscriberNumSimple}"
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment VideoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(video_data: VideoData, tv_title: String) =
            VideoFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_VIDEO_DATA, video_data)
                    putString(ARG_TV_TITLE, tv_title)
                }
            }
    }
}