package org.swtk.commons.dict.wiktionary.generated.a.l.v;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryALV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("alveolectomy", "{\"term\":\"alveolectomy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|alveolo|ectomy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the surgical reshaping of the alveolar ridge to facilitate dental prosthesis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("alveolitis", "{\"term\":\"alveolitis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An inflammation of the alveoli in the lungs\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An inflammation of a dental alveolus (tooth socket\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }