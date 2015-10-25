package org.swtk.commons.dict.wiktionary.generated.l.y.n;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLYN000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lynx", "{\"term\":\"lynx\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Middle english (1100-1500) \u0027lynx\u0027 from Latin \u0027lynx\u0027 from Ancient greek (to 1453) \u0027λύγξ\u0027 from Proto-indo-european {{m|ine-pro|*lewk-||white; light; bright}}, because of the cat\u0027s glowing eyes and ability to see in the dark. Replaced Old english (ca. 450-1100) \u0027lox\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several medium-sized wild cats, mostly of the genus \u0027Lynx\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lynching", "{\"term\":\"lynching\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"See \u0027lynch\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Execution of a person by mob action without due process of law, especially by hanging\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The police with difficulty prevented the swaying mass from \u0027\u0027lynching\u0027\u0027 him on the spot.\u0027 \u0026amp;mdash; \u0027\u0027Jerry Stokes\u0027\u0027 by w:Grant Grant Allen\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }