# common-base

不依赖第三方jar,只是对jdk增强。

> 添加内容： codec(加密)、collection(集合)、io(IO流)、lang(语言基础包)、random(随机数)、reflect(反射)
  
constant(常量)、enums(枚举)、exception(异常)、result(结果集) 与工具包(util)平级
  
###   codec 加密
  md5、sha1，sha256，base64等

###   collection 集合
  collection 包括list、set、queue,  map
  (map其实不在collection下, 但是为了方便就放在一起了) 
  
###    generator ID生成器
idworker 是雪花算法
  
###    gps 地图坐标的转换
WGS－84原始坐标系;
GCJ－02坐标系，又名“火星坐标系”;
    高德、Google、腾讯、阿里在国内都是使用GCJ－02坐标系
百度坐标系:bd-09;


###    io IO流
字节流、字符流

###    lang 语言基础包（常用工具类）
  BigDecimalUtil：小数精确计算工具类，加减乘除，保留小数位。
  CodeConvertUtil ： 编码转换
  NumberSystemConvert ：数据进制转换
  DateUtil、DateFormatUtil：jdk7之前的日期工具类，jdk8后用java.time.*包详见jdk8的特性例子。
  StringUtil：字符串工具类

###   random 随机数
  RandomUtil：产生随机数，多线程性能低
  SecureRandomUtil：安全性很高的随机数
  ThreadRandomUtil：多线程并发生成随机数

随机数具体文章 http://blog.csdn.net/admin1973/article/details/55095692

###    reflect 反射
  常见是对bean的属性进行get/set操作、bean与map的转换、对象copy

###   其他
  SystemUtil 系统工具类, 主要是生成code;
  ValidateUtil  参数检查
