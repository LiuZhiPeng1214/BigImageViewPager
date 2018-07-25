package cc.shinichi.library.glide.engine;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;

public class WrappingTarget<Z> implements Target<Z> {
	protected final Target<Z> target;

	public WrappingTarget(Target<Z> target) {
		this.target = target;
	}

	@Override public void getSize(SizeReadyCallback cb) {
		if (target != null) target.getSize(cb);
	}

	@Override
	public void removeCallback(@NonNull SizeReadyCallback cb) {

	}

	@Override public void onLoadStarted(Drawable placeholder) {
		if (target != null) target.onLoadStarted(placeholder);
	}

	@Override
	public void onLoadFailed(@Nullable Drawable errorDrawable) {
		if (target != null) {}
	}

	@Override
	public void onResourceReady(@NonNull Z resource, @Nullable Transition<? super Z> transition) {

	}
//	@Override public void onLoadFailed(Exception e, Drawable errorDrawable) {
//		if (target != null) target.onLoadFailed(e, errorDrawable);
//	}
//
//	@Override public void onResourceReady(Z resource, GlideAnimation<? super Z> glideAnimation) {
//		if (target != null) target.onResourceReady(resource, glideAnimation);
//	}

	@Override public void onLoadCleared(Drawable placeholder) {
		if (target != null) target.onLoadCleared(placeholder);
	}

	private Request request;

	@Override public Request getRequest() {
		return request;
	}

	@Override public void setRequest(Request request) {
		this.request = request;
		if (target != null) target.setRequest(request);
	}

	@Override public void onStart() {
		if (target != null) target.onStart();
	}

	@Override public void onStop() {
		if (target != null) target.onStop();
	}

	@Override public void onDestroy() {
		if (target != null) target.onDestroy();
	}
}