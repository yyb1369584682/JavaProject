package knowledge;

/**
 * 实例变量与静态变量的区别
 * 静态变量需要用关键字static修饰，而实例变量不用
 * 实例变量属于某个对象的属性，必须创建实例对象，其中的实例变量才会被分配空间，实例变量才能被使用
 * 静态变量不属于某个实例对象，而是属于类，所以也称为类变量
 * 只要程序加载了字节码，静态变量就会被分配内存空间，静态变量就可以被使用
 * 总之，实例变量必须创建实例对象后才可以被调用，静态变量直接可以用类名来引用
 */
public class StaticDemon {
	//静态变量，用static修饰，无论一个类创建了多少个对象，类只拥有一个类变量
	public static int a = 1;
	//实例变量，不用static修饰
	//实例变量拥有默认值，数值类型变量的默认值是0，布尔类型变量的默认值是true，引用类型默认值是null
	public int b ;
	public static void main(String[] args) {
		//局部变量
		int c = 3;
		System.out.println(StaticDemon.a);
		StaticDemon sd = new StaticDemon();
		System.out.println(sd.b);
//		System.out.println(b);    Non-static field 'b' cannot be referenced from a static context 非静态变量不能在静态方法中直接调用
//		addFunction(); Non-static method 'addFunction(int, int)' cannot be referenced from a static context 非静态方法不能在静态方法代码块中调用
		//非静态方法要与对象关联在一起，必须创建一个对象后，才能在该对象上进行方法调用

	}
	public int addFunction(int a,int b){
		return a+b;
	}
}
/**重载与重写的区别
 * 重载Overload，是指在一个类中，可以存在多个名称相同的方法，但这些方法参数列表不同
 * 重写Override，是指子类和父类存在方法名称相同，参数列表相同的方法，通过子类创建的
 * 实例对象调用方法时，是调用的子类中的方法。这相当于把父类中的方法给完全覆盖掉了
 */

