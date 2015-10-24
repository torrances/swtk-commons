package org.swtk.commons.dict.wiktionary.generated.x.m.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryXMA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("xmas", "{\"term\":\"xmas\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"ancient greek (to 1453)\"], \"text\":\"Attested in this form since 1755, and preceded by earlier forms such as \u0027x\u0027temmas\u0027 (1551) and Old english (ca. 450-1100) \u0027χp̃es mæssa\u0027 (1100), from \u0027christmas\u0027 replacing \u0027christ\u0027 by the abbreviation \u0027x\u0027 from Ancient greek (to 1453) \u0027χ\u0027 ((letter chi)) from \u0027χριστός\u0027 (christ) Surface analysis {{suffix|X|mas|t1\u003dChrist|t2\u003dholiday|lang\u003den}}. In popular use since late 19th century. See w:Xmas|Wikipedia for more information.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"but if you won\u0027t come here before \u0027\u0027Xmas\u0027\u0027, I very much fear we shall not meet \u0027here\u0027 at all\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"as well as give the Imperial spree a notice next to reading matter in the \u0027\u0027Xmas\u0027\u0027 issue\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }