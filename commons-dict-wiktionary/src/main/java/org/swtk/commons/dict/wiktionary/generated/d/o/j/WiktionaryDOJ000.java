package org.swtk.commons.dict.wiktionary.generated.d.o.j;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDOJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dojo", "{\"term\":\"dojo\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\", \"Japanese\", \"late middle chinese\"], \"text\":\"From Japanese {{l|ja|道場|tr\u003d\u0027dōjō\u0027 どうじょう}}, from Late middle chinese 道場 (\u0027dáu-ɖjang\u0027 \u0026quot;Buddhist or Daoist temple study hall\u0026quot;), from 道 (\u0026quot;Way\u0026quot;) + 場 (\u0026quot;place\u0026quot;, \u0026quot;grounds\u0026quot;) (compare Mandarin chinese \u0027dàochǎng\u0027 道场).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A training facility, usually led by one or more sensei\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }