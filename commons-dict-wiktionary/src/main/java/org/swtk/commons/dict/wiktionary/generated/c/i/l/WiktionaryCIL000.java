package org.swtk.commons.dict.wiktionary.generated.c.i.l;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCIL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cilantro", "{\"term\":\"cilantro\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"Latin\"], \"text\":\"From Spanish \u0027cilantro\u0027 from Latin \u0027coriandrum|lang\u003dla\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the leaves of the coriander plant, \u0027Coriandrum sativum\u0027, used as an herb in cooking\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cilicia", "{\"term\":\"cilicia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027cilicia\u0027 from Ancient greek (to 1453) \u0027κιλικία\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an ancient region of south-eastern Asia Minor, famed for cilice — haircloth made from the hair of Cilician goats\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cilistol", "{\"term\":\"cilistol\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular steroid glycoside\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cilium", "{\"term\":\"cilium\", \"etymology\":{\"influencers\":[], \"languages\":[\"Latin\"], \"text\":\"From Proto-indo-european {{m|ine-pro|*ḱel-yo-m}}, which is derived from Proto-indo-european {{m|ine-pro|*ḱel-||to cover}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hairlike organelle projecting from a eukaryotic cell (such as a unicellular organism or one cell of a multicelled organism). These structures serve either for locomotion by moving or as sensors\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }