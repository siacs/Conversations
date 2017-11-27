package eu.siacs.conversations.ui.service;

import android.content.Context;
import android.support.text.emoji.EmojiCompat;

public abstract class AbstractEmojiService {

	protected final Context context;

	public AbstractEmojiService(Context context) {
		this.context = context;
	}

	protected abstract EmojiCompat.Config buildConfig();

	public void init(boolean useBundledEmoji) {
		final EmojiCompat.Config config = buildConfig();
		config.setReplaceAll(useBundledEmoji);
		EmojiCompat.init(config);
	}
}
