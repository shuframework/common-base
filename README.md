# common-base

不依赖第三方jar,只是对jdk增强。


# 版本：2.1.0-2.1.x(数据结构和排序算法)

## com.shuframework.datastructure

> 数据结构，需要掌握的是list、 map、 queue

**详见 doc/05-数据结构.md**



## com.shuframework.arithmetic

> 算法，主要是排序算法 和 数学计算公式

### sorts 排序算法
  常见的排序算法有 冒泡、快速

### maths 数学计算公式
  常见的计算算法: 排列组合，发红包，随机打乱（洗牌）



# 版本：2.0.0-2.0.x(设计模式)

## com.shuframework.designpattern

> 设计模式23种，需要掌握的是singleton(单例)、 factory(工厂)、 (装饰)、 (代理)、 (适配)

**详见 doc/06-常用设计模式.md**



# 版本：1.2.0-1.2.x(多线程demo)

## com.shuframework.thread

多线程的使用示例
**详见 doc/07-多线程_并发.md**



# 版本：1.1.0-1.1.x(jdkdemo)

## com.shuframework.jdkdemo

### annotations 注解



### classloader 类加载器



### datastructure 数据结构（集合）



### exception 异常



### io io流



### oop 面对对象



### protocol 请求协议 http/tcp/socket



### proxy 代理（动态代理和aop）



###  reflect 反射
  class对象; 常见是对bean的属性进行get/set操作;


###  stream 流
  简化集合的操作


###  time jdk8+的日期
  新加的日期类取代 Date和Calendar



# 版本：1.0.0-1.0.x(基础工具类)

## com.shuframework.commonbase

> constant(常量)、enums(枚举)、exception(异常)、jdbc 、result(结果集) 与工具包(util)平级

> util包添加内容： codec(加密)、collection(集合)、generator(ID生成器)、gps(地图坐标的转换)、io(IO流)、
lang(语言基础包)、random(随机数)、reflect(反射)

不包含 json、protocol、xml，他们在jdkdemo包有例子，线上环境还是用的第三方包。

### codec 加密
  md5、sha1，sha256，base64等

### collection 集合
  collection 包括list、set、queue, map
  (map其实不在collection下, 但是为了方便就放在一起了) 
  
###  generator ID生成器
idworker 是雪花算法
  
###  gps 地图坐标的转换
WGS－84原始坐标系;
GCJ－02坐标系，又名“火星坐标系”;
    高德、Google、腾讯、阿里在国内都是使用GCJ－02坐标系
百度坐标系:bd-09;

###  io IO流
字节流、字符流

###  lang 语言基础包（常用工具类）
  BigDecimalUtil：小数精确计算工具类，加减乘除，保留小数位。
  CodeConvertUtil ： 编码转换
  NumberSystemConvert ：数据进制转换
  DateUtil、DateFormatUtil：jdk7之前的日期工具类，jdk8后用java.time.*包详见jdk8的特性例子。
  StringUtil：字符串工具类

### random 随机数
  RandomUtil：产生随机数，多线程性能低
  SecureRandomUtil：安全性很高的随机数
  ThreadRandomUtil：多线程并发生成随机数

随机数具体文章 http://blog.csdn.net/admin1973/article/details/55095692

###  reflect 反射
  常见是对bean的属性进行get/set操作、bean与map的转换、对象copy

### 其他
  SystemUtil 系统工具类, 主要是生成code;
  ValidateUtil  参数检查
