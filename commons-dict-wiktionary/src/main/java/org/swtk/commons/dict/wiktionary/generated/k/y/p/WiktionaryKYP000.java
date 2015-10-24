package org.swtk.commons.dict.wiktionary.generated.k.y.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKYP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kyphosis", "{\"term\":\"kyphosis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027κύφος\u0027 (humpback, bent) + \u0027-osis\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the normal convex curvature of the spine in the thoracic and sacral region\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"an abnormal convex curvature of the spine in the cervical or lumbar regions of the spine\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }