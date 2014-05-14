package com.pair.jsoper;

import java.lang.reflect.Field;

public class Q05_Visibility {

	public static void main(String[] args) throws Exception {
		Q05_VarStore vs = new Q05_VarStore();

		Class<?> c = Class.forName("com.pair.jsoper.Q05_VarStore");
		Field field = c.getDeclaredField("myPrivateInt");
		field.setAccessible(true);
		int private_via_refl = field.getInt(vs);

		System.out.println("vs.myPublicInt: " + vs.myPublicInt);
		System.out.println("vs.myProtectedInt: " + vs.myProtectedInt);
		System.out.println("vs.myPackageInt: " + vs.myPackageInt);
		System.out.println("vs.myPrivateInt: " + private_via_refl);
		

	}
}
