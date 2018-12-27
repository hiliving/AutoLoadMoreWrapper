# AutoLoadMoreWrapper[![](https://jitpack.io/v/hiliving/AutoLoadMoreWrapper.svg)](https://jitpack.io/#hiliving/AutoLoadMoreWrapper)
recycleview自动加载更多，超简单调用，装饰器模式无入侵

> ####引入
        
        allprojects {
        		repositories {
        			...
        			maven { url 'https://jitpack.io' }
        		}
        	}
        	
        dependencies {
        	        implementation 'com.github.hiliving:AutoLoadMoreWrapper:Tag'
        	}

> ####用法
        
        LoadMoreWrapper.with(adapter)
                        .setLoadMoreEnabled(true)
                        .setListener(new LoadMoreAdapter.OnLoadMoreListener() {
                            @Override
                            public void onLoadMore(LoadMoreAdapter.Enabled enabled) {
                                testList.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        //TODO 你的请求更多数据的逻辑
                                    }
                                }, 1000);
                            }
                        })
                        .into(testList);