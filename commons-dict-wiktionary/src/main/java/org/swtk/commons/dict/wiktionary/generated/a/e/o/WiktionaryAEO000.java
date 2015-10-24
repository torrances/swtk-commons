package org.swtk.commons.dict.wiktionary.generated.a.e.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAEO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aeolipile", "{\"term\":\"aeolipile\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From French \u0027éolipyle\u0027 from Latin \u0027\u0027 (aeoli pylae)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a steam engine powered by rocket propulsion due to escaping steam; which consists of a pressure vessel mounted on a bearing, with one or more tubes which exhaust steam tangentially to the rotation axis thus creating rotation\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aeolotropy", "{\"term\":\"aeolotropy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|æolo|alt1\u003daeolo|tropy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The phenomenon whereby the physical properties (e.g, electric conductivity, refractive index) of a body depend on the direction in which they are measured\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }