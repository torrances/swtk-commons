package org.swtk.commons.dict.wiktionary.generated.e.u.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEUS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eustace", "{\"term\":\"eustace\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"From the Old french (842-ca. 1400) form of Late Greek {{m|grc|εὐστάθιος||steadfast, stable}} or {{m|grc|εὔστᾰχῠς||fruitful}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1953\u0027\u0027, w:C. S. C. S. Lewis, \u0027The Silver Chair\u0027, Chapter 1\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"His name unfortunately was \u0027\u0027Eustace\u0027\u0027 Scrubb, but he wasn’t a bad sort\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"ibid., Chapter 3\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"‘The boy’s \u0027\u0027Eustace\u0027\u0027, my lord’, hooted the Owl as loud as it could. ‘Useless?’ said the Dwarf irritably. ‘I dare say he is. Is that any reason for bringing him to court? Hey?’ ‘Not useless’, said the Owl. ‘\u0027\u0027EUSTACE\u0027\u0027’. ‘Used to it, is he? I don’t know what you’re talking about, I’m sure. […\", \"priority\":4}]}, \"synonyms\":{}}");

	add("eustasy", "{\"term\":\"eustasy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027εὖ\u0027 (well, good) + Ancient greek (to 1453) \u0027στάσις\u0027 (standing)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a worldwide change in sea level, especially one caused by melting ice\", \"priority\":1}]}, \"synonyms\":{}}");

	add("eustatism", "{\"term\":\"eustatism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Worldwide changes in sea level, caused by the melting of ice sheets, movements of the ocean floor, sedimentation, etc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("eustress", "{\"term\":\"eustress\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|eu|stress|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A healthful, stimulating kind and level of stress\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }