package dessert.ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//Java������ͬһλ�ó�����ͬ��ע��
//@Qualifier("ice")
//@Qualifier("sugar")
//ʹ���Զ����޶�ע�⣬����������Ե��޶�����������
@Ice
@Sugar
public class IceSugar implements Dessert{
	@Override
	public void desc() {
		System.out.println("a icesugar!");
	}
}
