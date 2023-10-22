package com.ywl5320.wlmedia.sample

import android.app.Application
import com.bytedance.tools.wrangler.Wrangler

/**
 * Created by jihengyang on 2023/10/22.
 * @mail jihengyang@bytedance.com
 */
class WlMainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Wrangler.init(this)
    }
}