package org.swtk.commons.dict.wordnet.index.name.instance.b.r.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBROO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brooch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02909763\"]}");
	add("{\"term\":\"brood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08007266\"]}");
	add("{\"term\":\"brooder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03572246\"]}");
	add("{\"term\":\"brooding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07548995\", \"13462985\"]}");
	add("{\"term\":\"broodmare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02380255\"]}");
	add("{\"term\":\"broody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01795596\"]}");
	add("{\"term\":\"brook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09252316\"]}");
	add("{\"term\":\"brooke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10885577\"]}");
	add("{\"term\":\"brooklet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09252548\"]}");
	add("{\"term\":\"brooklime\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12911445\", \"12911853\"]}");
	add("{\"term\":\"brooklyn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09142754\"]}");
	add("{\"term\":\"brooks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10885677\"]}");
	add("{\"term\":\"brookweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12117080\", \"12117191\"]}");
	add("{\"term\":\"broom\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12254046\", \"12541369\", \"02910059\"]}");
	add("{\"term\":\"broomcorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12159713\"]}");
	add("{\"term\":\"broomstick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02910407\"]}");
	add("{\"term\":\"broomweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11995357\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }