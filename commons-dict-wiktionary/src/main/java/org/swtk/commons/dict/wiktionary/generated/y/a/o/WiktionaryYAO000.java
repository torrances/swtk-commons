package org.swtk.commons.dict.wiktionary.generated.y.a.o;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYAO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yaoi", "{\"term\":\"yaoi\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027やおい\u0027 an acronym of \u0027\u0027\u0027Ya\u0027\u0027ma nashi, \u0027\u0027o\u0027\u0027chi nashi, \u0027\u0027i\u0027\u0027mi nashi\u0027 ({{l|ja|ヤマなし、オチなし、意味なし}}), \u0026quot;no climax, no point, no meaning\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of hentai involving two or more males in a homosexual relationship, primarily intended for a female audience\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A narrative or visual work featuring a romance or sexual relationship between two or more males, primarily intended for a female audience\", \"priority\":2}]}, \"synonyms\":{}}");

	add("yaourt", "{\"term\":\"yaourt\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Turkish\"], \"text\":\"Turkish \u0027yōghurt\u0027 \u0026lt;ref\u0026gt;Oxford English Dictionary. 1989.\u0026lt;/ref\u0026gt;, \u0027yoğurt\u0027 \u0026lt;ref\u0026gt;[http://dictionary.reference.com/browse/yaourt \u0026quot;yaourt.\u0026quot;] Dictionary.com. \u0027Dictionary.com Unabridged (v 1.1).\u0027 Random House, Inc. 2008.\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A liquor fermented from milk, originally by the Turks\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }