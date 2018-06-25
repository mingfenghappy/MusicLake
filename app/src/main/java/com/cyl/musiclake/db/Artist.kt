package com.cyl.musiclake.db

import com.cyl.musiclake.data.db.Music
import org.litepal.crud.LitePalSupport
import java.util.*

/**
 * Created by yonglong on 2016/11/23.
 */

class Artist : LitePalSupport {
    var name: String? = null
    var id: Long = 0
    var count: Int = 0
    var picUrl: String? = null
    var musicSize: Int = 0
    var score: Int = 0
    var albumSize: Int = 0

    var songs: List<Music> = ArrayList()

    constructor() {}

    constructor(id: Long, name: String, count: Int) {
        this.name = name
        this.id = id
        this.musicSize = count
    }
}