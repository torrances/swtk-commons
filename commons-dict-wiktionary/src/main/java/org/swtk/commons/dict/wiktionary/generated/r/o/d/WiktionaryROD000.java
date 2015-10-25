package org.swtk.commons.dict.wiktionary.generated.r.o.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryROD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("rodentology", "{\"term\":\"rodentology\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027\u0027roden. Latin|rodens\u0027\u0027, \u0026quot;gnawing\u0026quot;, + Ancient greek (to 1453) {{l|grc|λογία}} (logia) \u0026quot;the study of\u0026quot;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study or science of rodents\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rodlet", "{\"term\":\"rodlet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|rod|let|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any small rod, or rod-shaped structure\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1972\u0027\u0027, Vladimir Nabokov, \u0027Transparent Things\u0027, McGraw-Hill 1972, p. 7\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"It issues in one continuous appetizing \u0027\u0027rodlet\u0027\u0027 [...], which looks as if it retained the shape of an earthworm\u0027s tract (but watch, watch, do not be deflected\", \"priority\":3}]}, \"synonyms\":{}}");

	add("rodney", "{\"term\":\"rodney\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Old english (ca. 450-1100) placename \u0027\u0027 (hrōdanīeġ, hrōdanīġ) from Proto-Germanic \u0027Appendix:Proto-Germanic/hrōþiz|*hrōþiz\u0027 (“fame”) and \u0027Appendix:Proto-Germanic/awjō|*awjō\u0027 (“island”).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }