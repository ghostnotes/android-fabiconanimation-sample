package co.ghostnotes.sample.fabiconanimation.ui

import android.content.Context
import android.graphics.drawable.AnimatedVectorDrawable
import android.support.annotation.VisibleForTesting
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import co.ghostnotes.sample.fabiconanimation.R

class PlayImageView(context: Context, attributeSet: AttributeSet): ImageView(context, attributeSet) {

    init {
        setOnClickListener(OnPlayClickListener())
        setImageDrawable(context.getDrawable(R.drawable.avd_play_obliqueline))
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    class OnPlayClickListener: OnClickListener {
        override fun onClick(v: View?) {
            val playImageView = v as? PlayImageView ?: throw IllegalArgumentException("view is not PlayImageView.")
            (playImageView.drawable as AnimatedVectorDrawable).start()
        }
    }

}