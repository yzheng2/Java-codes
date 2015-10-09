package junit.test;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

public class ItcastClassPathXMLApplicationContext {
	private List<BeanDefinition> beanDefines = new ArrayList<BeanDefinition>();
	private Map<String, Object> sigletons = new HashMap<String, Object>();
	
	public ItcastClassPathXMLApplicationContext(String filename){
		this.readXML(filename);
		this.instanceBeans();
	}

	private void instanceBeans() {
		// TODO Auto-generated method stub
		for(BeanDefinition beanDefinition : beanDefines){
				try {
					if(beanDefinition.getClassName() != null && !"".equals(beanDefinition.getClassName().trim()))
					sigletons.put(beanDefinition.getId(), Class.forName(beanDefinition.getClassName()).newInstance());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	private void readXML(String filename) {
		// TODO Auto-generated method stub
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try{
			URL xmlpath = this.getClass().getClassLoader().getResource(filename);
			document = saxReader.read(xmlpath);
			Map<String, String> nsMap = new HashMap<String, String>();
			nsMap.put("ns","http://www.springframework.org/scema/beans");
			XPath xsub = document.createXPath("//ns:beans/ns:bean");
			xsub.setNamespaceURIs(nsMap);
			List<Element> beans = xsub.selectNodes(document);
			for(Element element: beans){
				String id = element.attributeValue("id");
				String clazz = element.attributeValue("class");
				BeanDefinition beanDefine = new BeanDefinition(id, clazz);
				beanDefines.add(beanDefine);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Object getBean(String beanName){
		return this.sigletons.get(beanName);
	}
	
	
}
