package com.yuroyami.syncplay.lyricist.localizations

import com.yuroyami.syncplay.lyricist.Strings
import com.yuroyami.syncplay.utils.format

val ZhStrings = object : Strings {
    override val yes = "是的"
    override val no = "不"
    override val okay = "好"
    override val cancel = "取消"
    override val dontShowAgain = "下次不再显示"
    override val play = "播放"
    override val pause = "暂停"
    override val delete = "删除"
    override val confirm = "确认"
    override val done = "完成"
    override val close = "关闭"
    override val off = "关闭"
    override val on = "开启"
    override val tabConnect = "连接"
    override val tabSettings = "设置"
    override val tabAbout = "关于"
    override val connectUsernameA = "输入您的用户名:"
    override val connectUsernameB = "用户名"
    override val connectUsernameC = "随意输入"
    override val connectRoomnameA = "输入房间名称:"
    override val connectRoomnameB = "房间名称"
    override val connectRoomnameC = "你和你的朋友可以观看的房间"
    override val connectServerA = "选择Syncplay服务器:"
    override val connectServerB = "服务器地址"
    override val connectServerC = "确保你和你的朋友加入同一个服务器."
    override val connectButtonJoin = "加入/创建房间"
    override val connectButtonSaveshortcut = "保存当前配置为主屏幕快捷方式"
    override val connectButtonCurrentEngine = { p0: String -> "当前引擎：%s".format(p0) }
    override val connectFootnote = "Syncplay的非官方Android客户端"
    override val connectUsernameEmptyError = "用户名不能为空"
    override val connectRoomnameEmptyError = "房间名称不能为空"
    override val connectAddressEmptyError = "服务器地址不应为空"
    override val connectPortEmptyError = "请输入端口号！"
    override val connectEnterCustomServer = "输入自定义服务器"
    override val connectCustomServerPassword = "密码(如不需要，则为空)"
    override val connectPort = "端口"
    override val connectNightmodeswitch = "切换日/夜间模式。"
    override val connectSolomode = "进入单人模式（仅视频播放器）。"
    override val roomSelectedVid = { p0: String -> "选择的视频文件: %s".format(p0) }
    override val roomSelectedSub = { p0: String -> "选择的字幕文件: %s".format(p0) }
    override val roomSelectedSubError = "无效的字幕文件.支持的格式有: 'SRT', 'TTML', 'ASS', 'SSA', 'VTT'"
    override val roomSubErrorLoadVidFirst = "第一次加载视频"
    override val roomTypeMessage = "输入你要说的内容…"
    override val roomReady = "准备"
    override val roomNotReady = "未准备"
    override val roomPingConnected = { p0: String -> "连接 - 延迟: %s ms".format(p0) }
    override val roomPingDisconnected = "断开连接"
    override val roomEmptyMessageError = "发送内容为空!"
    override val roomAttemptingConnect = { p0: String, p1: String -> "试图连接到 %1s:%2s".format(p0, p1) }
    override val roomConnectedToServer = "已连接到服务器."
    override val roomConnectionFailed = "未能连接到服务器."
    override val roomAttemptingReconnection = "与服务器失去连接,正在尝试重新连接…"
    override val roomAttemptingTls = "尝试建立安全连接"
    override val roomTlsSupported = "安全连接已建立（TLS）"
    override val roomTlsNotSupported = "服务器不支持 TLS"

    override val roomGuyPlayed = { p0: String -> "%s 恢复播放".format(p0) }
    override val roomGuyPaused = { p0: String, p1: String -> "%1s 暂停 在 %2s".format(p0, p1) }
    override val roomSeeked = { p0: String, p1: String, p2: String -> "%1s 跳转 从 %2s 到 %3s".format(p0, p1, p2) }
    override val roomRewinded = { p0: String -> "由于播放时间差距大而倒退 %s".format(p0) }
    override val roomGuyLeft = { p0: String -> "%s 离开房间.".format(p0) }
    override val roomGuyJoined = { p0: String -> "%s 您已经加入聊天室.".format(p0) }
    override val roomIsplayingfile = { p0: String, p1: String, p2: String -> "%1s 正在播放 '%2s' (%3s)".format(p0, p1, p2) }
    override val roomYouJoinedRoom = { p0: String -> "你已经加入聊天室: %s".format(p0) }
    override val roomScalingFitScreen = "调整尺寸: 适合屏幕"
    override val roomScalingFixedWidth = "调整尺寸: 固定宽度"
    override val roomScalingFixedHeight = "调整尺寸: 固定高度"
    override val roomScalingFillScreen = "调整尺寸: 铺满屏幕"
    override val roomScalingZoom = "调整尺寸: 裁剪放大"
    override val roomSubTrackChanged = { p0: String -> "字幕轨道更改为: %s".format(p0) }
    override val roomAudioTrackChanged = { p0: String -> "音轨更改为: %s".format(p0) }
    override val roomAudioTrackNotFound = "没有发现音频 !"
    override val roomSubTrackDisable = "禁用字幕"
    override val roomTrackTrack = "轨道"
    override val roomSubTrackNotfound = "没有发现字幕 !"
    override val roomDetailsCurrentRoom = { p0: String -> "当前的房间: %s".format(p0) }
    override val roomDetailsNofileplayed = "(没有播放视频)"
    override val roomDetailsFileProperties = { p0: String, p1: String ->"时长: %1s - 大小: %2s MBs".format(p0, p1) }
    override val roomFileMismatchWarningCore = { p0: String -> "你的文件不同于 %s's 请按照以下方式进行归档:".format(p0) }
    override val roomFileMismatchWarningName = "名称."
    override val roomFileMismatchWarningDuration = "时长."
    override val roomFileMismatchWarningSize = "大小."
    override val roomSharedPlaylist = "房间的分享播放列表"
    override val roomSharedPlaylistBrief = "导入一个文件或一个目录，包括文件名到播放列表. 单击文件链接，让所有用户播放它."
    override val roomSharedPlaylistUpdated = { p0: String -> "%s 更新播放列表".format(p0) }
    override val roomSharedPlaylistChanged = { p0: String -> "%s 更改了当前选择的播放列表".format(p0) }
    override val roomSharedPlaylistNoDirectories = "您没有为共享播放列表指定任何媒体目录. 手动添加文件."
    override val roomSharedPlaylistNotFound = "Syncplay找不到当前正在媒体目录中的共享播放列表中播放的文件."
    override val roomSharedPlaylistNotFeatured = "此房间或服务器没有共享播放列表功能."
    override val roomSharedPlaylistButtonAddFile = "添加文件到播放列表底部"
    override val roomSharedPlaylistButtonAddFolder = "将文件夹添加到播放列表（和媒体目录）"
    override val roomSharedPlaylistButtonAddUrl = "将URL添加到播放列表底部"
    override val roomSharedPlaylistButtonShuffle = "打乱整个播放列表"
    override val roomSharedPlaylistButtonShuffleRest = "打乱剩余播放列表"
    override val roomSharedPlaylistButtonOverflow = "更多共享播放列表设置"
    override val roomSharedPlaylistButtonPlaylistImport = "从文件加载播放列表"
    override val roomSharedPlaylistButtonPlaylistImportNShuffle = "从文件加载并打乱播放列表"
    override val roomSharedPlaylistButtonPlaylistExport = "将播放列表保存到文件"
    override val roomSharedPlaylistButtonSetMediaDirectories = "设置媒体目录"
    override val roomSharedPlaylistButtonSetTrustedDomains = "设置受信任的域"
    override val roomSharedPlaylistButtonUndo = "撤销最后的更改"
    override val roomButtonDescAspectRatio = "纵横比"
    override val roomButtonDescSharedPlaylist = "共享播放列表"
    override val roomButtonDescAudioTracks = "音频轨道"
    override val roomButtonDescSubtitleTracks = "字幕轨道"
    override val roomButtonDescRewind = "倒带"
    override val roomButtonDescToggle = "。"
    override val roomButtonDescPlay = "播放"
    override val roomButtonDescPause = "暂停"
    override val roomButtonDescFfwd = "快进"
    override val roomButtonDescAdd = "添加媒体文件"
    override val roomButtonDescLock = "触摸锁定"
    override val roomButtonDescMore = "更多设置"
    override val roomAddmediaOffline = "来自手机存储"
    override val roomAddmediaOnline = "来自网络URL"
    override val roomAddmediaOnlineUrl = "URL地址"
    override val roomSkipMinuteAndHalfButton = "跳过1分钟30秒"
    override val roomOverflowTitle = "更多选项..."
    override val roomOverflowPip = "画中画模式"
    override val roomOverflowMsghistory = "聊天记录"
    override val roomOverflowToggleNightmode = "切换夜间模式"
    override val roomOverflowLeaveRoom = "离开房间"
    override val roomCardTitleUserInfo = "用户信息"
    override val roomCardTitleInRoomPrefs = "房间偏好设置"

    override val mediaDirectories = "共享播放列表的媒体目录"
    override val mediaDirectoriesBrief = "Syncplay将搜索您在这里指定的任何媒体目录，以便找到共享播放列表正在播放视频的名称. 如果指定较小的文件目录会更好，因为搜索操作可能会受限并非常慢."
    override val mediaDirectoriesSettingSummary = "Syncplay将搜索您在这里指定的任何媒体目录，以便找到共享播放列表正在播放视频的名称."
    override val mediaDirectoriesSave = "保存&退出"
    override val mediaDirectoriesClearAll = "全部清除"
    override val mediaDirectoriesClearAllConfirm = "你确定要清除列表吗 ?"
    override val mediaDirectoriesAddFolder = "添加文件夹"
    override val mediaDirectoriesDelete = "从列表中删除"
    override val mediaDirectoriesShowFullPath = "显示全部选项"

    override val settingsCategGeneral = "常规"
    override val settingsCategExoplayer = "Exoplayer"
    override val settingsCategLanguage = "语言"
    override val settingsCategSyncing = "同步"
    override val settingsCategNetwork = "网络"
    override val settingsCategAdvanced = "高级"
    override val uisettingCategChatColors = "聊天颜色"
    override val uisettingCategChatProperties = "聊天属性"
    override val uisettingCategPlayerSettings = "视频播放器设置"

    override val settingNightModeTitle = "夜间模式"
    override val settingNightModeSummary = "选择夜间模式的行为。"
    override val settingRememberJoinInfoTitle = "记住加入过的服务器"
    override val settingRememberJoinInfoSummary = "默认启用. 这将允许SyncPlay保存你最后的用户名, 房间名, 以及你最后一次使用的Syncplay服务器."
    override val settingEraseShortcutsTitle = "删除所有主屏幕快捷方式"
    override val settingEraseShortcutsSummary = "这将删除您通过主屏幕创建的所有“快速运行”主屏幕快捷方式，以保存您的房间配置。"
    override val settingEraseShortcutsDialog = "您真的要删除所有现有的快捷方式吗？"
    override val settingDisplayLanguageTitle = "显示语言"
    override val settingDisplayLanguageSummry = "选择Syncplay所显示的语言."
    override val settingDisplayLanguageToast = "改变语言. 重启app使设置生效."
    override val settingAudioDefaultLanguageTitle = "首选音频语言"
    override val settingAudioDefaultLanguageSummry = "设置自动加载您在此处设置的语言代码的音频轨道。" +
            "例如，英语代码是'en-US'，日语是'ja-JP'。请谷歌'IETF BCP 47 codes'以获取更多信息。"
    override val settingCcDefaultLanguageTitle = "首选字幕语言"
    override val settingCcDefaultLanguageSummry = "设置自动加载您在此处设置的语言代码的字幕轨道。" +
            "例如，英语代码是'en-US'，日语是'ja-JP'。请谷歌'IETF BCP 47 codes'以获取更多信息。"
    override val settingUseBufferTitle = "使用自定义缓冲区大小"
    override val settingUseBufferSummary = "如果您对播放器在播放前和播放期间的视频加载时间不满意, 您可以使用自定义缓冲区大小 (使用风险自负)."
    override val settingMaxBufferTitle = "自定义最大缓冲区大小"
    override val settingMaxBufferSummary = "默认为 50 (50000 毫秒). 这决定了开始播放视频之前的最大缓冲区大小. 如果你不知道这是什么, 不要更改."
    override val settingMinBufferSummary = "默认为 15 (15000 毫秒). 降低这个值以更快地播放视频，但有可能播放器会失败甚至崩溃。改变，风险自负."
    override val settingMinBufferTitle = "自定义最小缓冲区大小"
    override val settingPlaybackBufferSummary = "默认为 2500 毫秒. 这表示寻求或取消暂停视频时的缓冲区大小. 整改这个，如果你不满意的小延迟寻求视频."
    override val settingPlaybackBufferTitle = "自定义播放缓冲区大小 (ms)"
    override val settingReadyFirsthandSummary = "如果您想在进入房间后自动设置为准备好，请启用此选项."
    override val settingReadyFirsthandTitle = "自动将我设为已准备"
    override val settingRewindThresholdSummary = "进度过快时,倒退视频与其他人同步."
    override val settingRewindThresholdTitle = "倒退阈值"
    override val settingTlsSummary = "如果服务器支持TLS安全连接, Android将尝试通过TLS连接到它。(未提供)"
    override val settingTlsTitle = "使用安全连接(TLSv1.3)[即将推出]"
    override val settingResetdefaultTitle = "调回默认设置"
    override val settingResetdefaultSummary = "将所有内容重置为默认值(推荐)"
    override val settingResetdefaultDialog = "确定清除此屏幕的设置吗？"
    override val settingPauseIfSomeoneLeftTitle = "如果有人离开，暂停"
    override val settingPauseIfSomeoneLeftSummary = "如果你想要播放暂停/停止，如果有人离开房间，而你正在观看，启用此功能."
    override val settingWarnFileMismatchTitle = "播放的视频文件不匹配时警告"
    override val settingWarnFileMismatchSummary = "默认为开启. 如果加载的文件与组中的用户不同(根据名称、持续时间或大小，而不是全部)，则会发出警告。."
    override val settingFileinfoBehaviourNameTitle = "是否共享文件名"
    override val settingFileinfoBehaviourNameSummary = "选择将添加的媒体文件名共享其他用户."
    override val settingFileinfoBehaviourSizeTitle = "是否共享文件大小"
    override val settingFileinfoBehaviourSizeSummary = "选择向其他用户共享显示添加的媒体文件大小."

    override val uisettingCategMpv = "mpv"
    override val uisettingMpvHardwareAccelerationTitle = "硬件加速"
    override val uisettingMpvHardwareAccelerationSummary = "禁用此选项以使用软件加速替代。"
    override val uisettingMpvGpunextTitle = "使用 gpu-next"
    override val uisettingMpvGpunextSummary = "强制 mpv 使用全新的基于 libplacebo 的视频渲染后端。"
    override val uiSettingMpvDebugTitle = "启用调试"
    override val uiSettingMpvDebugSummary = "显示调试信息。"
    override val uiSettingMpvInterpolationTitle = "帧率插值"
    override val uiSettingMpvInterpolationSummary = "通过启用帧率插值减少抖动。在某些情况下可能效果不佳。"

    override val uisettingApply = "应用"
    override val uisettingTimestampSummary = "禁用此选项可以隐藏聊天消息开头的时间戳."
    override val uisettingTimestampTitle = "是否开启时间戳"
    override val uisettingMsgoutlineSummary = "启用此选项，为聊天消息添加轮廓，减少与背景视频的混合。"
    override val uisettingMsgoutlineTitle = "聊天消息轮廓"
    override val uisettingMsgshadowSummary = "启用此选项，为聊天消息添加阴影，减少与背景视频的混合。"
    override val uisettingMsgshadowTitle = "聊天消息阴影"
    override val uisettingMsgboxactionSummary = "启用时，点击键盘上的“OK”按钮将发送消息。禁用时，将仅关闭键盘而不执行任何操作。"
    override val uisettingMsgboxactionTitle = "键盘的OK按钮功能"
    override val uisettingOverviewAlphaSummary = "默认值为30(几乎透明), 如果你想增加房间细节面板的不透明度，请更改此选项."
    override val uisettingOverviewAlphaTitle = "房间细节背景不透明度"
    override val uisettingMessageryAlphaSummary = "默认为 0 (透明的). 最大为 255 (100% 不透明). 通过使背景更加不透明来增加消息的可读性."
    override val uisettingMessageryAlphaTitle = "消息不透明度"
    override val uisettingMsgsizeSummary = "更改消息文本大小.默认的是11."
    override val uisettingMsgsizeTitle = "消息字体大小"
    override val uisettingMsgcountSummary = "默认为12. 将消息数计数限制为此值."
    override val uisettingMsgcountTitle = "消息最大数量"
    override val uisettingMsglifeSummary = "当收到聊天信息或房间信息时，它将在下面设置的时间内慢慢消失."
    override val uisettingMsglifeTitle = "聊天消息显示时长"
    override val uisettingTimestampColorSummary = "自定义消息时间戳的文本颜色(默认为粉红色)"
    override val uisettingTimestampColorTitle = "短信时间戳文字颜色"
    override val uisettingSelfColorSummary = "自定义名称标签的文本颜色(默认为红色)"
    override val uisettingSelfColorTitle = "自我标签颜色"
    override val uisettingFriendColorSummary = "自定义朋友姓名标签的文本颜色(默认为蓝色)"
    override val uisettingFriendColorTitle = "朋友标签文字颜色"
    override val uisettingSystemColorSummary = "自定义系统房间信息的文字颜色(默认为白色)"
    override val uisettingSystemColorTitle = "系统消息文本颜色"
    override val uisettingHumanColorSummary = "自定义用户消息的文本颜色(默认为白色)"
    override val uisettingHumanColorTitle = "用户信息文字颜色"
    override val uisettingErrorColorSummary = "自定义错误消息的文本颜色（默认为红色）"
    override val uisettingErrorColorTitle = "错误消息文本颜色"
    override val uisettingResetdefaultSummary = "将上面所有设置重置为默认设置."
    override val uisettingResetdefaultTitle = "重置为默认设置"
    override val uisettingSubtitleSizeSummary = "默认为 18. 这将改变字幕的大小."
    override val uisettingSubtitleSizeTitle = "字幕大小"
    override val uisettingSubtitleDelaySummary = "默认为0。这将延迟或提前字幕轨道。使用负值来提前它。"
    override val uisettingSubtitleDelayTitle = "字幕延迟（毫秒）"
    override val uisettingAudioDelaySummary = "默认为0。这将延迟或提前音频轨道。使用负值来提前它。"
    override val uisettingAudioDelayTitle = "音频轨道延迟（毫秒）"
    override val uisettingSeekForwardJumpSummary = "指定向前跳过多少秒。默认为10秒。"
    override val uisettingSeekForwardJumpTitle = "向前跳转量（秒）"
    override val uisettingSeekBackwardJumpSummary = "指定向后倒带多少秒。默认为10秒。"
    override val uisettingSeekBackwardJumpTitle = "向后跳转量（秒）"
    override val uisettingPipSummary = "在最小化应用时播放器是否应进入窗口化画中画模式。默认为true。"
    override val uisettingPipTitle = "画中画模式"
    override val uisettingReconnectIntervalSummary = "每次连接或断开连接失败时等待多少秒进行重新连接。默认为2秒。"
    override val uisettingReconnectIntervalTitle = "重新连接间隔"
    override val settingFileinfoBehaviorA = "反馈信息"
    override val settingFileinfoBehaviorB = "发送方式"
    override val settingFileinfoBehaviorC = "取消发送"

    override val settingNetworkEngineTitle = "网络引擎"
    override val settingNetworkEngineSummary = "网络引擎是连接的基础。尝试每个选项并选择最适合您需求的稳定性。"
    override val settingNetworkEngineNetty = "Netty（推荐）"
    override val settingNetworkEngineSwiftNIO = "SwiftNIO（实验性）"
    override val settingNetworkEngineKtor = "Ktor（实验性）"

}