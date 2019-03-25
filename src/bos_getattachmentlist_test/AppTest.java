package bos_getattachmentlist_test;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import bos_getattachmentlist_test.OutputMapping1.GetListValues;



public class AppTest {

	public static void main(String[] args) {
		BOSGetAttachmentListTestService bos=new BOSGetAttachmentListTestService();
		PortPortType portSoap = bos.getPortSoap();
		//Iterator<QName> List = bos.getPorts();
		
		List<GetListValues> List = portSoap.getAttachmentList("'Request ID' = \"000000000001708\"","","");
		for (GetListValues g : List) {
			System.out.println(g.getCActAttachmentAttachmentName());
			System.out.println(g.getCChrAttachmentName());
			System.out.println(g.getRequestID());
			System.out.println(g.getCActAttachmentAttachmentData());
			System.out.println(g.getCActAttachmentAttachmentOrigSize());
		}
	}

}
