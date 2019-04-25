# CEventCenter
一个Android事件分发中心库，基于对象池及接口回调实现。实现类似BroadcastReceiver/RxBus/EventBus等的消息事件传递功能，用于在Activity/Fragment/Service之间的消息传递通讯。

### 使用方式，以Activity为例，Fragment/Service同样
```
1.引入eventcenter_lib，implementation project(':eventcenter_lib')；
2.在需要注册监听器的Activity实现I_CEventCenter接口，例：public class MainActivity extends AppCompatActivity implements I_CEventListener {}；
3.重写onCEvent(String topic, int msgCode, int resultCode, Object obj){ } 方法；
4.在需要注册监听器的Activity的onCreate()方法中调用CEventCenter.registerEventListener(I_CEventListener listener, String topic/String[] topics)注册监听器；
5.在需要注册监听器的Activity的onDestroy()方法中调用CEventCenter.unregisterEventListener(I_CEventListener listener, String topic/String[] topics)注销监听器；
6.在需要发布事件的Activity调用CEventCenter.dispatchEvent(CEvent event/ String topic, int msgCode, int resultCode, Object obj)方法发布事件即可。
```  

注：jcenter正在审核中，所以目前可以先通过下载源码方式进行依赖，后续会发布到jcenter上，以gradle方式进行依赖。

## 使用过程中，如果有任何疑问，请联系我。
## 如果该项目对你有用，麻烦star一下哈。。。
## QQ交流群：1015178804，目前是Android IM技术交流群，后续写的文章，也会用此群进行交流。
## 目前准备写的文章如下：
```
1.《开源一个自用的Android IM库，基于Netty+TCP+Protobuf实现》
2.《开源一个自用的Android IM库，基于Netty+WebSocket+Protobuf实现》
3.《开源一个自用的Android IM库，基于Netty+UDP+Protobuf实现》
4.《开源一个自用的Android网络请求库，基于Rxjava+Retrofit实现》
5.《开源一个自用的Android线程池，基于ThreadPoolExecutor实现》
6.《开源一个自用的Android IM UI界面，包含文本、图片、语音、表情、红包等实现》
7.《开源一个自用的Android图片加载库，基于Glide实现》
8.《开源一个自用的Android视频压缩库，基于MediaCodec实现》
9.《开源一个自用的Android视频压缩库，基于ffmpeg实现》
10.《开源一个自用的Android事件分发中心库，基于对象池实现》
```
以上文章没有先后顺序，想到哪就写到哪吧。

## 项目博客地址：
[掘金](https://juejin.im/post/5cbe81f75188250a85160d72)

# License


    Copyright 2019, chenshichao       
  
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at 
 
       http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

