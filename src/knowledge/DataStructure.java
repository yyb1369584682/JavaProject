package knowledge;

import java.util.Scanner;

/**
 * 数据结构常用结构：堆栈，队列，链表，数组
 * 1、堆栈：采用此结构存储元素有如下特点：
 *  （1）元素先进后出，后进先出（弹夹装子弹）
 *  （2）栈的出口与入口都位于栈顶
 *  （3）压栈：就是存元素，即元素存到栈顶位置，栈中已有元素依次向栈底方向移动一个位置
 *  （4）弹栈：就是取元素，即栈顶元素被取出，栈中已有元素都依次向栈顶方向移动一个位置
 * 2、队列：采用此结构存储元素有如下特点：
 * （1）元素先进先出，后进后出（车站过安检）
 * （2）队列一端为入口，另一端为出口
 * 3、数组：采用此结构存储元素有如下特点
 * （1）查找元素快；通过索引，可以快速查找到相应元素
 *  (2)增删元素慢：
 *      a、指定位置增加元素：创建一个新的数组，在指定位置存放该元素，
 *      然后根据原数组索引位置，把各元素存储到相应索引位置上
 *      b、指定位置删除元素：创建一个新的数组，把原数组根据索引位置
 *      复制到新数组中，指定索引位置数组不复制
 * 4、链表：采用此结构存储数据有如下特点：
 * （1）多个节点之间，通过地址进行连接（多人手拉手）
 * （2）元素查找慢：要查找某个元素，需要通过连接节点，依次向后查找指定元素
 * （3）元素增删快：只要修改连接下个节点的地址即可
 * （4）节点由两部分组成：数据域（存储的数值）、指针域（存储的地址）
 * 5、哈希表：链表和数组的结合体，具有两种数据结构的特征
 */
public class DataStructure {

}
