
## 目录

```toc
```

## 一、标题

使用 # ，表示 1-6级 标题。

在#后跟空格然后写文字。

示例代码

```markdown
# 一级标题
## 二级标题
### 三级标题
```

效果如下

# 一级标题
## 二级标题
### 三级标题

---

## 二、字体

+ **加粗**

加粗的文字使用**在两边包起来

+ **斜体**

倾斜的文字使用*在两边包起来

+ **斜体加粗**

斜体加粗的文字使用***在两边包起来

+ **删除线**

删除线的文字使用~~在两边包起来

```markdown
**加粗**
*倾斜*
***斜体加粗***
~~删除线~~
```
效果如下：

**加粗**
*倾斜*
***斜体加粗***
~~删除线~~

---

## 三、引用

在引用的文字前加>符号

```markdown
>这是引用
>>这是引用
```

效果如下：

>这是引用
>>这是引用

---

## 四、分割线

三个以上的-或者*

```markdown
---
***
```

效果如下:

---
***


## 五、图片

插入图片有三种方式

+ 插入本地图片

+ 插入网络图片

+ 把图片转化为markdown文件

插入本地文件语法：

```markdown
![图片alt](本地地址 "图片title")
图片alt 是图片无法访问时显示的文字
本地地址可以是相对地址也可以是绝对地址
图片title 是图片的标题，当鼠标移上去的时候显示的文字，可以省略
```
示例：

```markdown
![恒星图片](/恒星.jpg "恒星")
```
![恒星图片](/恒星.jpg "恒星")


插入网络语法：

```markdown
![图片alt](网络地址 "图片title")
图片alt 是图片无法访问时显示的文字
图片title 是图片的标题，当鼠标移上去的时候显示的文字，可以省略
```
示例：

```markdown
![恒星图片](https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4072139754,12223702&fm=26&gp=0.jpg "恒星")
```
![恒星图片](https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4072139754,12223702&fm=26&gp=0.jpg "恒星")

把图片转换为md文件:

```markdown
![avatar](data:image/png;base64,iVBORw0......)
```
---

## 六、超链接

语法：

```markdown
[超链接名](超链接地址 "超链接title")
title是当鼠标移上去的时候显示的文字
```

示例：

```markdown
[百度](http://www.baidu.com "百度一下")
要加前面的协议
```

[百度](http://www.baidu.com "百度一下")

---

## 七、列表

+ **无序列表**

语法： 使用 +-* 三种符号

```markdown
- 无序列表
+ 无序列表
* 无序列表
```

示例：

+ 无序列表
- 无序列表
* 无序列表

+ **有序列表**

语法：

数字加点

```markdown
1. 有序列表
2. 有序列表
3. 有序列表
```

示例：

1. 有序列表
2. 有序列表
3. 有序列表

+ **列表嵌套**

下一级前多加三个空格

+ 一级列表
   + 二级列表
      + 三级列表

---

## 八、表格

语法：

```markdown
表头|表头|表头
---|:--:|---:
内容|内容|内容

第二行分割表头和内容
文字默认居左
两边加:表示居中
右边加:表示居右
```

效果如下:

表头|表头|表头
---|:--:|---:
内容|内容|内容
内容居左|内容居中|内容居右

---

## 九、代码

+ **单行代码**

语法：

使用反引号将代码包起来

```markdown
`代码内容`
```

示例：`代码内容`

+ **代码块**

语法：

使用三个反引号把代码包起来，两边的反引号单独占一行。第一个反引号后面可以加代码类型。

```markdown
(```markdown)
代码
(```)
```

示例：

```markdown
代码
```

---

## 十、流程图

语法：

```markdown
(```flow)
st=>start: 开始
op=>operation: My operation
cond=>condition: Yes or No?
e=>end
st->op->cond
cond(yes)->e
cond(no)->op
(&```)
```

效果如下：

```flow
st=>start: 开始
op=>operation: My operation
cond=>condition: Yes or No?
e=>end: 结束
st->op->cond
cond(yes)->e
cond(no)->op
```

---

## 十一、脚注

语法：

使用 `[^脚注代号]`使用脚注

使用 `[^脚注代号]`：脚注内容 声明脚注

```
鲁迅原名是什么[^1] ，浙江哪里人[^2]

<!-- 这里是变量区域 -->
[^1]: 周树人 [^2]: 绍兴人
```

鲁迅原名是什么[^1] ，浙江哪里人[^2]

<!-- 这里是变量区域 -->
[^1]: 周树人 
[^2]: 绍兴人

## 十二、键盘文本

语法：

`<kbd> 键盘 </kbd>`

效果：

<kbd> 键盘 </kbd>


## 十三、Emoji符号

语法：

使用<kbd>:</kbd>包裹，里面是**Emoji**的文本

示例 `:smile:`




