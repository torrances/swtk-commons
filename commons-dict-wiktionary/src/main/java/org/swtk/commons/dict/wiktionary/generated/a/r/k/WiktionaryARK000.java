package org.swtk.commons.dict.wiktionary.generated.a.r.k;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryARK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("arkansas", "{\"term\":\"arkansas\", \"etymology\":{\"influencers\":[], \"languages\":[\"dakota\", \"English\", \"French\", \"lakota\", \"quapaw\"], \"text\":\"From the name of the {{w|Arkansas River}}, from French {{m|fr|Arcansas}}, a (plural) designation of either a Siouan tribe or the Quapaw.\u0026lt;ref name\u003d\u0026quot;Bright\u0026quot;\u0026gt;William Bright, \u0027Native American Placenames of the United States\u0027 (ISBN 0806135980), page 47 (citing personal communication with Robert Rankin)\u0026lt;/ref\u0026gt; This designation is sometimes claimed to derive from a Quapaw word *{{m|qua||akakaze|land of downriver people}} or a Lakota Dakota word *{{m|und||akakaze|people of the south wind}}; more likely, it derives from a Siouan ethnonym cognate to {{m|en|Kansa}} (whence also the name of the state of {{m|en|Kansas}}).\u0026lt;ref name\u003d\u0026quot;Bright\u0026quot;/\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A state of the United States of America. Postal code: AR, capital: Little Rock\", \"priority\":1}]}, \"synonyms\":{}}");

	add("arksutite", "{\"term\":\"arksutite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"chiolite\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }