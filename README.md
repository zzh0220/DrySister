"# DrySister"
应用使用说明-v0.1-22.01.26

1. 各个模块作用说明
    app: 用于打包应用以及负责应用的启动
    common: 基础功能的实现
    launcher： 应用初始化
    login： 登录模块
    pay： 支付模块
    product: 商品展示模块

2. 基础组件
    （1）各个模块之间的activity等的拉起采用ARouter
    （2）界面设计采用LiveDataBus

3. UI说明 
   （1）控件命名规范：采用控件类型_view文件名_控件名
   （2）代码简洁：使用viewBinding代替findViewById
   