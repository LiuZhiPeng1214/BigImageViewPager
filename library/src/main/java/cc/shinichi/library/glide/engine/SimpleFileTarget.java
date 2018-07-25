package cc.shinichi.library.glide.engine;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;

import java.io.File;

import cc.shinichi.library.tool.Print;

/**
 * @author 工藤
 * @email gougou@16fan.com
 * com.fan16.cn.loader.glide.engine
 * create at 2018/5/17  13:39
 * description:SimpleFileTarget
 */
public class SimpleFileTarget implements Target<File> {
	private static final String TAG = "SimpleFileTarget";
	@Override
	public void onLoadStarted(@Nullable Drawable placeholder) {
        Print.d(TAG, "onLoadStarted");
	}

	@Override
	public void onLoadFailed(@Nullable Drawable errorDrawable) {
        Print.d(TAG, "onLoadFailed");
	}

	@Override
	public void onResourceReady(@NonNull File resource, @Nullable Transition<? super File> transition) {
        Print.d(TAG, "onResourceReady " + resource.getAbsolutePath());
	}

	@Override
	public void onLoadCleared(@Nullable Drawable placeholder) {

	}

	@Override
	public void getSize(@NonNull SizeReadyCallback cb) {
        cb.onSizeReady(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL);
	}

	@Override
	public void removeCallback(@NonNull SizeReadyCallback cb) {

	}

	@Override
	public void setRequest(@Nullable Request request) {

	}

	@Nullable
	@Override
	public Request getRequest() {
		return null;
	}

	@Override
	public void onStart() {

	}

	@Override
	public void onStop() {

	}

	@Override
	public void onDestroy() {

	}

//	private static final String TAG = "SimpleFileTarget";
//
//	@Override public void onLoadStarted(Drawable placeholder) {
//		Print.d(TAG, "onLoadStarted");
//	}
//
//	@Override public void onLoadFailed(Exception e, Drawable errorDrawable) {
//		if (e != null) {
//			Print.d(TAG, "onLoadFailed e--->" + e.toString());
//		} else {
//			Print.d(TAG, "onLoadFailed");
//		}
//	}
//
//	@Override public void onResourceReady(File resource, GlideAnimation<? super File> glideAnimation) {
//		Print.d(TAG, "onResourceReady " + resource.getAbsolutePath());
//	}
//
//	@Override public void onLoadCleared(Drawable placeholder) {
//
//	}
//
//	@Override public void getSize(SizeReadyCallback cb) {
//		cb.onSizeReady(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL);
//	}
//
//	@Override public void setRequest(Request request) {
//
//	}
//
//	@Override public Request getRequest() {
//		return null;
//	}
//
//	@Override public void onStart() {
//
//	}
//
//	@Override public void onStop() {
//
//	}
//
//	@Override public void onDestroy() {
//
//	}
}