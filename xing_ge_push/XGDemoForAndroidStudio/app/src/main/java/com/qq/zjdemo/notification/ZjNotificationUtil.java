//package com.qq.zjdemo.notification;
//
//
//import android.app.Notification;
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.Context;
//import android.content.Intent;
//import android.graphics.BitmapFactory;
//import android.net.Uri;
//
//
//import com.qq.zjdemo.R;
//
//public class ZjNotificationUtil {
//
//
//    public static void showActivityNotification(Context context, String title, String content, Class activity) {
//
//        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
//        /**
//         * 通知配置
//         */
//        NotificationCompat.Builder notifyBuilder =
//                (NotificationCompat.Builder) new NotificationCompat.Builder(context)
//                        .setSmallIcon(R.mipmap.ic_launcher)//顶部状态栏小图标
//                        .setTicker(content)//顶部状态栏文字
//                        .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher))//下拉通知栏图标
//                        .setContentTitle(title)//下拉通知栏标题
//                        .setContentText(content)//下拉通知栏文字
//                        // 点击消失
//                        .setAutoCancel(true)
//                        // 设置该通知优先级
//                        .setPriority(Notification.PRIORITY_MAX)
//                        // 通知首次出现在通知栏，带上升动画效果的
//                        .setWhen(System.currentTimeMillis())
//                        // 通知产生的时间，会在通知信息里显示
//                        // 向通知添加声音、闪灯和振动效果的最简单、最一致的方式是使用当前的用户默认设置，使用defaults属性，可以组合：
//                        .setDefaults(Notification.DEFAULT_VIBRATE | Notification.DEFAULT_ALL | Notification.DEFAULT_SOUND);
//
//        /**
//         * 页面跳转
//         */
//        // Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.csdn.net/itachi85/"));
//        Intent mIntent = new Intent(context, activity);
//        PendingIntent resultPendingIntent = PendingIntent.getActivity(context, 0, mIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        notifyBuilder.setContentIntent(resultPendingIntent);
//
//
//        notificationManager.notify(3, notifyBuilder.build());
//
//    }
//
//
//    public static void showUriNotification(Context context, String title, String content, String uri) {
//
//        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
//        /**
//         * 通知配置
//         */
//        NotificationCompat.Builder notifyBuilder =
//                (NotificationCompat.Builder) new NotificationCompat.Builder(context)
//                        .setSmallIcon(R.mipmap.ic_launcher)//顶部状态栏小图标
//                        .setTicker(content)//顶部状态栏文字
//                        .setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher))//下拉通知栏图标
//                        .setContentTitle(title)//下拉通知栏标题
//                        .setContentText(content)//下拉通知栏文字
//                        // 点击消失
//                        .setAutoCancel(true)
//                        // 设置该通知优先级
//                        .setPriority(Notification.PRIORITY_MAX)
//                        // 通知首次出现在通知栏，带上升动画效果的
//                        .setWhen(System.currentTimeMillis())
//                        // 通知产生的时间，会在通知信息里显示
//                        // 向通知添加声音、闪灯和振动效果的最简单、最一致的方式是使用当前的用户默认设置，使用defaults属性，可以组合：
//                        .setDefaults(Notification.DEFAULT_VIBRATE | Notification.DEFAULT_ALL | Notification.DEFAULT_SOUND);
//
//        /**
//         * 页面跳转
//         */
//        Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
//
//        PendingIntent resultPendingIntent = PendingIntent.getActivity(context, 0, mIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        notifyBuilder.setContentIntent(resultPendingIntent);
//
//
//        notificationManager.notify(3, notifyBuilder.build());
//
//    }
//}
