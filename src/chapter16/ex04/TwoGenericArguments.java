package chapter16.ex04;

//제너릭 클래스 : 타입 변수가 2개인 제너릭 클래스
		// T : Type
		// V : Value
		// K : Key
		// N : Number
//제너릭 클래스 : 클래스 이름뒤에 <K, V>타입 변수가 선언이도니 클래스
class KeyValue<K,V>{
	private K Key;
	private V Value;
	
	// getter(필드의 값을 호출) / setter(필드의 값을 입력)
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return Value;
	}
	public void setValue(V value) {
		Value = value;
	}	
}

public class TwoGenericArguments {
	public static void main(String[] args) {
		
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("사과"); kv1.setValue(1000);
		
		//getter 를 사용해서 값 출력
		String key1 = kv1.getKey();
		Integer val1 = kv1.getValue();
		
		System.out.println(key1 + val1);
		System.out.println(kv1.getKey() + " "+ kv1.getValue());
		
		System.out.println("===================================");
		
		//2. <Integer String>
		KeyValue<Integer, String>kv2=new KeyValue<>();
		
		//setter를 사용해서 값 입력
		kv2.setKey(404);
		kv2.setValue("Not Found : 요청한 페이즈를 찾지 못했습니다.");
		
		//getter를 사용해서 값 출력
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		System.out.println("===================================");
		
		//3. <String, Void> <== Void : 해당 필드는 사용하지 않는다.
		KeyValue<String, Void>kv3=new KeyValue<>();
		kv3.setKey("키 값만 사용"); 
		System.out.println(kv3.getKey());
		
		
		
		
		
	}
}
